An annotation is a marker which associates information with a program construct, *but has no effect at run time.* In order for an annotation to affect the behavior of the system,

A **retention policy** specifies how long, in terms of the program lifecycle, the annotation should be retained for.
- source
- class
- runtime

The **target** of an annotation specifies which Java constructs an annotation can be applied to.

we declare a new annotation using the `@interface` keyword:

```java
public @interface MyAnnotation {
  public String value() default "";
}
```

Processing annotations is accomplished through the Java Reflection Application Programming Interface (API).

Additionally, the JLS specifies nine distinct contexts in which an annotation may appear:

1. Module declarations
2. Package declarations
3. Type declarations: class, interface, enum, and annotation type declarations
4. Method declarations (including elements of annotation types)
5. Constructor declarations
6. Type parameter declarations of generic classes, interfaces, methods, and constructors
7. Field declarations (including enum constants)
8. Formal and exception parameter declarations
9. Local variable declarations (including loop variables of for statements and resource variables of try-with-resources statements)

Java includes some important meta-annotations directly within the language specification:

- `@Target`: Describes the targets to which an annotation can be applied; this directly corresponds to the nine contexts above
- `@Retention`: Describes how long the annotation should be retained by the compiler
- `@Inherited`: Denotes that an annotation should be inherited by a subtype if applied to a supertype
- `@Deprecated`: Denotes that an annotation (or any other type) should no longer be used
- `@Repeatable`: Denotes that an annotation can be applied multiple times in the same context;

https://docs.oracle.com/javase/specs/jls/se11/html/jls-9.html#jls-9.7

https://dzone.com/articles/what-are-meta-annotations-in-java