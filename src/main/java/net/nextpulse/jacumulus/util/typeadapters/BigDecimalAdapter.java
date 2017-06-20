package net.nextpulse.jacumulus.util.typeadapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Adapter that serializes a BigDecimal in to a simple string
 */
public class BigDecimalAdapter extends XmlAdapter<String, BigDecimal> {
  private final static DecimalFormat format = new DecimalFormat("0.00");
  
  @Override
  public String marshal(BigDecimal value) throws Exception {
    if(value != null) {
      return format.format(value);
    }
    return null;
  }
  
  @Override
  public BigDecimal unmarshal(String s) throws Exception {
    return new BigDecimal(s);
  }
}