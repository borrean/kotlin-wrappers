// Generated by Karakum - do not modify it manually!

package node.dns

import js.promise.await


suspend fun resolve6(hostname: String): js.array.ReadonlyArray<String> =
    resolve6Async(
        hostname
    ).await()


suspend fun resolve6(hostname: String, options: ResolveWithTtlOptions): js.array.ReadonlyArray<RecordWithTtl> =
    resolve6Async(
        hostname, options
    ).await()


suspend fun resolve6(hostname: String, options: ResolveOptions): Any /* string[] | RecordWithTtl[] */ =
    resolve6Async(
        hostname, options
    ).await()
