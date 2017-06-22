package net.nextpulse.jacumulus.responses.models

import javax.xml.bind.annotation.XmlElement

/**
 * Contact as returned by the API, contains most, but not all, fields available when creating a new 'Customer'.
 */
data class Contact(
        @get:XmlElement(name = "contactid")
        var contactId: String = "",
        @get:XmlElement(name = "contactyourid")
        var contactYourId: String? = null,
        @get:XmlElement(name = "contactname")
        var contactName: String? = null,
        @get:XmlElement(name = "contactname1")
        var contactName1: String? = null,
        @get:XmlElement(name = "contactname2")
        var contactName2: String? = null,
        @get:XmlElement(name = "contactstatus")
        var contactStatus: String? = null,
        @get:XmlElement(name = "contacttypeid")
        var contactTypeId: String? = null,
        @get:XmlElement(name = "contacttypename")
        var contactTypeName: String? = null,
        @get:XmlElement(name = "contactperson")
        var contactPerson: String? = null,
        @get:XmlElement(name = "contactaddress1")
        var contactAddress1: String? = null,
        @get:XmlElement(name = "contactaddress2")
        var contactAddress2: String? = null,
        @get:XmlElement(name = "contactcity")
        var contactCity: String? = null,
        @get:XmlElement(name = "contacttelephone")
        var contactTelephone: String? = null,
        @get:XmlElement(name = "contactemail")
        var contactEmail: String? = null,
        @get:XmlElement(name = "contactcountrycode")
        var contactCountryCode: String? = null
)