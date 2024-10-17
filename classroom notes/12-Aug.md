## Map

map is not part of collection.

- `HashTable`: it does not allow null value for key and it is **thread safe**.
- `HasMap`: it allows null value for key and it is **faster**.
- `ConcurrentHashMap` used inside multi threading.

## Bucket collision

In the context of a HashMap, a "collision" means the hash code of two objects resulted in them being stored in the same bucket. Of course, this can result from the two objects returning the same value from hashCode(), but also (more likely) that their hash codes when used to compute the bucket resulted in the same bucket

> In computer science, a hash collision or hash clash[1] is **when two distinct pieces of data in a hash table share the same hash value**. The hash value in this case is derived from a hash function which takes a data input and returns a fixed length of bits.

A "collision" in the broader context of using hashes is a hash collision.

in JDK 1.8 LinkedList solution for the bucket solutions.

## Optional

A container object which may or may not contain a non-null value. If a value is present, `isPresent()` will return true and `get()` will return the value.

This is a [value-based](https://docs.oracle.com/javase/8/docs/api/java/lang/doc-files/ValueBased.html) class; use of identity-sensitive operations (including reference equality (==), identity hash code, or synchronization) on instances of Optional may have unpredictable results and should be avoided.

## Time & Space complexity

[How to determine the solution of a problem by looking at its constraints?](https://codeforces.com/blog/entry/21344)

## Threads

The program is in execution mode is known **process**.
Thread is memory management technique.


![](https://www.scientecheasy.com/wp-content/uploads/2020/06/thread-life-cycle.png)

Returns a string representation of this thread, including the thread's name, priority, and thread group.

Starvation in OS is a problem that occurs when low-priority processes are indefinitely blocked from executing due to high-priority processes

The critical section is a part of a program where a process or thread accesses shared resources, such as shared memory or files.

In Java, daemon threads are low-priority threads that run in the background to perform tasks such as garbage collection or provide services to user threads. The life of a daemon thread depends on the mercy of user threads,