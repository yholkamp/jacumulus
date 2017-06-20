package net.nextpulse.jacumulus.requests;

import net.nextpulse.jacumulus.models.Contract;
import net.nextpulse.jacumulus.responses.InvoiceResponse;
import net.nextpulse.jacumulus.responses.ListInvoicesResponse;

import javax.xml.bind.annotation.*;

/**
 * Generic parent class for all API responses.
 */
@XmlRootElement(name = "myxml")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({AddInvoiceRequest.class, ListInvoicesRequest.class})
public class AcumulusRequest {
  @XmlElement(name = "testmode")
  private int testMode;
  
  private Contract contract;
  
  private String format;
  
  public int getTestMode() {
    return testMode;
  }
  
  public void setTestMode(int testMode) {
    this.testMode = testMode;
  }
  
  public Contract getContract() {
    return contract;
  }
  
  public void setContract(Contract contract) {
    this.contract = contract;
  }
  
  public String getFormat() {
    return format;
  }
  
  public void setFormat(String format) {
    this.format = format;
  }
  
  @Override
  public String toString() {
    return "AcumulusRequest{" +
        "testmode=" + testMode +
        ", contract=" + contract +
        ", format='" + format + '\'' +
        '}';
  }
}