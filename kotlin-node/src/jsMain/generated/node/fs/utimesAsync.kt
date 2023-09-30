@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise

/**
 * Change the file system timestamps of the object referenced by `path`.
 *
 * The `atime` and `mtime` arguments follow these rules:
 *
 * * Values can be either numbers representing Unix epoch time, `Date`s, or a
 * numeric string like `'123456789.0'`.
 * * If the value can not be converted to a number, or is `NaN`, `Infinity` or`-Infinity`, an `Error` will be thrown.
 * @since v10.0.0
 * @return Fulfills with `undefined` upon success.
 */

@JsName("utimes")
external fun utimesAsync(path: PathLike, atime: TimeLike, mtime: TimeLike): Promise<Unit>
