package net.nextpulse.jacumulus.models;

/**
 * Enum representing the payment status of an invoice.
 */
public enum PaymentStatusEnum {
  Due(1),
  Paid(2);
  
  private final int value;
  
  PaymentStatusEnum(int i) {
    this.value = i;
  }
  
  public String toString() {
    return String.valueOf(value);
  }
}
