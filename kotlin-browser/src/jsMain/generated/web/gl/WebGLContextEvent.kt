// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.gl

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface WebGLContextEventInit : EventInit {
    var statusMessage: String?
}

/**
 * The WebContextEvent interface is part of the WebGL API and is an interface for an event that is generated in response to a status change to the WebGL rendering context.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLContextEvent)
 */
open external class WebGLContextEvent(
    override val type: EventType<WebGLContextEvent>,
    init: WebGLContextEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLContextEvent/statusMessage)
     */
    val statusMessage: String

    companion object
}
