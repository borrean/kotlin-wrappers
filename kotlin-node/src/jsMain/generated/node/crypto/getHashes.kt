// Generated by Karakum - do not modify it manually!

@file:JsModule("node:crypto")

package node.crypto


/**
 * ```js
 * const {
 *   getHashes
 * } = await import('crypto');
 *
 * console.log(getHashes()); // ['DSA', 'DSA-SHA', 'DSA-SHA1', ...]
 * ```
 * @since v0.9.3
 * @return An array of the names of the supported hash algorithms, such as `'RSA-SHA256'`. Hash algorithms are also called "digest" algorithms.
 */
external fun getHashes(): js.array.ReadonlyArray<String>
