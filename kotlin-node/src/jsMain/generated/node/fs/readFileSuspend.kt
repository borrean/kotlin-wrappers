package node.fs

import js.promise.await


suspend fun readFile(
    path: PathLike,
    options: ReadFileBufferAsyncOptions = undefined.unsafeCast<Nothing>(),
): node.buffer.Buffer =
    readFileAsync(
        path, options
    ).await()


suspend fun readFile(
    path: FileHandle,
    options: ReadFileBufferAsyncOptions = undefined.unsafeCast<Nothing>(),
): node.buffer.Buffer =
    readFileAsync(
        path, options
    ).await()


suspend fun readFile(path: PathLike, options: ReadFileStringAsyncOptions): String =
    readFileAsync(
        path, options
    ).await()


suspend fun readFile(path: PathLike, options: node.buffer.BufferEncoding): String =
    readFileAsync(
        path, options
    ).await()


suspend fun readFile(path: FileHandle, options: ReadFileStringAsyncOptions): String =
    readFileAsync(
        path, options
    ).await()


suspend fun readFile(path: FileHandle, options: node.buffer.BufferEncoding): String =
    readFileAsync(
        path, options
    ).await()


suspend fun readFile(
    path: PathLike,
    options: ReadFileAsyncOptions = undefined.unsafeCast<Nothing>(),
): Any /* string | Buffer */ =
    readFileAsync(
        path, options
    ).await()


suspend fun readFile(
    path: PathLike,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Any /* string | Buffer */ =
    readFileAsync(
        path, options
    ).await()


suspend fun readFile(
    path: FileHandle,
    options: ReadFileAsyncOptions = undefined.unsafeCast<Nothing>(),
): Any /* string | Buffer */ =
    readFileAsync(
        path, options
    ).await()


suspend fun readFile(
    path: FileHandle,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Any /* string | Buffer */ =
    readFileAsync(
        path, options
    ).await()
