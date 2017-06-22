package net.nextpulse.jacumulus.util.typeadapters;

import net.nextpulse.jacumulus.requests.models.ContactType;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Adapter that handles (de)serializing the ContactType
 */
public class ContactTypeAdapter extends XmlAdapter<String, ContactType> {
  
  public String marshal(ContactType e) {
    return e.toString();
  }
  
  public ContactType unmarshal(String val) {
    for(ContactType ContactType : ContactType.values()) {
      if(ContactType.toString().equals(val)) {
        return ContactType;
      }
    }
    throw new IllegalArgumentException("Unknown enum value " + val);
  }
}