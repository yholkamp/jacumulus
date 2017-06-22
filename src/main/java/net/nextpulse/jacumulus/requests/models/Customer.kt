package net.nextpulse.jacumulus.requests.models

import javax.xml.bind.annotation.XmlRootElement

/**
 * Object used to create a new customer/contact.
 */
@XmlRootElement(name = "contact")
data class Customer(
        var contactid: String? = null,
        var contactyourid: String? = null,
        var fullname: String? = null,
        var companyname1: String? = null,
        var companyname2: String? = null,
        var postalcode: String? = null,
        var countrycode: String? = null,
        var invoice: Invoice? = null,
        var vatnumber: String? = null,
        var address1: String? = null,
        var address2: String? = null,
        var city: String? = null,
        var mark: String? = null,
        var type: String? = null,
        var disableduplicates: String? = null,
        var country: String? = null,
        var bankaccountnumber: String? = null,
        var contactstatus: String? = null,
        var email: String? = null,
        var overwriteifexists: Int? = null,
        var salutation: String? = null,
        var telephone: String? = null,
        var fax: String? = null
)