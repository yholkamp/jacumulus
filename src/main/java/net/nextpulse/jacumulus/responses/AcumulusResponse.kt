package net.nextpulse.jacumulus.responses

import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlElementWrapper

/**
 * Parent class for all API responses
 */
abstract class AcumulusResponse {

    @get:XmlElementWrapper(name = "errors")
    @get:XmlElement(name = "error")
    var errors: List<ApiMessage>? = null

    @get:XmlElementWrapper(name = "warnings")
    @get:XmlElement(name = "warning")
    var warnings: List<ApiMessage>? = null
}
