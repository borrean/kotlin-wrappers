@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise

/**
 * @since v18.15.0
 * @return Fulfills with an {fs.StatFs} for the file system.
 */

@JsName("statfs")
external fun statfsAsync(path: PathLike, opts: StatfsOpts = definedExternally): Promise<StatsFs>


@JsName("statfs")
external fun statfsAsync(path: PathLike, opts: StatfsBigIntOpts): Promise<BigIntStatsFs>


@JsName("statfs")
external fun statfsAsync(
    path: PathLike,
    opts: StatFsOptions = definedExternally,
): Promise<Any /* StatsFs | BigIntStatsFs */>
