package net.nextpulse.jacumulus.responses;

/**
 * Partial invoice object that will be returned by the API.
 */
public class PartialInvoice {
  private String invoicenumber;
  private String token;
  private String entryid;
  
  public String getInvoicenumber() {
    return invoicenumber;
  }
  
  public void setInvoicenumber(String invoicenumber) {
    this.invoicenumber = invoicenumber;
  }
  
  public String getToken() {
    return token;
  }
  
  public void setToken(String token) {
    this.token = token;
  }
  
  public String getEntryid() {
    return entryid;
  }
  
  public void setEntryid(String entryid) {
    this.entryid = entryid;
  }
}
