package net.nextpulse.jacumulus;

import net.nextpulse.jacumulus.models.Contract;
import net.nextpulse.jacumulus.models.Customer;
import net.nextpulse.jacumulus.models.Invoice;
import net.nextpulse.jacumulus.requests.AcumulusRequest;
import net.nextpulse.jacumulus.requests.AddInvoiceRequest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yholkamp
 */
public class AcumulusClientTest {
  
  private AcumulusClient client;
  
  @Before
  public void setUp() throws Exception {
    Contract contract = new Contract("4242", "user", "password");
    client = new AcumulusClient(contract);
  }
  
  @Test
  public void serializeRequest() throws Exception {
    AddInvoiceRequest addInvoiceRequest = new AddInvoiceRequest();
    Customer customer = new Customer();
    customer.setEmail("test@bar.com");
    Invoice invoice = new Invoice();
    invoice.setNumber("12345");
    customer.setInvoice(invoice);
    addInvoiceRequest.setCustomer(customer);
    String output = client.serializeRequest(addInvoiceRequest);
    String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><myxml><testmode>1</testmode><contract><contractcode>4242</contractcode><username>user</username><password>password</password></contract>" +
        "<customer><invoice><number>12345</number></invoice><email>test@bar.com</email></customer></myxml>";
    assertEquals(expected, output);
  }
  
}