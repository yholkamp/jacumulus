package net.nextpulse.jacumulus.requests

import net.nextpulse.jacumulus.requests.models.Customer

import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

/**
 * Request to add both (if it does not exist yet) a customer and invoice for this customer. The customer will be
 * de-duplicated using the customerId or email address.

 * @see [the Invoice: Add documentation](https://apidoc.sielsystems.nl/content/invoice-add)
 */
@XmlRootElement(name = "myxml")
data class AddInvoiceRequest(
        /**
         * Customer object to add
         */
        @get:XmlElement(name = "customer")
        var customer: Customer? = null
) : AcumulusRequest()