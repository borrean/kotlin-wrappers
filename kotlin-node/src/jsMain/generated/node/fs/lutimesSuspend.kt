package node.fs

import js.promise.await


suspend fun lutimes(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit =
    lutimesAsync(
        path, atime, mtime
    ).await()
