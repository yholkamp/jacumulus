package net.nextpulse.jacumulus.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * API credentials object.
 *
 * @see <a href="https://apidoc.sielsystems.nl/content/global-legend">the global API documentation</a>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Contract {
  /**
   * Acumulus contract code
   */
  @XmlElement(name = "contractcode")
  private String contractCode;
  /**
   * API username
   */
  private String username;
  /**
   * API password
   */
  private String password;
  /**
   * Email address to send error messages to.
   */
  @XmlElement(name = "emailonerror")
  private String emailOnError;
  /**
   * Email address to send warning messages to.
   */
  @XmlElement(name = "emailonwarning")
  private String emailOnWarning;
  
  /**
   * @param contractCode Acumulus contract code
   * @param username     Acumulus API username
   * @param password     Acumulus API password
   */
  public Contract(String contractCode, String username, String password) {
    this.username = username;
    this.contractCode = contractCode;
    this.password = password;
  }
  
  public String getUsername() {
    return username;
  }
  
  public void setUsername(String username) {
    this.username = username;
  }
  
  public String getContractCode() {
    return contractCode;
  }
  
  public void setContractCode(String contractCode) {
    this.contractCode = contractCode;
  }
  
  public String getEmailOnError() {
    return emailOnError;
  }
  
  public void setEmailOnError(String emailOnError) {
    this.emailOnError = emailOnError;
  }
  
  public String getEmailOnWarning() {
    return emailOnWarning;
  }
  
  public void setEmailOnWarning(String emailOnWarning) {
    this.emailOnWarning = emailOnWarning;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  @Override
  public String toString() {
    return "Contract{" +
        "username='" + username + '\'' +
        ", contractcode='" + contractCode + '\'' +
        ", emailonerror='" + emailOnError + '\'' +
        ", emailOnWarning='" + emailOnWarning + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}