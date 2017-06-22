package net.nextpulse.jacumulus.responses.models

/**
 * Partial invoice object that will be returned by the API.
 */
data class PartialInvoice (
    var invoicenumber: String? = null,
    var token: String? = null,
    var entryid: String? = null
)
