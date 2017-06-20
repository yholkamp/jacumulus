package net.nextpulse.jacumulus.models

import net.nextpulse.jacumulus.util.typeadapters.DateAdapter
import net.nextpulse.jacumulus.util.typeadapters.PaymentStatusEnumAdapter

import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter
import java.util.Date

@XmlRootElement(name = "invoice")
data class Invoice (
    var emailaspdf: Emailaspdf? = null,
    var descriptiontext: String? = null,
    var template: String? = null,
    var concepttype: String? = null,
    var concept: String? = null,
    @get:XmlJavaTypeAdapter(PaymentStatusEnumAdapter::class)
    var paymentstatus: PaymentStatusEnum? = null,
    var invoicenotes: String? = null,
    @get:XmlElement(name = "line")
    var lines: List<Line>? = null,
    var number: String? = null,
    @get:XmlJavaTypeAdapter(DateAdapter::class)
    var paymentdate: Date? = null,
    var vattype: String? = null,
    var description: String? = null,
    @get:XmlJavaTypeAdapter(DateAdapter::class)
    var issuedate: Date? = null,
    var costcenter: String? = null,
    var accountnumber: String? = null
)