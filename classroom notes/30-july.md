## JDK {tools}

- javac
- java
- javap: command disassembles one or more class files
- jdb
- javap
- javadoc
- appletviewer

## JRE {java class library}

[Java JDK 7 file structure](https://docs.oracle.com/javase/7/docs/technotes/tools/solaris/jdkfiles.html).
`java.lang` package is default in java it automatically comes.
All the inbuilt packages are in `jre/lib/rt.jar`.
`Object` class is the mother of all classes.

## JVM

- user defined (custom), boostrap class loaders (in-built)
- verification
- validation and optimization process
- garbage collection
- native API: Connect with OS information and gernerates `*.obj` file.

## Garbage collection

[**dangling pointer**](https://en.wikipedia.org/wiki/Dangling_pointer#:~:text=In%20languages%20like%20Java%2C%20dangling,longer%20reachable%20from%20any%20references.) is a pointer without memory it will cauase the memory leak issue. _garbage_ means unreachable memory (without pointer). In low vertual memeory system (JVM) will run process called `System.gc` and this process will find all the garbages then system will call `finalize()`, and this will remove garbages.

- [Alternatives](https://docs.oracle.com/javase/9/docs/api/java/lang/Object.html#finalize--)
- [Issues wth finalization](https://www.baeldung.com/java-18-deprecate-finalization)

## Pass by value/refrence

- Pass by value: new memory for new vale
- Pass by refrence: using or overriding same memory

## Strings

`String`

- pass by value
- immutable
- every character will take 2 bytes space
- character mode


`StringBuffer`

- character takes 1 byte.
- pass by reference
- byte mode
- thread safe, all methods are synchronized.

`StringBuilder`

- similar to StringBuffer
- not thread safe


**DTO (Data Transfer Object)** is used transfer data between layers.

