package net.nextpulse.jacumulus.requests.models

import net.nextpulse.jacumulus.util.typeadapters.DateAdapter
import net.nextpulse.jacumulus.util.typeadapters.PaymentStatusEnumAdapter
import java.util.*
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter

@XmlRootElement(name = "invoice")
data class Invoice(
    @get:XmlElement(name = "emailaspdf")
    var emailAsPdf: Emailaspdf? = null,
    @get:XmlElement(name = "descriptiontext")
    var descriptionText: String? = null,
    var template: String? = null,
    @get:XmlElement(name = "concepttype")
    var conceptType: String? = null,
    var concept: String? = null,
    @get:XmlJavaTypeAdapter(PaymentStatusEnumAdapter::class)
    @get:XmlElement(name = "paymentstatus")
    var paymentStatus: PaymentStatus? = null,
    @get:XmlElement(name = "invoicenotes")
    var invoiceNotes: String? = null,
    @get:XmlElement(name = "line")
    var lines: List<Line>? = null,
    var number: String? = null,
    @get:XmlJavaTypeAdapter(DateAdapter::class)
    @get:XmlElement(name = "paymentdate")
    var paymentDate: Date? = null,
    @get:XmlElement(name = "vattype")
    var vatType: String? = null,
    var description: String? = null,
    @get:XmlJavaTypeAdapter(DateAdapter::class)
    @get:XmlElement(name = "issuedate")
    var issueDate: Date? = null,
    @get:XmlElement(name = "costcenter")
    var costCenter: String? = null,
    @get:XmlElement(name = "accountnumber")
    var accountNumber: String? = null
)