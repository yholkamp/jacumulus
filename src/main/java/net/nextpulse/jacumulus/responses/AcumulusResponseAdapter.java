package net.nextpulse.jacumulus.responses;

import net.nextpulse.jacumulus.models.Invoice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 */
public class AcumulusResponseAdapter extends XmlAdapter<AcumulusResponseAdapter.AdaptedResponse, AcumulusResponse> {
  
  public AcumulusResponse unmarshal(AdaptedResponse v) throws Exception {
    return null;
  }
  
  public AdaptedResponse marshal(AcumulusResponse v) throws Exception {
    return null;
  }
  
  public class AdaptedResponse extends AcumulusResponse {
    private PartialInvoice invoice;
    
    @XmlElement(name = "contact")
    private List<Invoice> invoices = new ArrayList<Invoice>();
    
    
  }
}
