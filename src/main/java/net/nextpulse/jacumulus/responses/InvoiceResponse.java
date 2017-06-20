package net.nextpulse.jacumulus.responses;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Response returned by the API as a result of adding an invoice.
 */
@XmlRootElement(name = "response")
public class InvoiceResponse extends AcumulusResponse {
  /**
   * Invoice object that was added, will have its invoicenumber, token and entryid properties set. Other values may
   * remain null.
   */
  private PartialInvoice invoice;
  
  public PartialInvoice getInvoice() {
    return invoice;
  }
  
  public void setInvoice(PartialInvoice invoice) {
    this.invoice = invoice;
  }
}
