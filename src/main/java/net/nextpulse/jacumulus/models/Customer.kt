package net.nextpulse.jacumulus.models

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType

@XmlAccessorType(XmlAccessType.FIELD)
data class Customer (
    var postalcode: String? = null,
    var fax: String? = null,
    var countrycode: String? = null,
    var companyname2: String? = null,
    var invoice: Invoice? = null,
    var companyname1: String? = null,
    var vatnumber: String? = null,
    var address1: String? = null,
    var mark: String? = null,
    var address2: String? = null,
    var type: String? = null,
    var contactid: String? = null,
    var disableduplicates: String? = null,
    var city: String? = null,
    var country: String? = null,
    var bankaccountnumber: String? = null,
    var contactstatus: String? = null,
    var email: String? = null,
    var contactyourid: String? = null,
    var overwriteifexists: Int? = null,
    var salutation: String? = null,
    var telephone: String? = null,
    var fullname: String? = null
)