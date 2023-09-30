package node.fs

import js.promise.await


suspend fun chown(path: PathLike, uid: Number, gid: Number): Unit =
    chownAsync(
        path, uid, gid
    ).await()
