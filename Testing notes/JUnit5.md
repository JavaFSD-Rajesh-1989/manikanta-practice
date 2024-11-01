JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage

Platform Concepts
Container
a node in the test tree that contains other containers or tests as its children (e.g. a test class).

Test
a node in the test tree that verifies expected behavior when executed (e.g. a @Test method).

Jupiter Concepts
Lifecycle Method
any method that is directly annotated or meta-annotated with @BeforeAll, @AfterAll, @BeforeEach, or @AfterEach.

Test Class
any top-level class, static member class, or @Nested class that contains at least one test method, i.e. a container. Test classes must not be abstract and must have a single constructor. Java record classes are supported as well.

Test Method
any instance method that is directly annotated or meta-annotated with @Test, @RepeatedTest, @ParameterizedTest, @TestFactory, or @TestTemplate. With the exception of @Test, these create a container in the test tree that groups tests or, potentially (for @TestFactory), other containers

