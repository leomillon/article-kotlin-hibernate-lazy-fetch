# Kotlin-Hibernate LAZY fetch demo

Code related to an article about configuration correctly the LAZY fetch mode in your Kotlin, Hibernate, SpringBoot project.

## Summary

To enable LAZY fetch mode with Hibernate and Kotlin, don't forget to "open" your entities via the following configuration:

`build.gradle.kts`
```kotlin
allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}
```

## Article

// TODO add link to article

## Run the test

```shell script
./gradlew clean test --tests "com.leomillon.example.lazyfetchdemo.repository.CommentRepositoryTest.should get comment author"
```
