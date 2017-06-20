package net.nextpulse.jacumulus.models;

import net.nextpulse.jacumulus.util.DateAdapter;
import net.nextpulse.jacumulus.util.PaymentStatusEnumAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "invoice")
public class Invoice {
  private Emailaspdf emailaspdf;
  
  private String descriptiontext;
  
  private String template;
  
  private String concepttype;
  
  private String concept;
  
  private PaymentStatusEnum paymentstatus;
  
  private String invoicenotes;
  
  private List<Line> lines;
  
  private String number;
  
  private Date paymentdate;
  
  private String vattype;
  
  private String description;
  
  private Date issuedate;
  
  private String costcenter;
  
  private String accountnumber;
  
  public Emailaspdf getEmailaspdf() {
    return emailaspdf;
  }
  
  public void setEmailaspdf(Emailaspdf emailaspdf) {
    this.emailaspdf = emailaspdf;
  }
  
  public String getDescriptiontext() {
    return descriptiontext;
  }
  
  public void setDescriptiontext(String descriptiontext) {
    this.descriptiontext = descriptiontext;
  }
  
  public String getTemplate() {
    return template;
  }
  
  public void setTemplate(String template) {
    this.template = template;
  }
  
  public String getConcepttype() {
    return concepttype;
  }
  
  public void setConcepttype(String concepttype) {
    this.concepttype = concepttype;
  }
  
  public String getConcept() {
    return concept;
  }
  
  public void setConcept(String concept) {
    this.concept = concept;
  }
  
  @XmlJavaTypeAdapter(PaymentStatusEnumAdapter.class)
  public PaymentStatusEnum getPaymentstatus() {
    return paymentstatus;
  }
  
  public void setPaymentstatus(PaymentStatusEnum paymentstatus) {
    this.paymentstatus = paymentstatus;
  }
  
  public String getInvoicenotes() {
    return invoicenotes;
  }
  
  public void setInvoicenotes(String invoicenotes) {
    this.invoicenotes = invoicenotes;
  }
  
  public String getNumber() {
    return number;
  }
  
  public void setNumber(String number) {
    this.number = number;
  }
  
  @XmlJavaTypeAdapter(DateAdapter.class)
  public Date getPaymentdate() {
    return paymentdate;
  }
  
  public void setPaymentdate(Date paymentdate) {
    this.paymentdate = paymentdate;
  }
  
  public String getVattype() {
    return vattype;
  }
  
  public void setVattype(String vattype) {
    this.vattype = vattype;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  @XmlJavaTypeAdapter(DateAdapter.class)
  public Date getIssuedate() {
    return issuedate;
  }
  
  public void setIssuedate(Date issuedate) {
    this.issuedate = issuedate;
  }
  
  public String getCostcenter() {
    return costcenter;
  }
  
  public void setCostcenter(String costcenter) {
    this.costcenter = costcenter;
  }
  
  public String getAccountnumber() {
    return accountnumber;
  }
  
  public void setAccountnumber(String accountnumber) {
    this.accountnumber = accountnumber;
  }
  
  @XmlElement(name = "line")
  public List<Line> getLines() {
    return lines;
  }
  
  public void setLines(List<Line> lines) {
    this.lines = lines;
  }
  
  @Override
  public String toString() {
    return "Invoice{" +
        "emailaspdf=" + emailaspdf +
        ", descriptiontext='" + descriptiontext + '\'' +
        ", template='" + template + '\'' +
        ", concepttype='" + concepttype + '\'' +
        ", concept='" + concept + '\'' +
        ", paymentstatus='" + paymentstatus + '\'' +
        ", invoicenotes='" + invoicenotes + '\'' +
        ", lines=" + lines +
        ", number='" + number + '\'' +
        ", paymentdate='" + paymentdate + '\'' +
        ", vattype='" + vattype + '\'' +
        ", description='" + description + '\'' +
        ", issuedate='" + issuedate + '\'' +
        ", costcenter='" + costcenter + '\'' +
        ", accountnumber='" + accountnumber + '\'' +
        '}';
  }
}