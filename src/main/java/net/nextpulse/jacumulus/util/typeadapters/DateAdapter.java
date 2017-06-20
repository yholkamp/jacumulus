package net.nextpulse.jacumulus.util.typeadapters;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Date;

public class DateAdapter extends XmlAdapter<String, Date> {
  private static final String format = "yyyy-MM-dd";
  
  @Override
  public String marshal(Date value) throws Exception {
    if(value != null) {
      return new DateTime(value).toString(format);
    }
    return null;
  }
  
  @Override
  public Date unmarshal(String s) throws Exception {
    return DateTime.parse(s).toDate();
  }
}