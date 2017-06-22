package net.nextpulse.jacumulus.requests.models

import net.nextpulse.jacumulus.util.typeadapters.BigDecimalAdapter
import java.math.BigDecimal
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter

data class Line(
        var product: String? = null,
        @get:XmlJavaTypeAdapter(BigDecimalAdapter::class)
        var unitprice: BigDecimal? = null,
        var nature: String? = null,
        var itemnumber: String? = null,
        var costprice: String? = null,
        var quantity: BigDecimal = BigDecimal.ONE,
        var vatrate: Int = 0
)