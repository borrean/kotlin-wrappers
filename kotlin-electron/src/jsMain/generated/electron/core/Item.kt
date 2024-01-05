// Generated by Karakum - do not modify it manually!


package electron.core


external interface Item {
    /**
     * The path to the file being dragged.
     */
    var file: String

    /**
     * The paths to the files being dragged. (`files` will override `file` field)
     */
    var files: js.array.ReadonlyArray<String>?

    /**
     * The image must be non-empty on macOS.
     */
    var icon: Any /* (NativeImage) | (string) */
}
