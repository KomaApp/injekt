# Koma Injekt

Thread-safe dependency injection library for Koma, built on top of [Kohesive Injekt](https://github.com/kohesive/injekt).

## Features

- Thread-safe singleton factory implementation
- Concurrent dependency registration and resolution
- Support for keyed factories and per-thread instances
- Logger factory support
- Type-safe dependency injection

## Usage

Add `jitpack.io` repository to your root `build.gradle.kts` file:
```gradle.kts
dependencyResolutionManagement {
    repositories {
        ...
        maven(url = "https://www.jitpack.io")
    }
}
```

Add library to dependencies:
```gradle.kts
dependencies {
    implementation("com.github.koma:injekt:1.0.0")
}
```

Initialize in your application:
```kotlin
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        patchInjekt()
        // Initialize your modules
    }
}
```

## License

MIT License
