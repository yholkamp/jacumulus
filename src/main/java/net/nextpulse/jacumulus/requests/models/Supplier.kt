package net.nextpulse.jacumulus.requests.models

import net.nextpulse.jacumulus.util.typeadapters.ContactTypeAdapter
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter

/**
 * 
 * @see [https://apidoc.sielsystems.nl/content/expense-add-expense]
 */
data class Supplier(
        @get:XmlElement(name = "contactid")
        var contactId: Int? = null,
        @get:XmlJavaTypeAdapter(ContactTypeAdapter::class)
        @get:XmlElement(name = "type")
        var type: ContactType? = null,
        @get:XmlElement(name = "companyname1")
        var companyName1: String? = null,
        @get:XmlElement(name = "companyname2")
        var companyName2: String? = null,
        @get:XmlElement(name = "fullname")
        var fullName: String? = null,
        @get:XmlElement(name = "salutation")
        var salutation: String? = null,
        @get:XmlElement(name = "address1")
        var address1: String? = null,
        @get:XmlElement(name = "address2")
        var address2: String? = null,
        @get:XmlElement(name = "postalcode")
        var postalCode: String? = null,
        @get:XmlElement(name = "city")
        var city: String? = null,
        /**
         * Use two-letter international standard country code (ISO 3166-1 alpha 2).
         */
        @get:XmlElement(name = "countrycode")
        var countryCode: String? = null,
        @get:XmlElement(name = "vatnumber")
        var vatNumber: String? = null,
        @get:XmlElement(name = "telephone")
        var telephone: String? = null,
        @get:XmlElement(name = "fax")
        var fax: String? = null,
        /**
         * Lookup is based on string comparison. If a customer with this email address exists, this customer will be selected. When multiple customers with the same email address are found only the most recent added contact is used. When no matches are made a new customer will be added as part of the invoice add transaction. Setting can be overruled when a matching contactid tag is provided.
         */
        @get:XmlElement(name = "email")
        var email: String? = null,
        /**
         * Set to 1 to overwrite an existing contact if a match was found using email.
         */
        @get:XmlElement(name = "overwriteifexists")
        var overwriteIfExists: Int? = 0,
        @get:XmlElement(name = "bankaccountnumber")
        var bankAccountNumber: String? = null,
        @get:XmlElement(name = "mark")
        var mark: String? = null,
        var expense: Expense? = null
)