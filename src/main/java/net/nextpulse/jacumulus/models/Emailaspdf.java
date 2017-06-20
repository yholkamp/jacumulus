package net.nextpulse.jacumulus.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Emailaspdf {
  private String emailto;
  
  private String message;
  
  private String subject;
  
  private String emailbcc;
  
  private String emailfrom;
  
  private String confirmreading;
  
  public String getEmailto() {
    return emailto;
  }
  
  public void setEmailto(String emailto) {
    this.emailto = emailto;
  }
  
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
  
  public String getSubject() {
    return subject;
  }
  
  public void setSubject(String subject) {
    this.subject = subject;
  }
  
  public String getEmailbcc() {
    return emailbcc;
  }
  
  public void setEmailbcc(String emailbcc) {
    this.emailbcc = emailbcc;
  }
  
  public String getEmailfrom() {
    return emailfrom;
  }
  
  public void setEmailfrom(String emailfrom) {
    this.emailfrom = emailfrom;
  }
  
  public String getConfirmreading() {
    return confirmreading;
  }
  
  public void setConfirmreading(String confirmreading) {
    this.confirmreading = confirmreading;
  }
  
  @Override
  public String toString() {
    return "Emailaspdf{" +
        "emailto='" + emailto + '\'' +
        ", message='" + message + '\'' +
        ", subject='" + subject + '\'' +
        ", emailbcc='" + emailbcc + '\'' +
        ", emailfrom='" + emailfrom + '\'' +
        ", confirmreading='" + confirmreading + '\'' +
        '}';
  }
}