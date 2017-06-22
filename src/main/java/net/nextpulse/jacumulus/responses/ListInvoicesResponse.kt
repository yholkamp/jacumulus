package net.nextpulse.jacumulus.responses

import net.nextpulse.jacumulus.responses.models.Invoice
import java.util.*
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlElementWrapper
import javax.xml.bind.annotation.XmlRootElement

/**
 * Response for the list invoices request

 * @see [the api docs for incoming](https://apidoc.sielsystems.nl/content/contact-list-incoming-invoices)

 * @see [the api docs for outgoing](https://apidoc.sielsystems.nl/content/contact-list-outgoing-invoices)
 */
@XmlRootElement(name = "response")
data class ListInvoicesResponse(
        @get:XmlElementWrapper(name = "contact")
        @get:XmlElement(name = "invoice")
        var invoices: List<Invoice> = ArrayList()
) : AcumulusResponse()