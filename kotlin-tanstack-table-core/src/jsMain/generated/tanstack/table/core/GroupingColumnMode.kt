// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.table.core

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface GroupingColumnMode {
    companion object {
        @JsValue("false")
        val `false`: GroupingColumnMode

        @JsValue("reorder")
        val reorder: GroupingColumnMode

        @JsValue("remove")
        val remove: GroupingColumnMode
    }
}
