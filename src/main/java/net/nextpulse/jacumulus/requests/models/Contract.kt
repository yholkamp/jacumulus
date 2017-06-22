package net.nextpulse.jacumulus.requests.models

import javax.xml.bind.annotation.XmlElement

/**
 * API credentials object.

 * @see [the global API documentation](https://apidoc.sielsystems.nl/content/global-legend)
 */
data class Contract(
        /**
         * Acumulus contract code
         */
        @get:XmlElement(name = "contractcode") var contractCode: String,
        /**
         * API username
         */
        var username: String,
        /**
         * API password
         */
        var password: String
) {
    /**
     * Email address to send error messages to.
     */
    @get:XmlElement(name = "emailonerror")
    var emailOnError: String? = null
    /**
     * Email address to send warning messages to.
     */
    @get:XmlElement(name = "emailonwarning")
    var emailOnWarning: String? = null

}