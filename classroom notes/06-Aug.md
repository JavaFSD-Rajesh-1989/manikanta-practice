## Logging

1. add dependency to `pom.xml`

```java
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.TTCCLayout;

// initiate logger with name
Logger log = Logger.getLogger("name");
FileAppender file = new FileAppender(new SimpleLayout(), filename);

log.addAppender(file);

// call log methods
log.info("information");
log.debug("Debug information");
log.error("error message", exception);
```

## Testing

### User Accepetance Testing
### Integration Testing

### Unit Testing

```mermaid
---
title: Object lifecycle
---
graph
    object
    testing
    object --> con
    con[Construction]
    des[Garbage/Destruction]
    con --> body
    body --> des

    testing --> setup[Setup `@Before`]
    setup --> cases[Test cases `@Test`]
    cases --> tear[Tear down `@After`]

```
object lives between new (construction) and garbage (destruction) phases.

`@BeforeClass`: it’s preferable to execute it only once before running all tests

`@AfterClass`: 
`@Before`
`@After`
`@Test`

## SQL transactions

**A**utomic, **C**Onsistancy, **I**solation, **D**urability principles.

it will work on centralized databaases not in distributed databases.
