package net.nextpulse.jacumulus.responses.models

/**
 * Class that represents the warnings or errors that may be returned by the Acumulus API.
 */
data class ApiMessage (
    /**
     * Error/warning code number. Usually of type 4xx, 5xx or 6xx.
     */
    var code: String? = null,
    /**
     * Special code tag. Use this as a reference when communicating with Acumulus technical support.
     */
    var codetag: String? = null,
    /**
     * A message describing the warning or error.
     */
    var message: String? = null
)