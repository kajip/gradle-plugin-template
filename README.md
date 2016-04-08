Gradle Plugin Template
======================================

Gradle Plugin を作成するためのテンプレートプロジェクト

## 概要

Gradle Plugin を作成するためのテンプレートプロジェクト

## 設定方法

build.gradle に下記設定を追加します

```groovy
buildscript {

    dependencies {
        classpath 'org.kajip:hello-plugin:1.0.0'
    }
}

apply plugin: 'kajip.hello'

// Plugin の設定
hello {
    name 'Hanako'
    greeting 'Ciao'
}
```

## タスク

* sayHello ... 挨拶します

## プロパティ

* hello.name (String): 名前（デフォルト：Taro）
* hello.greeting (String): 名前（デフォルト：Hello）

## 依存関係

* JDK1.8 以上
* Gradle 2.6 以上

## 注意事項

特にありません

## 既知の問題

特にありません
