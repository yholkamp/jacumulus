package net.nextpulse.jacumulus.responses

import javax.xml.bind.annotation.XmlRootElement

/**
 * Response returned by the API as a result of adding an expense/supplier.
 */
@XmlRootElement(name = "response")
data class AddExpenseResponse(
        var status: String? = null
) : AcumulusResponse()
