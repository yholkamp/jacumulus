package net.nextpulse.jacumulus.util;

import net.nextpulse.jacumulus.requests.AddInvoiceRequest;
import net.nextpulse.jacumulus.requests.models.Customer;
import net.nextpulse.jacumulus.requests.models.PaymentStatus;
import net.nextpulse.jacumulus.responses.AcumulusResponse;
import net.nextpulse.jacumulus.responses.InvoiceResponse;
import net.nextpulse.jacumulus.responses.ListContactsResponse;
import net.nextpulse.jacumulus.responses.ListInvoicesResponse;
import net.nextpulse.jacumulus.responses.models.Contact;
import net.nextpulse.jacumulus.responses.models.Invoice;
import org.apache.commons.io.IOUtils;
import org.joda.time.DateTime;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author yholkamp
 */
public class SerializationHelperTest {
  
  @Test
  public void serializeRequest_addInvoiceResponse() throws Exception {
    Customer customer = new Customer();
    customer.setCity("Rotterdam");
    AddInvoiceRequest request = new AddInvoiceRequest(customer);
    request.setTestMode(1);
    
    String serialized = SerializationHelper.serializeToXml(request);
    String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><myxml><testmode>1</testmode><customer><city>Rotterdam</city></customer></myxml>";
    assertEquals(expected, serialized);
  }
  
  @Test
  public void deserializeResponse_addInvoice() throws Exception {
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
        "<countwarnings>1</countwarnings>\n" +
        "</warnings>\n" +
        "</response>";
    
    Object object = SerializationHelper.deserializeXml(sampleResponse, InvoiceResponse.class);
    assertEquals(InvoiceResponse.class, object.getClass());
    AcumulusResponse response = (AcumulusResponse) object;
    assertEquals(0, response.getErrors().size());
    assertEquals(1, response.getWarnings().size());
    assertEquals("42", response.getWarnings().get(0).getCode());
    assertEquals("12312313", response.getWarnings().get(0).getCodetag());
    assertEquals("Test warning", response.getWarnings().get(0).getMessage());
  }
  
  @Test
  public void deserializeResponse_listContacts() throws Exception {
    String xml = IOUtils.toString(
        this.getClass().getResourceAsStream("/responses/listContactsResponse.xml"),
        "UTF-8"
    );
    
    Object object = SerializationHelper.deserializeXml(xml, ListContactsResponse.class);
    assertEquals(ListContactsResponse.class, object.getClass());
    ListContactsResponse response = (ListContactsResponse) object;
    assertTrue(response.getErrors().isEmpty());
    assertEquals(0, response.getWarnings().size());
    assertEquals(2, response.getContacts().size());
    
    Contact contact1 = response.getContacts().get(0);
    assertEquals("1234", contact1.getContactId());
    assertEquals("ContactName1", contact1.getContactName1());
    assertEquals("ContactName2", contact1.getContactName2());
    
    Contact contact2 = response.getContacts().get(1);
    assertEquals("4321", contact2.getContactId());
  }
  
  @Test
  public void deserializeResponse_listInvoices() throws Exception {
    String xml = IOUtils.toString(
        this.getClass().getResourceAsStream("/responses/listInvoiceResponse.xml"),
        "UTF-8"
    );
    
    Object object = SerializationHelper.deserializeXml(xml, ListInvoicesResponse.class);
    assertEquals(ListInvoicesResponse.class, object.getClass());
    ListInvoicesResponse response = (ListInvoicesResponse) object;
    assertTrue(response.getErrors().isEmpty());
    assertTrue(response.getWarnings().isEmpty());
    
    assertEquals(2, response.getInvoices().size());
    
    // validate the properties of the first invoice
    Invoice invoice1 = response.getInvoices().get(0);
    assertEquals("fb45f4c359e3c57af7512baf9a966c51", invoice1.getToken());
    assertEquals("4243", invoice1.getEntryId());
    assertEquals(DateTime.parse("2016-01-15").toDate(), invoice1.getEntryDate());
    assertEquals("fb45f4c359e3c57af7512baf9a966c51", invoice1.getToken());
    assertEquals(PaymentStatus.Paid, invoice1.getPaymentStatus());
    assertEquals("", invoice1.getInvoiceNote());
    assertEquals(new BigDecimal("348.07"), invoice1.getAmount());
    assertEquals("Factuur 20160022", invoice1.getInvoiceDescription());
    assertEquals("20160098", invoice1.getInvoiceNumber());
  }
  
  @Test
  public void deserializeObject() throws Exception {
    String xml = "<invoice>\n" +
        "      <token>fb45f4c359e3c57af7512baf9a966c51</token>\n" +
        "      <entryid>4243</entryid>\n" +
        "      <entrydate>2016-01-15</entrydate>\n" +
        "      <invoicenumber>20160098</invoicenumber>\n" +
        "      <invoicenote/>\n" +
        "      <invoicedescription>Factuur 20160022</invoicedescription>\n" +
        "      <paymentstatus>2</paymentstatus>\n" +
        "      <amount>348.07</amount>\n" +
        "    </invoice>";
    Object object = SerializationHelper.deserializeXml(xml, Invoice.class);
    Invoice invoice1 = (Invoice) object;
    assertEquals(Invoice.class, object.getClass());
    assertEquals("fb45f4c359e3c57af7512baf9a966c51", invoice1.getToken());
    assertEquals("4243", invoice1.getEntryId());
    assertEquals(DateTime.parse("2016-01-15").toDate(), invoice1.getEntryDate());
    assertEquals("fb45f4c359e3c57af7512baf9a966c51", invoice1.getToken());
    assertEquals(PaymentStatus.Paid, invoice1.getPaymentStatus());
    assertEquals("", invoice1.getInvoiceNote());
    assertEquals(new BigDecimal("348.07"), invoice1.getAmount());
    assertEquals("Factuur 20160022", invoice1.getInvoiceDescription());
    assertEquals("20160098", invoice1.getInvoiceNumber());
  }
}
