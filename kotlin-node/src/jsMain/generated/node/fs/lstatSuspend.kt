package node.fs

import js.promise.await


suspend fun lstat(path: PathLike, opts: LstatOpts = undefined.unsafeCast<Nothing>()): Stats =
    lstatAsync(
        path, opts
    ).await()


suspend fun lstat(path: PathLike, opts: LstatBigIntOpts): BigIntStats =
    lstatAsync(
        path, opts
    ).await()


suspend fun lstat(path: PathLike, opts: StatOptions = undefined.unsafeCast<Nothing>()): Any /* Stats | BigIntStats */ =
    lstatAsync(
        path, opts
    ).await()
