# Java Quiz

> Created and maintained by veben
>
> *Last updated: 2020/05/19*

## ⚙ Required technologies
- JDK: openjdk-14
    - Download: [Binary](https://jdk.java.net/14/)
    - Create environment variable: **JAVA_HOME**=`‪C:\Env\tools\jdk\openjdk-14`
    - Add `%JAVA_HOME%\bin` to **Path** env var
    > Know your version:
    ```sh
     java --version
    ```

## ❓ Quiz parts
- [ ] [Java 8](src/test/resources/java8.md)
- [ ] [Medley](src/test/resources/medley.md)

## 🚀 Launch all tests

```sh
mvnw clean test
```