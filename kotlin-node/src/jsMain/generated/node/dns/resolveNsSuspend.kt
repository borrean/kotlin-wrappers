// Generated by Karakum - do not modify it manually!

package node.dns

import js.promise.await


suspend fun resolveNs(hostname: String): js.array.ReadonlyArray<String> =
    resolveNsAsync(
        hostname
    ).await()
