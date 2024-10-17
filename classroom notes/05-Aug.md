## File handling

```mermaid
graph
Closable
    InputStream
    OutputStream
    Reader
    Writer
```

`read()`, `write()`, `length()`

-1 is ASCII value of EOF

`FileOutputStream` will crate the file if not exists

Marker interface: interface with no methods

Serialization: object to data
Deserialization: data to Object

we need to implement the `Seriablizable` interface to store object into a file.

_transient_ (file handling): varible not participate in the serailization process.

## Design patterns

Gang of Four (23 design patterns)

- Creational
    - Factory
    - Singleton
- Structral
- Behavioural

