// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface TupleType : GenericType {
    var elementFlags: ReadonlyArray<ElementFlags>
    var minLength: Int
    var fixedLength: Int
    var hasRestElement: Boolean
    var combinedFlags: ElementFlags
    var readonly: Boolean
    var labeledElementDeclarations: dynamic /* (NamedTupleMember | ParameterDeclaration)[] */
}
