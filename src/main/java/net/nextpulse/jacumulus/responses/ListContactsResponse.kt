package net.nextpulse.jacumulus.responses

import net.nextpulse.jacumulus.responses.models.Contact

import javax.xml.bind.annotation.XmlRootElement
import java.util.ArrayList
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlElementWrapper

/**
 * Response for the list invoices request
 *
 * @see [the apidocs](https://apidoc.sielsystems.nl/content/contacts-list-contacts)
 */
@XmlRootElement(name = "response")
data class ListContactsResponse(
    @get:XmlElementWrapper(name="contacts")
    @get:XmlElement(name="contact")
    var contacts: List<Contact> = ArrayList()
) : AcumulusResponse()
