// Generated by Karakum - do not modify it manually!

package remix.run.router


sealed external interface RouterSubscriberOpts {
    var deletedFetchers: js.array.ReadonlyArray<String>
    var unstable_viewTransitionOpts: ViewTransitionOpts?
    var unstable_flushSync: Boolean
}
