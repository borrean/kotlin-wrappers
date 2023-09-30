package node.fs

import js.promise.await


suspend fun realpath(path: PathLike, options: ObjectEncodingOptions? = undefined.unsafeCast<Nothing>()): String =
    realpathAsync(
        path, options
    ).await()


suspend fun realpath(path: PathLike, options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>()): String =
    realpathAsync(
        path, options
    ).await()


suspend fun realpath(path: PathLike, options: BufferEncodingOption): node.buffer.Buffer =
    realpathAsync(
        path, options
    ).await()


suspend fun realpath(
    path: PathLike,
    options: ObjectEncodingOptions? = undefined.unsafeCast<Nothing>(),
): Any /* string | Buffer */ =
    realpathAsync(
        path, options
    ).await()


suspend fun realpath(
    path: PathLike,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Any /* string | Buffer */ =
    realpathAsync(
        path, options
    ).await()
