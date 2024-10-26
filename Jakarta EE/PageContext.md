## PageContext


- a single API to manage the various scoped namespaces
- a number of convenience API's to access various public objects (implicit objects) `
getException(), getPage() getRequest(), getResponse(), getSession(), getServletConfig() and getServletContext()`
- a mechanism to obtain the JspWriter for output `getOut()`
- a mechanism to manage session usage by the page `getSession()`
- a mechanism to expose page directive attributes to the scripting environment
- mechanisms to forward or include the current request to other active components in the application `forward(), include()`
- a mechanism to handle errorpage exception processing `handlePageException()`
