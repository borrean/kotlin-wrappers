// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface UnparsedPrepend : UnparsedSection, Union.UnparsedPrepend_ {
    override val kind: SyntaxKind.UnparsedPrepend
    override val parent: UnparsedSource
    override val data: String
    val texts: ReadonlyArray<UnparsedTextLike>
}
