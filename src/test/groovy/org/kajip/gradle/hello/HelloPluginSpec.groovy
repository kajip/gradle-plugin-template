package org.kajip.gradle.hello

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class HelloPluginSpec extends Specification {

    def "Pluginがプロジェクトにタスクを追加するテスト"() {
        setup:
        Project project = ProjectBuilder.builder().build()

        when:
        project.apply plugin: pluginName

        then:
        project.hello instanceof HelloExtension
        project.hello.name == name
        project.hello.greeting == greeting

        project.tasks.sayHello instanceof HelloTask

        where:
        pluginName    || name   | greeting
        'kajip.hello' || 'Taro' | 'Hello'
    }

    def "パラメータを変更するテスト"() {
        setup:
        Project project = ProjectBuilder.builder().build()

        when:
        project.apply plugin: pluginName
        project.hello.name = name
        project.hello.greeting = greeting

        then:
        // Extentionアクセス
        project.hello instanceof HelloExtension
        project.hello.name == name
        project.hello.greeting == greeting

        // タスク登録の確認
        project.tasks.sayHello instanceof HelloTask

        where:
        pluginName    || name     | greeting
        'kajip.hello' || 'Hanako' | 'Ciao'
    }
}
