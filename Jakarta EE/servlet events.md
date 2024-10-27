# Event Listeners

The servlet specification includes the capability to track key [events in Web applications through event listeners](https://docs.oracle.com/cd/B14099_19/web.1012/b14017/filters.htm#i1000654). This functionality allows more efficient resource management and automated processing based on event status.

```xml
<web-app>
   <listener>
      <listener-class>MySessionListe</listenerclass>
   </listener>
   <!-- servlets -->
</web-app>
```

```java
@WebListener // instead of configuring in web.xml
public class MySessionListeer implements ServletContextListener {
    // methods
}
```

In a multithreaded application, attribute changes may occur simultaneously. There is no requirement for the servlet container to synchronize the resulting notifications; the listener classes themselves are responsible for maintaining data integrity in such a situation.

## 1. Servlet context-level (application-level) event (javax.servlet)

This event involves resources or state held at the level of the application servlet context object.

### ServletContextListener 

- `contextInitialized(servletContextEvent)`: Servlet context creation, at which point the first request can be serviced 
- ` contextDestroyed(servletContextEvent)`: Imminent shutdown of the servlet context

### ServletContextAttributeListener

- `attributeAdded(scae)`: Addition of servlet context attributes
- `attributeRemoved(scae)`: Removal of servlet context attributes
- `attributeReplaced(scae)`: Replacement of servlet context attributes

## 2. Session-level event (javax.servlet.http)

This event involves resources or state associated with the series of requests from a single user session; that is, associated with the HTTP session object.

### HttpSessionListener

- `sessionCreated(hse)`: Session creation
- `sessionDestroyed(hse)`: Session invalidation
- Session timeout

### HttpSessionAttributeListener

- `attributeAdded(httpSessionBindingEvent)`: Addition of session attributes
- `attributeRemoved(hsbe)`: Removal of session attributes
- `attributeReplaced(hsbe)`: Replacement of session attributes