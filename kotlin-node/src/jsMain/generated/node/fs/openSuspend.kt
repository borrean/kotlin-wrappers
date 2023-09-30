package node.fs

import js.promise.await


suspend fun open(
    path: PathLike,
    flags: String = undefined.unsafeCast<Nothing>(),
    mode: Mode = undefined.unsafeCast<Nothing>(),
): FileHandle =
    openAsync(
        path, flags, mode
    ).await()


suspend fun open(
    path: PathLike,
    flags: Double = undefined.unsafeCast<Nothing>(),
    mode: Mode = undefined.unsafeCast<Nothing>(),
): FileHandle =
    openAsync(
        path, flags, mode
    ).await()
