package net.nextpulse.jacumulus.util;

import net.nextpulse.jacumulus.models.PaymentStatusEnum;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class PaymentStatusEnumAdapter extends XmlAdapter<String, PaymentStatusEnum> {
  
  public String marshal(PaymentStatusEnum e) {
    return e.toString();
  }
  
  public PaymentStatusEnum unmarshal(String val) {
    switch(val.charAt(0)) {
      case '1':
        return PaymentStatusEnum.Due;
      case '2':
        return PaymentStatusEnum.Paid;
      default:
        throw new IllegalArgumentException("Unknown enum value " + val);
    }
  }
}