@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise

/**
 * Truncates (shortens or extends the length) of the content at `path` to `len`bytes.
 * @since v10.0.0
 * @param [len=0]
 * @return Fulfills with `undefined` upon success.
 */

@JsName("truncate")
external fun truncateAsync(path: PathLike, len: Number = definedExternally): Promise<Unit>
