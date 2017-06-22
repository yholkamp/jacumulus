package net.nextpulse.jacumulus.requests.models

import net.nextpulse.jacumulus.util.typeadapters.BigDecimalAdapter
import net.nextpulse.jacumulus.util.typeadapters.DateAdapter
import net.nextpulse.jacumulus.util.typeadapters.PaymentStatusEnumAdapter
import java.math.BigDecimal
import java.util.*
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter

/**
 *
 * @see [https://apidoc.sielsystems.nl/content/expense-add-expense]
 */
data class Expense(
        @get:XmlElement(name = "description")
        var description: String? = null,
        @get:XmlJavaTypeAdapter(BigDecimalAdapter::class)
        @get:XmlElement(name = "amountexvat")
        var amountExVat: BigDecimal? = null,
        @get:XmlElement(name = "vatrate")
        var vatRate: Int? = null,
        @get:XmlElement(name = "vattype")
        var vatType: String? = null,
        @get:XmlJavaTypeAdapter(DateAdapter::class)
        @get:XmlElement(name = "issuedate")
        var issueDate: Date? = null,
        @get:XmlElement(name = "costheading")
        var costHeading: String? = null,
        @get:XmlElement(name = "costcenter")
        var costCenter: String? = null,
        @get:XmlElement(name = "disablelimiteddeduction")
        var disableLimitedDeduction: String? = null,
        @get:XmlElement(name = "accountnumber")
        var accountNumber: String? = null,
        @get:XmlElement(name = "paymentstatus")
        @get:XmlJavaTypeAdapter(PaymentStatusEnumAdapter::class)
        var paymentStatus: PaymentStatus? = null,
        @get:XmlJavaTypeAdapter(DateAdapter::class)
        @get:XmlElement(name = "paymentdate")
        var paymentDate: Date? = null,
        /**
         * Percentage value between 0 and 100 (including 0 and 100) to be applied to the expense. Defaults to 0 (no privatepercentage applied).
         */
        @get:XmlElement(name = "privatepercentage")
        var privatePercentage: Int = 0,
        @get:XmlElement(name = "recurrences")
        var recurrences: String? = null,
        @get:XmlElement(name = "monthly")
        var monthly: String? = null,
        @get:XmlElement(name = "investment")
        var investment: Int = 0,
        @get:XmlElement(name = "writeoffinyears")
        var writeOffInYears: Int? = null,
        @get:XmlJavaTypeAdapter(BigDecimalAdapter::class)
        @get:XmlElement(name = "scrapvalue")
        var scrapValue: BigDecimal = BigDecimal.ZERO
)