package net.nextpulse.jacumulus.requests

import net.nextpulse.jacumulus.requests.models.Supplier
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

/**
 * Request to add both (if it does not exist yet) a supplier and invoice from this supplier. The supplier will be
 * de-duplicated using the customerId or email address.
 *
 * @see [https://apidoc.sielsystems.nl/content/expense-add-expense]
 */
@XmlRootElement(name = "myxml")
data class AddExpenseRequest(
        /**
         * Supplier object to add
         */
        @get:XmlElement(name = "supplier")
        var supplier: Supplier? = null
) : AcumulusRequest()