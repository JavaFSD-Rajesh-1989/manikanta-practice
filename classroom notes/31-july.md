## Creating git repository

creating a git repository and pusing into the origin using commands.
using credential manager for storing GitHub authentication.

## Polymorphism

- Method signature is same (name, number of, sequence and datatypes of parameters)
- return type must be same
- in throwing exception should not towards parent.
- specifier must not narrow **(private, default, protected, public)**.
- Method **overloading** / Compiletime polymorphism / Compile time binding.
- Method **overriding** / Runtime polumorphism / Dynamic binding.

in **interface** by default all the methods `public abstract`, variables are `public static final`.

## `static` modifier

- (class members)
- Singleton,
- Facory design pattern.
- A static method is not overriden.
- in static methods `this`, `super` keywords are not usable.

System will create the memory for all static properties of classes. it's not recommended to declare unnecessary members as static.

```java
  class B {
      static int b;
      int add(int c) { return b+c; }
      static void message() {
          System.out.println("Count "+b);
      }

      public static void main(String[] args) {
          B b = new B();
          b.add(20);
      }
  }

  class C {
      void info() {
          B.message();
      }
  }
```

a static block is a set of instructions that is run only once when a class is loaded into memory. A static block is also called a static initialization block. System only one once allocate the memory for `static {}`.

## `final` modifier

- a class will not be a parent
- a varible is a constant
- a method is not overriden.

## `this`, `super` keywords

- there is a **zero parametorized default custructor** for every class if not there is user defined constructor.
- `this` references the current instance.
- `super(...)` calls the parent's constructor and must be first statmement in child constructor.
- `super.*` to call parent's properties and methods.
- in overriding we will use `super` keyword.

## constructor chaining

Constructor chaining is the process of calling one constructor from another constructor with respect to current object.

- Within same class: It can be done using `this(...)` keyword for constructors in the same class
- From base class: by using `super(...)` keyword to call the constructor from the base class.

> Every constructor calls up the chain till the class at the top is reached. we need to override one of the parent's constructor if there is no default constructor.

## Modifiers

- _abstract_ (in-complete)
- _synchronized_ (thread safe)
- _transiant_ (file handling): skips the serialization
- _volatile_ (concurrency)
- _native_ (native APIs / JNI)
- _strictfp_ (striclty evaluate floating points).

## Array

In java mermory allocated at runtime

```java
int i[size] // error
int i[] = new int[size]; // with size
int i[] = {a, b, c, d} // with default values
```

points
- `System.out` is a static & final object of `PrintStream` class.
