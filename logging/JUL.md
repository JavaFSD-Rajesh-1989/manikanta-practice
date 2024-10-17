## java.util.logging (JUL)

Java Logging API was introduced in 1.4 (2002) Unfortunately the **JDK (<1.4) did not include logging in its original release** so by the time the Java Logging API was added several other logging frameworks had become widely used – in particular **Apache Commons Logging (JCL)** and **Log4j**.

The Java Logging API is provided with Java. Although the API is technically separate from the default implementation provided with Java, replacing it with an alternate implementation can be challenging so many developers confuse this implementation with the Java Logging API.

The core package includes support for delivering plain text or XML-formatted log records to memory, output streams, consoles, files, and sockets. In addition, the logging APIs are capable of interacting with logging services that already exist on the host operating system.

### Java Logging control flow

Applications make logging calls on `Logger` objects. These Logger objects allocate `LogRecord` objects which are passed to `Handler` objects for publication. Both `Logger` and `Handler` objects may use logging Level objects and (optionally) `Filter` objects to decide if they are interested in a particular LogRecord object. When it is necessary to publish a LogRecord object externally, a Handler object can (optionally) use a `Formatter` object to localize and format the message before publishing it to an I/O stream.

![Java logging control flow](https://docs.oracle.com/en/java/javase/11/core/img/java_pb_001a.png)


```java
var logger = Logger.getLogger(nameSpace); // com.example.util.DateFunctions
var logger = Logger.getAnonymousLogger(); // anonymous logger
```

The levels in descending order are:

- `Lovel.SEVERE` indicating a serious failure
- `Level.WARNING` indicating a potential problem
- `Level.INFO` informational messages
- `Level.CONFIG` static configuration messages
- `Level.FINE`  tracing message.
- `Level.FINER` fairly detailed tracing message
- `Level.FINEST` highly detailed tracing message
- `Level.OFF` turn off logging, 
- `Level.ALL` enable logging of all messages.

There are two different styles of logging methods, to meet the needs of different communities of users.

First, there are methods that take an explicit source class name and source method name. 

Second, there are a set of methods that do not take explicit source class or source method names. 

```java

logger.entering(clss, method, params)

logger.log(level, msg, params0) // or
logger.log(level, msg, thrown) // or
logger.log(logRecord) // or

```



## References
- [Wikipedia - Java logging framework](https://en.wikipedia.org/wiki/Java_logging_framework)
- [Oracle guide for logging APIs](https://docs.oracle.com/en/java/javase/11/core/java-logging-overview.html#GUID-B83B652C-17EA-48D9-93D2-563AE1FF8EDA)

