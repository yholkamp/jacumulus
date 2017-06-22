package net.nextpulse.jacumulus.requests

import net.nextpulse.jacumulus.requests.models.ContactStatus
import net.nextpulse.jacumulus.requests.models.ContactType
import net.nextpulse.jacumulus.util.typeadapters.ContactStatusAdapter
import net.nextpulse.jacumulus.util.typeadapters.ContactTypeAdapter
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter

@XmlRootElement(name = "myxml")
class ListContactsRequest(
        @get:XmlElement(name = "contacttype")
        @get:XmlJavaTypeAdapter(ContactTypeAdapter::class)
        var contactType: ContactType? = null,
        /**
         * The filter tag can be used as a search string for the list to match against. It checks against the names, city, address and postal-code your contact.
         */
        var filter: String? = null,
        /**
         * Numeric offset tag can be used to jump into the results. Say you have 40 contacts and you want to skip the first 12 in the results you simply provide an offset of 12. The maximum offset number is the amount of contacts matched.
         */
        var offset: Int = 0,
        /**
         * Numeric tag that defines the amount of results you want returned. If the rowcount number exceeds the amount of contacts it simply returns the maximum amount of contacts. The default is to return all rows, which the call can be forced to when setting the rowcount to 0.
         */
        @get:XmlElement(name = "rowcount")
        var rowCount: Int = 0,
        /**
         * The contactstatus tag allows you choose which contacts to be listed.
         */
        @get:XmlElement(name = "contactstatus")
        @get:XmlJavaTypeAdapter(ContactStatusAdapter::class)
        var contactStatus : ContactStatus = ContactStatus.All
) : AcumulusRequest()
