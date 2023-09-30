package node.fs

import js.iterable.AsyncIterable
import js.promise.await
import node.stream.Stream


suspend fun writeFile(
    file: PathLike,
    data: String,
    options: WriteFileAsyncOptions = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: PathLike,
    data: String,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: PathLike,
    data: js.buffer.ArrayBufferView,
    options: WriteFileAsyncOptions = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: PathLike,
    data: js.buffer.ArrayBufferView,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: PathLike,
    data: Iterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: WriteFileAsyncOptions = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: PathLike,
    data: Iterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: PathLike,
    data: AsyncIterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: WriteFileAsyncOptions = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: PathLike,
    data: AsyncIterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: PathLike,
    data: Stream,
    options: WriteFileAsyncOptions = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: PathLike,
    data: Stream,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: FileHandle,
    data: String,
    options: WriteFileAsyncOptions = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: FileHandle,
    data: String,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: FileHandle,
    data: js.buffer.ArrayBufferView,
    options: WriteFileAsyncOptions = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: FileHandle,
    data: js.buffer.ArrayBufferView,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: FileHandle,
    data: Iterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: WriteFileAsyncOptions = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: FileHandle,
    data: Iterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: FileHandle,
    data: AsyncIterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: WriteFileAsyncOptions = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: FileHandle,
    data: AsyncIterable<Any /* string | NodeJS.ArrayBufferView */>,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: FileHandle,
    data: Stream,
    options: WriteFileAsyncOptions = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()


suspend fun writeFile(
    file: FileHandle,
    data: Stream,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Unit =
    writeFileAsync(
        file, data, options
    ).await()
