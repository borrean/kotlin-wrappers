// Generated by Karakum - do not modify it manually!

@file:JsModule("node:http")

package node.http

import node.net.Socket
import web.url.URL

/**
 * This object is created internally and returned from {@link request}. It
 * represents an _in-progress_ request whose header has already been queued. The
 * header is still mutable using the `setHeader(name, value)`,`getHeader(name)`, `removeHeader(name)` API. The actual header will
 * be sent along with the first data chunk or when calling `request.end()`.
 *
 * To get the response, add a listener for `'response'` to the request object.`'response'` will be emitted from the request object when the response
 * headers have been received. The `'response'` event is executed with one
 * argument which is an instance of {@link IncomingMessage}.
 *
 * During the `'response'` event, one can add listeners to the
 * response object; particularly to listen for the `'data'` event.
 *
 * If no `'response'` handler is added, then the response will be
 * entirely discarded. However, if a `'response'` event handler is added,
 * then the data from the response object **must** be consumed, either by
 * calling `response.read()` whenever there is a `'readable'` event, or
 * by adding a `'data'` handler, or by calling the `.resume()` method.
 * Until the data is consumed, the `'end'` event will not fire. Also, until
 * the data is read it will consume memory that can eventually lead to a
 * 'process out of memory' error.
 *
 * For backward compatibility, `res` will only emit `'error'` if there is an`'error'` listener registered.
 *
 * Node.js does not check whether Content-Length and the length of the
 * body which has been transmitted are equal or not.
 * @since v0.1.17
 */

external class ClientRequest : OutgoingMessage<IncomingMessage> {
    constructor (url: String, cb: (res: IncomingMessage) -> Unit = definedExternally)

    constructor (url: URL, cb: (res: IncomingMessage) -> Unit = definedExternally)

    constructor (url: ClientRequestArgs, cb: (res: IncomingMessage) -> Unit = definedExternally)

    /**
     * The `request.aborted` property will be `true` if the request has
     * been aborted.
     * @since v0.11.14
     * @deprecated Since v17.0.0,v16.12.0 - Check `destroyed` instead.
     */
    var aborted: Boolean

    /**
     * The request host.
     * @since v14.5.0, v12.19.0
     */
    var host: String

    /**
     * The request protocol.
     * @since v14.5.0, v12.19.0
     */
    var protocol: String

    /**
     * When sending request through a keep-alive enabled agent, the underlying socket
     * might be reused. But if server closes connection at unfortunate time, client
     * may run into a 'ECONNRESET' error.
     *
     * ```js
     * const http = require('http');
     *
     * // Server has a 5 seconds keep-alive timeout by default
     * http
     *   .createServer((req, res) => {
     *     res.write('hello\n');
     *     res.end();
     *   })
     *   .listen(3000);
     *
     * setInterval(() => {
     *   // Adapting a keep-alive agent
     *   http.get('http://localhost:3000', { agent }, (res) => {
     *     res.on('data', (data) => {
     *       // Do nothing
     *     });
     *   });
     * }, 5000); // Sending request on 5s interval so it's easy to hit idle timeout
     * ```
     *
     * By marking a request whether it reused socket or not, we can do
     * automatic error retry base on it.
     *
     * ```js
     * const http = require('http');
     * const agent = new http.Agent({ keepAlive: true });
     *
     * function retriableRequest() {
     *   const req = http
     *     .get('http://localhost:3000', { agent }, (res) => {
     *       // ...
     *     })
     *     .on('error', (err) => {
     *       // Check if retry is needed
     *       if (req.reusedSocket &#x26;&#x26; err.code === 'ECONNRESET') {
     *         retriableRequest();
     *       }
     *     });
     * }
     *
     * retriableRequest();
     * ```
     * @since v13.0.0, v12.16.0
     */
    var reusedSocket: Boolean

    /**
     * Limits maximum response headers count. If set to 0, no limit will be applied.
     */
    var maxHeadersCount: Double

    /**
     * The request method.
     * @since v0.1.97
     */
    var method: String

    /**
     * The request path.
     * @since v0.4.0
     */
    var path: String

    /**
     * Marks the request as aborting. Calling this will cause remaining data
     * in the response to be dropped and the socket to be destroyed.
     * @since v0.3.8
     * @deprecated Since v14.1.0,v13.14.0 - Use `destroy` instead.
     */
    fun abort(): Unit
    fun onSocket(socket: Socket): Unit

    /**
     * Once a socket is assigned to this request and is connected `socket.setTimeout()` will be called.
     * @since v0.5.9
     * @param timeout Milliseconds before a request times out.
     * @param callback Optional function to be called when a timeout occurs. Same as binding to the `'timeout'` event.
     */
    override fun setTimeout(msecs: Number, callback: () -> Unit): Unit /* this */

    /**
     * Once a socket is assigned to this request and is connected `socket.setNoDelay()` will be called.
     * @since v0.5.9
     */
    fun setNoDelay(noDelay: Boolean = definedExternally): Unit

    /**
     * Once a socket is assigned to this request and is connected `socket.setKeepAlive()` will be called.
     * @since v0.5.9
     */
    fun setSocketKeepAlive(enable: Boolean = definedExternally, initialDelay: Number = definedExternally): Unit

    /**
     * Returns an array containing the unique names of the current outgoing raw
     * headers. Header names are returned with their exact casing being set.
     *
     * ```js
     * request.setHeader('Foo', 'bar');
     * request.setHeader('Set-Cookie', ['foo=bar', 'bar=baz']);
     *
     * const headerNames = request.getRawHeaderNames();
     * // headerNames === ['Foo', 'Set-Cookie']
     * ```
     * @since v15.13.0, v14.17.0
     */
    fun getRawHeaderNames(): js.array.ReadonlyArray<String>

    /**
     * @deprecated
     */
    fun addListener(event: ClientRequestEvent.ABORT, listener: () -> Unit): Unit /* this */
    fun addListener(
        event: ClientRequestEvent.CONNECT,
        listener: (response: IncomingMessage, socket: Socket, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun addListener(event: ClientRequestEvent.CONTINUE, listener: () -> Unit): Unit /* this */
    fun addListener(event: ClientRequestEvent.INFORMATION, listener: (info: InformationEvent) -> Unit): Unit /* this */
    fun addListener(event: ClientRequestEvent.RESPONSE, listener: (response: IncomingMessage) -> Unit): Unit /* this */
    fun addListener(event: ClientRequestEvent.SOCKET, listener: (socket: Socket) -> Unit): Unit /* this */
    fun addListener(event: ClientRequestEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    fun addListener(
        event: ClientRequestEvent.UPGRADE,
        listener: (response: IncomingMessage, socket: Socket, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun addListener(event: ClientRequestEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun addListener(event: ClientRequestEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun addListener(event: ClientRequestEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun addListener(event: ClientRequestEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun addListener(event: ClientRequestEvent.PIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun addListener(event: ClientRequestEvent.UNPIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    override fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun addListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    /**
     * @deprecated
     */
    fun on(event: ClientRequestEvent.ABORT, listener: () -> Unit): Unit /* this */
    fun on(
        event: ClientRequestEvent.CONNECT,
        listener: (response: IncomingMessage, socket: Socket, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun on(event: ClientRequestEvent.CONTINUE, listener: () -> Unit): Unit /* this */
    fun on(event: ClientRequestEvent.INFORMATION, listener: (info: InformationEvent) -> Unit): Unit /* this */
    fun on(event: ClientRequestEvent.RESPONSE, listener: (response: IncomingMessage) -> Unit): Unit /* this */
    fun on(event: ClientRequestEvent.SOCKET, listener: (socket: Socket) -> Unit): Unit /* this */
    fun on(event: ClientRequestEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    fun on(
        event: ClientRequestEvent.UPGRADE,
        listener: (response: IncomingMessage, socket: Socket, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun on(event: ClientRequestEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun on(event: ClientRequestEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun on(event: ClientRequestEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun on(event: ClientRequestEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun on(event: ClientRequestEvent.PIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun on(event: ClientRequestEvent.UNPIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    override fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun on(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    /**
     * @deprecated
     */
    fun once(event: ClientRequestEvent.ABORT, listener: () -> Unit): Unit /* this */
    fun once(
        event: ClientRequestEvent.CONNECT,
        listener: (response: IncomingMessage, socket: Socket, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun once(event: ClientRequestEvent.CONTINUE, listener: () -> Unit): Unit /* this */
    fun once(event: ClientRequestEvent.INFORMATION, listener: (info: InformationEvent) -> Unit): Unit /* this */
    fun once(event: ClientRequestEvent.RESPONSE, listener: (response: IncomingMessage) -> Unit): Unit /* this */
    fun once(event: ClientRequestEvent.SOCKET, listener: (socket: Socket) -> Unit): Unit /* this */
    fun once(event: ClientRequestEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    fun once(
        event: ClientRequestEvent.UPGRADE,
        listener: (response: IncomingMessage, socket: Socket, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun once(event: ClientRequestEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun once(event: ClientRequestEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun once(event: ClientRequestEvent.ERROR, listener: (err: Throwable /* JsError */) -> Unit): Unit /* this */
    fun once(event: ClientRequestEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun once(event: ClientRequestEvent.PIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun once(event: ClientRequestEvent.UNPIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    override fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun once(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    /**
     * @deprecated
     */
    fun prependListener(event: ClientRequestEvent.ABORT, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: ClientRequestEvent.CONNECT,
        listener: (response: IncomingMessage, socket: Socket, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun prependListener(event: ClientRequestEvent.CONTINUE, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: ClientRequestEvent.INFORMATION,
        listener: (info: InformationEvent) -> Unit,
    ): Unit /* this */

    fun prependListener(
        event: ClientRequestEvent.RESPONSE,
        listener: (response: IncomingMessage) -> Unit,
    ): Unit /* this */

    fun prependListener(event: ClientRequestEvent.SOCKET, listener: (socket: Socket) -> Unit): Unit /* this */
    fun prependListener(event: ClientRequestEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: ClientRequestEvent.UPGRADE,
        listener: (response: IncomingMessage, socket: Socket, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun prependListener(event: ClientRequestEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependListener(event: ClientRequestEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun prependListener(
        event: ClientRequestEvent.ERROR,
        listener: (err: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    fun prependListener(event: ClientRequestEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun prependListener(event: ClientRequestEvent.PIPE, listener: (src: node.stream.Readable) -> Unit): Unit /* this */
    fun prependListener(
        event: ClientRequestEvent.UNPIPE,
        listener: (src: node.stream.Readable) -> Unit,
    ): Unit /* this */

    override fun prependListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    /**
     * @deprecated
     */
    fun prependOnceListener(event: ClientRequestEvent.ABORT, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: ClientRequestEvent.CONNECT,
        listener: (response: IncomingMessage, socket: Socket, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: ClientRequestEvent.CONTINUE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: ClientRequestEvent.INFORMATION,
        listener: (info: InformationEvent) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ClientRequestEvent.RESPONSE,
        listener: (response: IncomingMessage) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: ClientRequestEvent.SOCKET, listener: (socket: Socket) -> Unit): Unit /* this */
    fun prependOnceListener(event: ClientRequestEvent.TIMEOUT, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: ClientRequestEvent.UPGRADE,
        listener: (response: IncomingMessage, socket: Socket, head: node.buffer.Buffer) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: ClientRequestEvent.CLOSE, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(event: ClientRequestEvent.DRAIN, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: ClientRequestEvent.ERROR,
        listener: (err: Throwable /* JsError */) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(event: ClientRequestEvent.FINISH, listener: () -> Unit): Unit /* this */
    fun prependOnceListener(
        event: ClientRequestEvent.PIPE,
        listener: (src: node.stream.Readable) -> Unit,
    ): Unit /* this */

    fun prependOnceListener(
        event: ClientRequestEvent.UNPIPE,
        listener: (src: node.stream.Readable) -> Unit,
    ): Unit /* this */

    override fun prependOnceListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependOnceListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */
}
