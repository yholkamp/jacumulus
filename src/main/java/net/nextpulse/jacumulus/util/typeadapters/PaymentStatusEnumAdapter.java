package net.nextpulse.jacumulus.util.typeadapters;

import net.nextpulse.jacumulus.requests.models.PaymentStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Adapter that handles (de)serializing the PaymentStatus
 */
public class PaymentStatusEnumAdapter extends XmlAdapter<String, PaymentStatus> {
  
  public String marshal(PaymentStatus e) {
    return e.toString();
  }
  
  public PaymentStatus unmarshal(String val) {
    for(PaymentStatus statusEnum : PaymentStatus.values()) {
      if(statusEnum.toString().equals(val)) {
        return statusEnum;
      }
    }
    throw new IllegalArgumentException("Unknown enum value " + val);
  }
}