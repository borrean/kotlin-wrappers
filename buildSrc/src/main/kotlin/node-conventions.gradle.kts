import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnLockMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

plugins.withType<YarnPlugin> {
    the<YarnRootExtension>().apply {
        version = "1.22.21"
        lockFileDirectory = projectDir
        yarnLockMismatchReport = YarnLockMismatchReport.NONE
        ignoreScripts = false
    }
}

plugins.withType<NodeJsRootPlugin> {
    the<NodeJsRootExtension>().apply {
        nodeVersion = "20.11.0"
    }
}
