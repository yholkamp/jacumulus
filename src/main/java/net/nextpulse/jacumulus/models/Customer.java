package net.nextpulse.jacumulus.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
  private String postalcode;
  
  private String fax;
  
  private String countrycode;
  
  private String companyname2;
  
  private Invoice invoice;
  
  private String companyname1;
  
  private String vatnumber;
  
  private String address1;
  
  private String mark;
  
  private String address2;
  
  private String type;
  
  private String contactid;
  
  private String disableduplicates;
  
  private String city;
  
  private String country;
  
  private String bankaccountnumber;
  
  private String contactstatus;
  
  private String email;
  
  private String contactyourid;
  
  private Integer overwriteifexists;
  
  private String salutation;
  
  private String telephone;
  
  private String fullname;
  
  public String getPostalcode() {
    return postalcode;
  }
  
  public void setPostalcode(String postalcode) {
    this.postalcode = postalcode;
  }
  
  public String getFax() {
    return fax;
  }
  
  public void setFax(String fax) {
    this.fax = fax;
  }
  
  public String getCountrycode() {
    return countrycode;
  }
  
  public void setCountrycode(String countrycode) {
    this.countrycode = countrycode;
  }
  
  public String getCompanyname2() {
    return companyname2;
  }
  
  public void setCompanyname2(String companyname2) {
    this.companyname2 = companyname2;
  }
  
  public Invoice getInvoice() {
    return invoice;
  }
  
  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }
  
  public String getCompanyname1() {
    return companyname1;
  }
  
  public void setCompanyname1(String companyname1) {
    this.companyname1 = companyname1;
  }
  
  public String getVatnumber() {
    return vatnumber;
  }
  
  public void setVatnumber(String vatnumber) {
    this.vatnumber = vatnumber;
  }
  
  public String getAddress1() {
    return address1;
  }
  
  public void setAddress1(String address1) {
    this.address1 = address1;
  }
  
  public String getMark() {
    return mark;
  }
  
  public void setMark(String mark) {
    this.mark = mark;
  }
  
  public String getAddress2() {
    return address2;
  }
  
  public void setAddress2(String address2) {
    this.address2 = address2;
  }
  
  public String getType() {
    return type;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public String getContactid() {
    return contactid;
  }
  
  public void setContactid(String contactid) {
    this.contactid = contactid;
  }
  
  public String getDisableduplicates() {
    return disableduplicates;
  }
  
  public void setDisableduplicates(String disableduplicates) {
    this.disableduplicates = disableduplicates;
  }
  
  public String getCity() {
    return city;
  }
  
  public void setCity(String city) {
    this.city = city;
  }
  
  public String getCountry() {
    return country;
  }
  
  public void setCountry(String country) {
    this.country = country;
  }
  
  public String getBankaccountnumber() {
    return bankaccountnumber;
  }
  
  public void setBankaccountnumber(String bankaccountnumber) {
    this.bankaccountnumber = bankaccountnumber;
  }
  
  public String getContactstatus() {
    return contactstatus;
  }
  
  public void setContactstatus(String contactstatus) {
    this.contactstatus = contactstatus;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getContactyourid() {
    return contactyourid;
  }
  
  public void setContactyourid(String contactyourid) {
    this.contactyourid = contactyourid;
  }
  
  public Integer getOverwriteifexists() {
    return overwriteifexists;
  }
  
  public void setOverwriteifexists(Integer overwriteifexists) {
    this.overwriteifexists = overwriteifexists;
  }
  
  public String getSalutation() {
    return salutation;
  }
  
  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }
  
  public String getTelephone() {
    return telephone;
  }
  
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
  
  public String getFullname() {
    return fullname;
  }
  
  public void setFullname(String fullname) {
    this.fullname = fullname;
  }
  
  @Override
  public String toString() {
    return "Customer{" +
        "postalcode='" + postalcode + '\'' +
        ", fax='" + fax + '\'' +
        ", countrycode='" + countrycode + '\'' +
        ", companyname2='" + companyname2 + '\'' +
        ", invoice=" + invoice +
        ", companyname1='" + companyname1 + '\'' +
        ", vatnumber='" + vatnumber + '\'' +
        ", address1='" + address1 + '\'' +
        ", mark='" + mark + '\'' +
        ", address2='" + address2 + '\'' +
        ", type='" + type + '\'' +
        ", contactid='" + contactid + '\'' +
        ", disableduplicates='" + disableduplicates + '\'' +
        ", city='" + city + '\'' +
        ", country='" + country + '\'' +
        ", bankaccountnumber='" + bankaccountnumber + '\'' +
        ", contactstatus='" + contactstatus + '\'' +
        ", email='" + email + '\'' +
        ", contactyourid='" + contactyourid + '\'' +
        ", overwriteifexists='" + overwriteifexists + '\'' +
        ", salutation='" + salutation + '\'' +
        ", telephone='" + telephone + '\'' +
        ", fullname='" + fullname + '\'' +
        '}';
  }
}