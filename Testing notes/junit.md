1. What is test driven development?
2. Unit teting vs Integration testing?
3. Junit
4. Line vs Branch coverage
5. Mocking
6. Stubs
7. Unit testing activity

JUnit is a unit testing framework to write and run repeatable automated tests on Java. It provides a robust environment to write, organize, and execute automated tests, ensuring code reliability and repeatability. Its user-friendly annotations and assert methods facilitate the development and running of test cases, making it a foundational tool for Java developers focusing on quality assurance and test-driven development.


```xml
<!-- https://mvnrepository.com/artifact/junit/junit Feb 13, 2021-->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

## Assertions
`org.junit.Assert` contains a set of assertion methods useful for writing tests. Only failed assertions are recorded. These methods can be used directly: `Assert.assertEquals(...)`, however, they read better if they are referenced through **static import**

JUnit provides overloaded assertion methods for all primitive types and Objects and arrays (of primitives or Objects).

The parameter order is expected value followed by actual value. Optionally the first parameter can be a String message that is output on failure. 

- **`Equals`**: Asserts that two objects are equal. `NotEquals` (asserts they are not equal).
  
- **`False`**: Asserts that a condition is false. `True` (asserts that a condition is true).

- **`ArrayEquals`**: Asserts that two arrays are equal. 

- **`NotNull`**: Asserts that an object is not null. `Null` (asserts that an object is null).

- **`NotSame`**: Asserts that two objects do not refer to the same instance. `Same` (asserts they refer to the same instance).

- **`Throws`**: Asserts that a piece of code throws an exception of a specific type. 

- **`DoesNotThrow`** (JUnit 5): Asserts that a piece of code does not throw any exception.

- **`Timeout`** (JUnit 5): Asserts that a piece of code completes within a specified duration.

