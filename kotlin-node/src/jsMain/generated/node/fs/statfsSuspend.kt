package node.fs

import js.promise.await


suspend fun statfs(path: PathLike, opts: StatfsOpts = undefined.unsafeCast<Nothing>()): StatsFs =
    statfsAsync(
        path, opts
    ).await()


suspend fun statfs(path: PathLike, opts: StatfsBigIntOpts): BigIntStatsFs =
    statfsAsync(
        path, opts
    ).await()


suspend fun statfs(
    path: PathLike,
    opts: StatFsOptions = undefined.unsafeCast<Nothing>(),
): Any /* StatsFs | BigIntStatsFs */ =
    statfsAsync(
        path, opts
    ).await()
