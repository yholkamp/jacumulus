package net.nextpulse.jacumulus.requests;

import net.nextpulse.jacumulus.models.Customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Request to add both (if it does not exist yet) a customer and invoice for this customer. The customer will be
 * de-duplicated using the customerId or email address.
 *
 * @see <a href="https://apidoc.sielsystems.nl/content/invoice-add">the Invoice: Add documentation</a>
 */
@XmlRootElement(name = "myxml")
public class AddInvoiceRequest extends AcumulusRequest {
  
  /**
   * Customer object to add
   */
  @XmlElement(name="customer")
  private Customer customer;
  
  public Customer getCustomer() {
    return customer;
  }
  
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
