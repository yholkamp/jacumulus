package net.nextpulse.jacumulus.responses.models

import net.nextpulse.jacumulus.requests.models.PaymentStatus
import net.nextpulse.jacumulus.util.typeadapters.BigDecimalAdapter
import net.nextpulse.jacumulus.util.typeadapters.DateAdapter
import net.nextpulse.jacumulus.util.typeadapters.PaymentStatusEnumAdapter
import org.joda.time.DateTime
import java.math.BigDecimal
import java.util.*
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter

@XmlRootElement(name="invoice")
data class Invoice(
        var token: String = "",
        @get:XmlElement(name = "entryid")
        var entryId: String = "",
        @get:XmlElement(name = "entrydate")
        @get:XmlJavaTypeAdapter(value = DateAdapter::class)
        var entryDate: Date? = null,
        @get:XmlElement(name = "invoicenumber")
        var invoiceNumber: String? = null,
        @get:XmlElement(name = "invoicenote")
        var invoiceNote: String? = null,
        @get:XmlElement(name = "invoicedescription")
        var invoiceDescription: String? = null,
        @get:XmlElement(name = "paymentstatus")
        @get:XmlJavaTypeAdapter(PaymentStatusEnumAdapter::class)
        var paymentStatus: PaymentStatus? = null,
        @get:XmlElement(name = "amount")
        @get:XmlJavaTypeAdapter(BigDecimalAdapter::class)
        var amount: BigDecimal? = null
)