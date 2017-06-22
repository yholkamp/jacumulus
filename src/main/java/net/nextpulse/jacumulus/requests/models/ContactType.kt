package net.nextpulse.jacumulus.requests.models

/**
 * The contacttype tag allows you choose a specific type of contacts to be listed. The numeric values correspond to those available from the contacttypes picklist.
 */
enum class ContactType constructor(private val value: Int) {
    DEBTOR(1),
    CREDITOR(2),
    RELATION(3);

    override fun toString(): String {
        return value.toString()
    }
}
