# hooks4k
A simple way to receive GitHub webhooks events in Kotlin.

###Getting Started
```kotlin
val hooks = Webhooks("/github", AppConfiguration(port = 8080))

hooks.events.on<WatchEvent> {
    println("${sender.login} starred ${repository.name}!")
}

hooks.start()
```

###Gradle
```
repositories {
    ...
    maven { url 'https://jitpack.io' }
}

dependencies {
    compile 'com.github.GrandPanda:hooks4k:-SNAPSHOT'
}
```