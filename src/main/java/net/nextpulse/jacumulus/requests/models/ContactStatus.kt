package net.nextpulse.jacumulus.requests.models

/**
 * The contactstatus tag allows you choose which contacts to be listed.
 */
enum class ContactStatus constructor(private val value: Int) {
    Disabled(0),
    Active(1),
    All(2);

    override fun toString(): String {
        return value.toString()
    }
}
