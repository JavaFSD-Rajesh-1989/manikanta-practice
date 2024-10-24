## ServletConfig

A servlet configuration object used by a servlet container to pass information to a servlet during initialization.

web.xml
```xml
<web-app>  
  <servlet>  
    <!-- other stuff -->
    <init-param>  
      <param-name>name</param-name>  
      <param-value>value</param-value>  
    </init-param>
  </servlet>  
</web-app>
```
```java
@WebServlet(
    initParams = {
        @WebInitParam(name = "dbUrl", value = "jdbc:mysql://localhost:3306/mydb"),
        @WebInitParam(name = "maxConnections", value = "10")
    }
)
```

accessing initialization parameter
```java
config.getInitParameter('name');
```
