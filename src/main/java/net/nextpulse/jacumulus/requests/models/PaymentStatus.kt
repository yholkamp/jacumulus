package net.nextpulse.jacumulus.requests.models

/**
 * Enum representing the payment status of an invoice.
 */
enum class PaymentStatus constructor(private val value: Int) {
    Due(1),
    Paid(2);

    override fun toString(): String {
        return value.toString()
    }
}
