package node.fs

import js.promise.await
import node.url.URL


suspend fun cp(source: String, destination: String, opts: CopyOptions = undefined.unsafeCast<Nothing>()): Unit =
    cpAsync(
        source, destination, opts
    ).await()


suspend fun cp(source: String, destination: URL, opts: CopyOptions = undefined.unsafeCast<Nothing>()): Unit =
    cpAsync(
        source, destination, opts
    ).await()


suspend fun cp(source: URL, destination: String, opts: CopyOptions = undefined.unsafeCast<Nothing>()): Unit =
    cpAsync(
        source, destination, opts
    ).await()


suspend fun cp(source: URL, destination: URL, opts: CopyOptions = undefined.unsafeCast<Nothing>()): Unit =
    cpAsync(
        source, destination, opts
    ).await()
