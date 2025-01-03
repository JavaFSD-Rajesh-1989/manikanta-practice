# JSP Syntax Elements

- _directives_, which convey information regarding the JSP page as a whole
- _scripting elements_, which are Java coding elements
- _objects_ and _scopes_, where JSP objects can be created either explicitly or implicitly and are accessible within a given scope, such as from anywhere in the JSP page or the session
- _actions_, which create objects or affect the output stream in the JSP response (or both)

## 1. Directives

Directives provide instruction to the JSP container regarding the entire JSP page. This information is used in translating or executing the page.

There are three directives in JSP.

**The include directive** is used to include one JSP or HTML in another JSP. The include directive line will be replaced with the content of the included JSP or HTML **at translation time (static include)**. The include directive can specify either a page-relative or context-relative location.

```jsp
<%@ include file="path to file">
```

**Page Directives :** JSP page directive is used to define the properties applying the JSP page

```jsp
<%@ page
    import="package, package2"
    contentType="text/html"
    errorPage=""
    isErrorPage=""
    session=""
    isThreadSafe=""
    language="java" // scripting lanugage
>
```

**taglib** directive to specify a library of custom JSP tags that will be used in the JSP page.

This directive indicates the location of a tag library description file and a prefix to distinguish use of tags from that library.

```jsp
<%@ taglib uri="/oracustomtags" prefix="oracust" %>
```

## 2. Scripting Elements

**declarations-- `<%! %>`** These are statements declaring methods or member variables that will be used in the JSP page.

> In the servlet class code generated by the JSP translator, members will be declared at the class top level.

**expressions-- `<%= %>`** These are Java expressions that are evaluated, converted into string values (but not in request-time attributes) as appropriate, and displayed where they are encountered on the page.

**scriptlets-- `<% %>`** These are portions of Java code intermixed within the markup language of the page.

A scriptlet, or code fragment, may consist of anything from a partial line to multiple lines of Java code

> In the servlet class code generated by the JSP translator, variables will be declared as a variable within the service method of the servlet.

**comments-- `<%-- --%>`** These are developer comments embedded within the JSP code, similar to comments embedded within any Java code.

## 3. Objects

JSP object refers to a Java class instance declared within or accessible to a JSP page. JSP objects can be either:

**Explicit objects** are declared and created within the code of JSP page, accessible to that page and other pages according to the scope setting.

We can also create objects within Java scriptlets or declarations.

```jsp
<jsp:useBean
    id="pageBean"
    class="mybeans.NameBean"
    scope="page" />
```

**Implicit objects** These are Java class instances that are created automatically by the JSP mechanism and that allow interaction with the underlying servlet environment.

1. `page`: is an instance(**this**) of the JSP page implementation class that was created when the page was translated.

2. `request`: This represents an HTTP request and is an instance of a class that implements the `HttpServletRequest` interface.

3. `response`: This represents an HTTP response. The response and request objects for a particular request are associated with each other.

4. `pageContext`: This represents the page context of a JSP page, which is provided for storage and access of all **page scope** objects of a JSP page instance.

   The pageContext object has page scope, making it accessible only to the JSP page instance with which it is associated.

5. `session`: This represents an HTTP session

6. `application`: This represents the servlet context for the Web **application**.

7. `out`: This is an object that is used to write content to the output stream of a JSP page instance. It is an instance of the `JspWriter` class

   The out object is associated with the **response** object for a particular request.

8. `config`: This represents the [servlet configuration](ServletConfig.md) for a JSP page.

9. `exception`: The implicit exception object is a `Exception` instance that represents the uncaught exception that was thrown from another JSP page and that resulted in this [JSP error page](error%20page.md) being invoked.

### Scopes

- **page:** The object is accessible only from within the JSP page where it was created.
- **request:** The object is accessible from any JSP page servicing the same HTTP request that is serviced by the JSP page that created the object.
- **session:** The object is accessible from any JSP page sharing the same HTTP session as the JSP page that created the object.
- **application:** the object is accessible from any JSP page used in the same Web application (within any single Java virtual machine) as the JSP page that created the object.

> Note that when the user refreshes the page while executing a JSP page, new instances will be created of all page-scope objects.

## 4. Actions

Action elements use a set of standard JSP tags that begin with `<jsp:` syntax. JSP action elements result in some sort of action occurring **while the JSP page is being executed**, such as

### creating a JavaBean instance and accessing its properties

creating an instance of a specified JavaBean class, giving the instance a specified name, and defines the scope within which it is accessible

```jsp
<jsp:useBean id="pageBean" class="mybeans.NameBean" scope="page" />
```

setting one or more properties of a bean.

```jsp
<jsp:setProperty name="pageBean" property="user" value="Smith" />
```

We can also directly specify a value for a specified property, or take the value for a specified property from an associated HTTP request parameter, or iterate through a series of properties and values from the HTTP request parameters.

```jsp
<jsp:setProperty name="pageBean" property="user" param="username" />
<jsp:setProperty name="pageBean" property="user" />
<jsp:setProperty name="pageBean" property="*" />
```

accessing bean property value

```jsp
<jsp:getProperty name="pageBean" property="user" />
```

### forwarding execution to another HTML page, JSP page, or servlet

The `jsp:forward` action effectively terminates execution of the current page, discards its output, and dispatches a new page--either an HTML page, a JSP page, or a servlet.

```jsp
<jsp:forward page="/templates/userinfopage.jsp" >
   <jsp:param name="username" value="Smith" />
   <jsp:param name="userempno" value="9876" />
</jsp:forward>
```

### including an external resource in the JSP page

The jsp:include action inserts additional static or dynamic resources into the page at request time as the page is displayed. Specify the resource with a relative URL 

```jsp
<jsp:include page="/templates/userinfopage.jsp" flush="true" />
```

### executing applet at client browser

The `jsp:plugin` action results in the execution of a specified applet or JavaBean in the client browser, preceded by a download of Java plugin software if necessary.

------

References
- https://docs.oracle.com/cd/A97336_01/buslog.102/a83726/genlovw3.htm
- https://www.jtcindia.org/tutorials/JSP/jsp_standard_actions.php
- https://docs.oracle.com/cd/A97336_01/buslog.102/a83726/keydev1.htm