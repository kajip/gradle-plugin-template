package org.kajip.gradle.hello

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class HelloTask extends DefaultTask {

    @TaskAction
    def invoke() {

        // Extensionの取得
        HelloExtension extension = getProject().hello

        // パラメータ取得
        def name = extension.name
        def greeting = extension.greeting

        println "$greeting, $name"
    }
}
