// Generated by Karakum - do not modify it manually!


package node.perfHooks


sealed external interface Performance {
    /**
     * If name is not provided, removes all PerformanceMark objects from the Performance Timeline.
     * If name is provided, removes only the named mark.
     * @param name
     */
    fun clearMarks(name: String = definedExternally): Unit

    /**
     * If name is not provided, removes all PerformanceMeasure objects from the Performance Timeline.
     * If name is provided, removes only the named measure.
     * @param name
     * @since v16.7.0
     */
    fun clearMeasures(name: String = definedExternally): Unit

    /**
     * Returns a list of `PerformanceEntry` objects in chronological order with respect to `performanceEntry.startTime`.
     * If you are only interested in performance entries of certain types or that have certain names, see
     * `performance.getEntriesByType()` and `performance.getEntriesByName()`.
     * @since v16.7.0
     */
    fun getEntries(): js.array.ReadonlyArray<PerformanceEntry>

    /**
     * Returns a list of `PerformanceEntry` objects in chronological order with respect to `performanceEntry.startTime`
     * whose `performanceEntry.name` is equal to `name`, and optionally, whose `performanceEntry.entryType` is equal to `type`.
     * @param name
     * @param type
     * @since v16.7.0
     */
    fun getEntriesByName(name: String, type: EntryType = definedExternally): js.array.ReadonlyArray<PerformanceEntry>

    /**
     * Returns a list of `PerformanceEntry` objects in chronological order with respect to `performanceEntry.startTime`
     * whose `performanceEntry.entryType` is equal to `type`.
     * @param type
     * @since v16.7.0
     */
    fun getEntriesByType(type: EntryType): js.array.ReadonlyArray<PerformanceEntry>

    /**
     * Creates a new PerformanceMark entry in the Performance Timeline.
     * A PerformanceMark is a subclass of PerformanceEntry whose performanceEntry.entryType is always 'mark',
     * and whose performanceEntry.duration is always 0.
     * Performance marks are used to mark specific significant moments in the Performance Timeline.
     * @param name
     * @return The PerformanceMark entry that was created
     */
    fun mark(name: String = definedExternally, options: MarkOptions = definedExternally): PerformanceMark

    /**
     * Creates a new PerformanceMeasure entry in the Performance Timeline.
     * A PerformanceMeasure is a subclass of PerformanceEntry whose performanceEntry.entryType is always 'measure',
     * and whose performanceEntry.duration measures the number of milliseconds elapsed since startMark and endMark.
     *
     * The startMark argument may identify any existing PerformanceMark in the the Performance Timeline, or may identify
     * any of the timestamp properties provided by the PerformanceNodeTiming class. If the named startMark does not exist,
     * then startMark is set to timeOrigin by default.
     *
     * The endMark argument must identify any existing PerformanceMark in the the Performance Timeline or any of the timestamp
     * properties provided by the PerformanceNodeTiming class. If the named endMark does not exist, an error will be thrown.
     * @param name
     * @param startMark
     * @param endMark
     * @return The PerformanceMeasure entry that was created
     */
    fun measure(
        name: String,
        startMark: String = definedExternally,
        endMark: String = definedExternally,
    ): PerformanceMeasure

    fun measure(name: String, options: MeasureOptions): PerformanceMeasure

    /**
     * An instance of the PerformanceNodeTiming class that provides performance metrics for specific Node.js operational milestones.
     */
    val nodeTiming: PerformanceNodeTiming

    /**
     * @return the current high resolution millisecond timestamp
     */
    fun now(): Double

    /**
     * The timeOrigin specifies the high resolution millisecond timestamp from which all performance metric durations are measured.
     */
    val timeOrigin: Double

    /**
     * Wraps a function within a new function that measures the running time of the wrapped function.
     * A PerformanceObserver must be subscribed to the 'function' event type in order for the timing details to be accessed.
     * @param fn
     */
    fun <T : Function<Any?> /* (...params: any[]) => any */> timerify(
        fn: T,
        options: TimerifyOptions = definedExternally,
    ): T

    /**
     * eventLoopUtilization is similar to CPU utilization except that it is calculated using high precision wall-clock time.
     * It represents the percentage of time the event loop has spent outside the event loop's event provider (e.g. epoll_wait).
     * No other CPU idle time is taken into consideration.
     */
    var eventLoopUtilization: EventLoopUtilityFunction
}
