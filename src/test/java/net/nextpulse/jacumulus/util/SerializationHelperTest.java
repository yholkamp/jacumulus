package net.nextpulse.jacumulus.util;

import net.nextpulse.jacumulus.models.Customer;
import net.nextpulse.jacumulus.requests.AddInvoiceRequest;
import net.nextpulse.jacumulus.responses.InvoiceResponse;
import net.nextpulse.jacumulus.responses.AcumulusResponse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author yholkamp
 */
public class SerializationHelperTest {

  @Test
  public void serializeRequest_addInvoiceResponse() throws Exception {
    AddInvoiceRequest request = new AddInvoiceRequest();
    request.setTestMode(1);
    Customer customer = new Customer();
    customer.setCity("Rotterdam");
    request.setCustomer(customer);

    String serialized = SerializationHelper.serializeToXml(request);
    String expected ="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><myxml><testmode>1</testmode><customer><city>Rotterdam</city></customer></myxml>";
    assertEquals(expected, serialized);
  }
  
  @Test
  public void deserializeRequest() throws Exception {
    String sampleResponse = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
        "<response>\n" +
        "    <invoice>\n" +
        "        <invoicenumber>2018-1234</invoicenumber>\n" +
        "        <token>wasdwasd</token>\n" +
        "        <entryid>2</entryid>\n" +
        "    </invoice>\n" +
        "<warnings>\n" +
        "        <warning>\n" +
        "            <code>42</code>\n" +
        "            <codetag>12312313</codetag>\n" +
        "            <message>Test warning</message>\n" +
        "        </warning>\n" +
        "<countwarnings>1</countwarnings>\n"+
        "</warnings>\n"+
        "</response>";
    
    Object object = SerializationHelper.deserializeXml(sampleResponse, InvoiceResponse.class);
    assertEquals(InvoiceResponse.class, object.getClass());
    AcumulusResponse response = (AcumulusResponse)object;
    assertNull(response.getErrors());
    assertEquals(1, response.getWarnings().size());
    assertEquals("42", response.getWarnings().get(0).getCode());
    assertEquals("12312313", response.getWarnings().get(0).getCodetag());
    assertEquals("Test warning", response.getWarnings().get(0).getMessage());
  }
  
}
