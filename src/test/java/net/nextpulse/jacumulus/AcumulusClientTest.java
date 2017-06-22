package net.nextpulse.jacumulus;

import net.nextpulse.jacumulus.requests.models.Contract;
import net.nextpulse.jacumulus.requests.models.Customer;
import net.nextpulse.jacumulus.requests.models.Invoice;
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
    Customer customer = new Customer();
    customer.setEmail("test@bar.com");
    Invoice invoice = new Invoice();
    invoice.setNumber("12345");
    customer.setInvoice(invoice);
    AddInvoiceRequest addInvoiceRequest = new AddInvoiceRequest(customer);
    String output = client.serializeRequest(addInvoiceRequest);
    String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><myxml>" +
        "<contract><contractcode>4242</contractcode><password>password</password><username>user</username></contract><testmode>1</testmode>" +
        "<customer><email>test@bar.com</email><invoice><number>12345</number></invoice></customer></myxml>";
    assertEquals(expected, output);
  }
  
}