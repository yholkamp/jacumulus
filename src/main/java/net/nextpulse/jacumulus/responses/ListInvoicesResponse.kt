package net.nextpulse.jacumulus.responses

import net.nextpulse.jacumulus.models.Invoice

import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement
import java.util.ArrayList

/**
 * Response for the list invoices request

 * @see [the api docs for incoming](https://apidoc.sielsystems.nl/content/contact-list-incoming-invoices)

 * @see [the api docs for outgoing](https://apidoc.sielsystems.nl/content/contact-list-outgoing-invoices)
 */
@XmlRootElement(name = "response")
class ListInvoicesResponse : AcumulusResponse() {
    @XmlElement(name = "contact")
    var invoices: List<Invoice> = ArrayList()
}
