package net.nextpulse.jacumulus.requests

import net.nextpulse.jacumulus.requests.models.Contract

import javax.xml.bind.annotation.*

/**
 * Generic parent class for all API responses.
 */
@XmlRootElement(name = "myxml")
@XmlSeeAlso(AddInvoiceRequest::class, ListInvoicesRequest::class, ListContactsRequest::class, AddExpenseRequest::class)
open class AcumulusRequest {
    @get:XmlElement(name = "testmode")
    var testMode: Int = 0
    var contract: Contract? = null
    var format: String? = null
}