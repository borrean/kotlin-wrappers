package node.fs

import js.promise.await


suspend fun mkdtemp(prefix: String, options: ObjectEncodingOptions? = undefined.unsafeCast<Nothing>()): String =
    mkdtempAsync(
        prefix, options
    ).await()


suspend fun mkdtemp(prefix: String, options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>()): String =
    mkdtempAsync(
        prefix, options
    ).await()


suspend fun mkdtemp(prefix: String, options: BufferEncodingOption): node.buffer.Buffer =
    mkdtempAsync(
        prefix, options
    ).await()
