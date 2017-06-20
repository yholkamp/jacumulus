package net.nextpulse.jacumulus.requests

import net.nextpulse.jacumulus.models.Contract
import net.nextpulse.jacumulus.responses.InvoiceResponse
import net.nextpulse.jacumulus.responses.ListInvoicesResponse

import javax.xml.bind.annotation.*

/**
 * Generic parent class for all API responses.
 */
@XmlRootElement(name = "myxml")
@XmlSeeAlso(AddInvoiceRequest::class, ListInvoicesRequest::class)
open class AcumulusRequest {
    @get:XmlElement(name = "testmode")
    var testMode: Int = 0
    var contract: Contract? = null
    var format: String? = null
}