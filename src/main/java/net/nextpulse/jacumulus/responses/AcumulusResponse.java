package net.nextpulse.jacumulus.responses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AcumulusResponse {
  
  @XmlElementWrapper(name = "errors")
  @XmlElement(name = "error")
  private List<ApiMessage> errors;
  
  @XmlElementWrapper(name = "warnings")
  @XmlElement(name = "warning")
  private List<ApiMessage> warnings;
  
  public List<ApiMessage> getErrors() {
    return errors;
  }
  
  public void setErrors(List<ApiMessage> errors) {
    this.errors = errors;
  }
  
  public List<ApiMessage> getWarnings() {
    return warnings;
  }
  
  public void setWarnings(List<ApiMessage> warnings) {
    this.warnings = warnings;
  }
}
