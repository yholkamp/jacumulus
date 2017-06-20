package net.nextpulse.jacumulus.responses;

/**
 * Class that represents the warnings or errors that may be returned by the Acumulus API.
 */
public class ApiMessage {
  /**
   * Error/warning code number. Usually of type 4xx, 5xx or 6xx.
   */
  private String code;
  /**
   * Special code tag. Use this as a reference when communicating with Acumulus technical support.
   */
  private String codetag;
  /**
   * A message describing the warning or error.
   */
  private String message;
  
  public String getCode() {
    return code;
  }
  
  public void setCode(String code) {
    this.code = code;
  }
  
  public String getCodetag() {
    return codetag;
  }
  
  public void setCodetag(String codetag) {
    this.codetag = codetag;
  }
  
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
}
