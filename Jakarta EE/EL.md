# JSP Expression Language (EL) ${expr}
makes it possible to easily access application data stored in JavaBeans components. JSP EL allows you to create expressions both (a) arithmetic and (b) logical.

The default scope is `pageScope`, which is used when the attribute declaration omits scope specification.

## Operators

`empty`, `not`, `or`, `and`, `le`, `ge`, `lt`, `gt`, `eq`, `mod`, `div`
## Implicit objects

1. pageScope
2. requestScope
3. sessionScope
4. applicationScope
5. param
6. paramValues
7. header
8. headerValues
9. initParam
10. cookie
11. pageContext

https://www.tutorialspoint.com/jsp/jsp_expression_language.html
