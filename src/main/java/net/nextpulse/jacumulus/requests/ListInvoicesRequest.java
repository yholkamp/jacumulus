package net.nextpulse.jacumulus.requests;

import javax.xml.bind.annotation.XmlElement;

/**
 * Request to list all invoices for a given contactId
 *
 * @see <a href="https://apidoc.sielsystems.nl/content/contact-list-incoming-invoices">the api docs for incoming</a>
 * @see <a href="https://apidoc.sielsystems.nl/content/contact-list-incoming-invoices">the api docs for outgoing</a>
 */
public class ListInvoicesRequest extends AcumulusRequest {
  
  @XmlElement(name = "contactid")
  private String contactId;
  
  public ListInvoicesRequest(String contactId) {
    this.contactId = contactId;
  }
  
  public String getContactId() {
    return contactId;
  }
  
  public void setContactId(String contactId) {
    this.contactId = contactId;
  }
}
