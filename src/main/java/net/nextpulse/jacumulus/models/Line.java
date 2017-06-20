package net.nextpulse.jacumulus.models;

import net.nextpulse.jacumulus.util.BigDecimalAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;

public class Line {
  private String product;
  
  private BigDecimal unitprice;
  
  private String nature;
  
  private String itemnumber;
  
  private String costprice;
  
  private BigDecimal quantity = BigDecimal.ONE;
  
  private int vatrate;
  
  public String getProduct() {
    return product;
  }
  
  public void setProduct(String product) {
    this.product = product;
  }
  
  @XmlJavaTypeAdapter(BigDecimalAdapter.class)
  public BigDecimal getUnitprice() {
    return unitprice;
  }
  
  public void setUnitprice(BigDecimal unitprice) {
    this.unitprice = unitprice;
  }
  
  public String getNature() {
    return nature;
  }
  
  public void setNature(String nature) {
    this.nature = nature;
  }
  
  public String getItemnumber() {
    return itemnumber;
  }
  
  public void setItemnumber(String itemnumber) {
    this.itemnumber = itemnumber;
  }
  
  public String getCostprice() {
    return costprice;
  }
  
  public void setCostprice(String costprice) {
    this.costprice = costprice;
  }
  
  public BigDecimal getQuantity() {
    return quantity;
  }
  
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }
  
  public int getVatrate() {
    return vatrate;
  }
  
  public void setVatrate(int vatrate) {
    this.vatrate = vatrate;
  }
  
  @Override
  public String toString() {
    return "Line{" +
        "product='" + product + '\'' +
        ", unitprice=" + unitprice +
        ", nature='" + nature + '\'' +
        ", itemnumber='" + itemnumber + '\'' +
        ", costprice='" + costprice + '\'' +
        ", quantity=" + quantity +
        ", vatrate=" + vatrate +
        '}';
  }
}