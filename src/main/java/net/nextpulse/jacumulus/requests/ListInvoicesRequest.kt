package net.nextpulse.jacumulus.requests

import javax.xml.bind.annotation.XmlElement

/**
 * Request to list all invoices for a given contactId

 * @see [the api docs for incoming](https://apidoc.sielsystems.nl/content/contact-list-incoming-invoices)

 * @see [the api docs for outgoing](https://apidoc.sielsystems.nl/content/contact-list-incoming-invoices)
 */
data class ListInvoicesRequest(@get:XmlElement(name = "contactid")
                          var contactId: String?) : AcumulusRequest()
