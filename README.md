# Checkers
Is a javafx application that contains AI features and human interaction.
## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Built With
* [org.openjfx](https://mvnrepository.com/artifact/org.openjfx/javafx/11) - JavaFX allows you to create Java applications with a modern, hardware-accelerated user interface that is highly portable.
### Prerequisites

JDK 11

##### using maven javafx command
```
# from your local repository boot directory, execute:
org.openjfx:javafx-maven-plugin:0.0.3:run
```
## Running the tests

Tests are executed by the `mvn clean test verify -Dspring.profiles.active=ci-test -Dspring.config.location=./config/` command

## Versioning

We use [Semantic versioning](http://semver.org/). For the versions available, see the [tags on this repository](https://github.com/Leensb/Checkers/releases).

## Author

* **Leen Wishahi** - *Application architecture and development*
