// Generated by Karakum - do not modify it manually!

package node.dns

import js.promise.await


suspend fun resolvePtr(hostname: String): js.array.ReadonlyArray<String> =
    resolvePtrAsync(
        hostname
    ).await()
