package net.nextpulse.jacumulus.models

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType

@XmlAccessorType(XmlAccessType.FIELD)
data class Emailaspdf (
    var emailto: String? = null,
    var message: String? = null,
    var subject: String? = null,
    var emailbcc: String? = null,
    var emailfrom: String? = null,
    var confirmreading: String? = null
)