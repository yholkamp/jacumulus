package net.nextpulse.jacumulus.responses;

import net.nextpulse.jacumulus.models.Invoice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Response for the list invoices request
 *
 * @see <a href="https://apidoc.sielsystems.nl/content/contact-list-incoming-invoices">the api docs for incoming</a>
 * @see <a href="https://apidoc.sielsystems.nl/content/contact-list-outgoing-invoices">the api docs for outgoing</a>
 */
@XmlRootElement(name = "response")
public class ListInvoicesResponse extends AcumulusResponse {
  @XmlElement(name = "contact")
  private List<Invoice> invoices = new ArrayList<Invoice>();
  
  public List<Invoice> getInvoices() {
    return invoices;
  }
  
  public void setInvoices(List<Invoice> invoices) {
    this.invoices = invoices;
  }
}
