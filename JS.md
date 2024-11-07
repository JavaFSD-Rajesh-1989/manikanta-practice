The umbrella term "JavaScript" as understood in a web browser context contains several very different elements.

> JavaScript = ECMAScript + Web APIs
### The core language 
The core language of JavaScript is standardized by the **ECMA TC39** committee as a language named **ECMAScript**. This core language is also used in non-browser environments, for example in Node.js.

- Language syntax
- Error handling mechanisms
- Types
- A prototype-based inheritance mechanism
- Built-in objects and functions
- Strict mode
- [module system](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Modules)
- Basic memory model
- Internationalization API

This standard defines an interface definition language, [Web IDL](https://webidl.spec.whatwg.org/), that can be used to describe interfaces that are intended to be implemented in web browsers.

The Document Object Model **(DOM)** is a cross-platform, *language-independent* convention for representing and interacting with objects in HTML, XHTML and XML documents. Objects in the DOM tree may be addressed and manipulated by using methods on the objects

- **The document structure**, a tree model, and the DOM Event architecture in [DOM core](https://dom.spec.whatwg.org/): [`Node`](https://developer.mozilla.org/en-US/docs/Web/API/Node), [`Element`](https://developer.mozilla.org/en-US/docs/Web/API/Element), [`DocumentFragment`](https://developer.mozilla.org/en-US/docs/Web/API/DocumentFragment), [`Document`](https://developer.mozilla.org/en-US/docs/Web/API/Document), [`DOMImplementation`](https://developer.mozilla.org/en-US/docs/Web/API/DOMImplementation), [`Event`](https://developer.mozilla.org/en-US/docs/Web/API/Event), [`EventTarget`](https://developer.mozilla.org/en-US/docs/Web/API/EventTarget), …
- A less rigorous definition of the DOM **Event Architecture**, as well as specific events in [DOM events](https://w3c.github.io/uievents/).
- **Other things** such as [DOM Traversal](https://www.w3.org/TR/DOM-Level-2-Traversal-Range/traversal.html) and [DOM Range](https://dom.spec.whatwg.org/#ranges).

[HTML](https://html.spec.whatwg.org/multipage/), the Web's markup language, is specified in terms of the DOM. Layered above the abstract concepts defined in DOM Core, HTML also defines the _meaning_ of elements. The HTML specification also defines restrictions on documents

