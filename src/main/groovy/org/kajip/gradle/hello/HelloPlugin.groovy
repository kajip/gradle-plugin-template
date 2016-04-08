package org.kajip.gradle.hello

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * プラグイン本体
 */
class HelloPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        // パラメータ設定用のExtensionを追加
        project.extensions.create("hello", HelloExtension)

        // タスクの定義
        project.task('sayHello', type: HelloTask)
    }
}
