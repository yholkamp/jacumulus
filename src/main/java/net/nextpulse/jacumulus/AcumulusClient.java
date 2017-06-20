package net.nextpulse.jacumulus;

import net.nextpulse.jacumulus.models.Contract;
import net.nextpulse.jacumulus.models.Customer;
import net.nextpulse.jacumulus.requests.AcumulusRequest;
import net.nextpulse.jacumulus.requests.AddInvoiceRequest;
import net.nextpulse.jacumulus.requests.ListInvoicesRequest;
import net.nextpulse.jacumulus.responses.InvoiceResponse;
import net.nextpulse.jacumulus.responses.ListInvoicesResponse;
import net.nextpulse.jacumulus.util.LoggingInterceptor;
import net.nextpulse.jacumulus.util.SerializationHelper;
import okhttp3.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Main class of the Acumulus API client. Instantiate the object with your credentials and call the appropriate methods.
 */
public class AcumulusClient {
  
  private static final Logger logger = LogManager.getLogger();
  
  /**
   * HTTP client to use for all API calls
   */
  private static final OkHttpClient httpClient = new OkHttpClient.Builder()
      .addInterceptor(new LoggingInterceptor())
      .build();
  /**
   * API URL to use for all API calls, will be post fixed with the specific api method location.
   */
  private String apiUrl = "https://api.sielsystems.nl/acumulus/stable/";
  
  /**
   * Set to true to pass the testMode attribute to the API.
   */
  private boolean testMode = true;
  /**
   * Contract object to use for request authentication.
   */
  private Contract contract;
  
  /**
   * Constructor for the Acumulus API client, initialized with your API credentials.
   *
   * @param contract credentials to use when contacting the Acumulus API
   */
  public AcumulusClient(Contract contract) {
    this.contract = contract;
  }
  
  /**
   * Adds a Customer if no customer was found using the provided customerId or customer's email address and adds an
   * invoice for this customer.
   *
   * @param customer customer with embedded invoice to add to the system
   * @return InvoiceResponse from the server, containing zero or more errors and warnings
   * @throws JAXBException if the serialization failed for some reason
   * @throws IOException   if there was an error contacting the Acumulus servers
   */
  public InvoiceResponse addInvoice(Customer customer) throws JAXBException, IOException {
    AddInvoiceRequest request = new AddInvoiceRequest(customer);
    return performAndDeserialize("invoices/invoice_add.php", request, InvoiceResponse.class);
  }
  
  /**
   * Lists the incoming invoices for the specified contactId.
   *
   * @param contactId contact to list the invoices for
   * @return ListInvoicesResponse
   * @throws JAXBException if the serialization failed for some reason
   * @throws IOException   if there was an error contacting the Acumulus servers
   */
  public ListInvoicesResponse listIncomingInvoices(String contactId) throws JAXBException, IOException {
    ListInvoicesRequest request = new ListInvoicesRequest(contactId);
    return performAndDeserialize("contacts/contact_invoices_incoming.php", request, ListInvoicesResponse.class);
  }
  
  /**
   * Lists the outgoing invoices for the specified contactId.
   *
   * @param contactId contact to list the invoices for
   * @return ListInvoicesResponse
   * @throws JAXBException if the serialization failed for some reason
   * @throws IOException   if there was an error contacting the Acumulus servers
   */
  public ListInvoicesResponse listOutgoingInvoices(String contactId) throws JAXBException, IOException {
    ListInvoicesRequest request = new ListInvoicesRequest(contactId);
    return performAndDeserialize("contacts/contact_invoices_outgoing.php", request, ListInvoicesResponse.class);
  }
  
  /**
   * Performs a request and deserializes the response.
   *
   * @param path          api path to hit
   * @param request       request object to submit
   * @param responseClass response class
   * @param <T>           type of the response class
   * @return response object returned by the server
   * @throws JAXBException if the serialization failed for some reason
   * @throws IOException   if there was an error contacting the Acumulus servers
   */
  private <T> T performAndDeserialize(String path, AcumulusRequest request, Class<T> responseClass) throws JAXBException, IOException {
    String requestBody = serializeRequest(request);
    String responseString = performRequest(path, requestBody);
    return SerializationHelper.deserializeXml(responseString, responseClass);
  }
  
  /**
   * Internal method that handles performing an API request.
   *
   * @param path        api path to contact
   * @param requestBody
   * @return raw API response body
   * @throws JAXBException if the XML serialization failed
   * @throws IOException   if a network error occurred
   */
  private String performRequest(String path, String requestBody) throws JAXBException, IOException {
    logger.trace("Body: {}", () -> SerializationHelper.formatXml(requestBody));
    RequestBody body = new FormBody.Builder().add("xmlstring", requestBody).build();
    Request request = new Request.Builder()
        .url(apiUrl + path)
        .post(body)
        .build();
    Response response = httpClient.newCall(request).execute();
    ResponseBody responseBody = response.body();
    if(responseBody != null) {
      return responseBody.string();
    } else {
      throw new IOException("Received null body from server");
    }
  }
  
  /**
   * Serializes the provided request to XML.
   *
   * @param xmlRequest object to serialize
   * @return XNK string
   * @throws JAXBException if the serialization failed for any reason
   */
  protected String serializeRequest(AcumulusRequest xmlRequest) throws JAXBException {
    xmlRequest.setContract(contract);
    xmlRequest.setTestMode(testMode ? 1 : 0);
    return SerializationHelper.serializeToXml(xmlRequest);
  }
  
  /**
   * Set the client to test mode, ensuring no actions will result in actual updates of the data.
   *
   * @param testMode set to true to enable test mode, false to disable
   */
  public void setTestMode(boolean testMode) {
    this.testMode = testMode;
  }
  
  /**
   * Changes the API url prefix to use for all API calls
   *
   * @param apiUrl new url to set, including https:// and trailing slash.
   */
  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }
}
