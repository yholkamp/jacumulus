package net.nextpulse.jacumulus.models

/**
 * Enum representing the payment status of an invoice.
 */
enum class PaymentStatusEnum constructor(private val value: Int) {
    Due(1),
    Paid(2);

    override fun toString(): String {
        return value.toString()
    }
}
