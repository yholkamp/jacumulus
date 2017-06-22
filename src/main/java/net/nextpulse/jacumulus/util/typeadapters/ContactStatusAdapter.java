package net.nextpulse.jacumulus.util.typeadapters;

import net.nextpulse.jacumulus.requests.models.ContactStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Adapter that handles (de)serializing the ContactStatus
 */
public class ContactStatusAdapter extends XmlAdapter<String, ContactStatus> {
  
  public String marshal(ContactStatus e) {
    return e.toString();
  }
  
  public ContactStatus unmarshal(String val) {
    for(ContactStatus contactStatus : ContactStatus.values()) {
      if(contactStatus.toString().equals(val)) {
        return contactStatus;
      }
    }
    throw new IllegalArgumentException("Unknown enum value " + val);
  }
}