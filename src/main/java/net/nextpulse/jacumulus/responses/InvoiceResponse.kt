package net.nextpulse.jacumulus.responses

import net.nextpulse.jacumulus.responses.models.PartialInvoice
import javax.xml.bind.annotation.XmlRootElement

/**
 * Response returned by the API as a result of adding an invoice.
 */
@XmlRootElement(name = "response")
data class InvoiceResponse(
    /**
     * Invoice object that was added, will have its invoicenumber, token and entryid properties set. Other values may
     * remain null.
     */
    var invoice: PartialInvoice? = null
) : AcumulusResponse()
