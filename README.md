# Wrong version of Kotlin with `java-gradle-plugin`

This is a repro for an issue where the Kotlin tests in a Gradle plugin that uses `java-gradle-plugin` run under the wrong version of Kotlin.

Run this to check the version of Kotlin in the runtime classpath:

```
$ ./gradlew dependencies --configuration testRuntimeClasspath
```

However, the test prints a different version:

```
./gradlew test
```
