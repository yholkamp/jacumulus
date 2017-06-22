package net.nextpulse.jacumulus.requests

import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

/**
 * Request to list all invoices for a given contactId
 *
 * @see [the api docs for incoming](https://apidoc.sielsystems.nl/content/contact-list-incoming-invoices)
 * @see [the api docs for outgoing](https://apidoc.sielsystems.nl/content/contact-list-outgoing-invoices)
 */
@XmlRootElement(name = "myxml")
data class ListInvoicesRequest(
        /**
         * Contact ID to retrieve all invoices for.
         */
        @get:XmlElement(name = "contactid")
        var contactId: String? = null
) : AcumulusRequest()
