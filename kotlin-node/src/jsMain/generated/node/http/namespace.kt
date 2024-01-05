// Generated by Karakum - do not modify it manually!

@file:JsModule("node:http")

package node.http


/* import * as stream from 'node:stream'; */

/* import { URL } from 'node:url'; */

/* import { EventEmitter } from 'node:events'; */

/* import { LookupOptions } from 'node:dns'; */

/* import { TcpSocketConnectOpts, Socket, Server as NetServer, LookupFunction } from 'node:net'; */

external val METHODS: js.array.ReadonlyArray<String>

external val STATUS_CODES: HttpStatusCodes

external var globalAgent: Agent

/**
 * Read-only property specifying the maximum allowed size of HTTP headers in bytes.
 * Defaults to 16KB. Configurable using the `--max-http-header-size` CLI option.
 */
external val maxHeaderSize: Double
