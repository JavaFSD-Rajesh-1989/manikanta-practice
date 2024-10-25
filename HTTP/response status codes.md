# HTTP response status codes
HTTP response status codes indicate whether a specific HTTP request has been successfully completed. Responses are grouped in five classes:

- Informational responses (`100` – `199`)
- Successful responses (`200` – `299`)
- Redirection messages (`300` – `399`)
- Client error responses (`400` – `499`)
- Server error responses (`500` – `599`)

Some of the status codes defined by [RFC 9110](https://httpwg.org/specs/rfc9110.html#overview.of.status.codes).

| **Code** | **Status**                    | **Description**                                                                                  |
|----------|-------------------------------|--------------------------------------------------------------------------------------------------|
| **100**  | Continue                      | Initial part of a request is received; client should continue.                                   |
| **103**  | Early Hints                   | Server provides hints for preloading resources.                                                  |
| **200**  | OK                            | Standard response for successful requests.                                                       |
| **201**  | Created                       | New resource has been created.                                                                   |
| **204**  | No Content                    | Request processed successfully, no content returned.                                             |
| **400**  | Bad Request                   | Client error due to malformed request syntax.                                                    |
| **401**  | Unauthorized                  | Authentication required and failed or not provided.                                              |
| **402**  | Payment Required              | Payment is required to access the resource (reserved for future use).                            |
| **403**  | Forbidden                     | Request understood, but server refuses to authorize it.                                          |
| **404**  | Not Found                     | Requested resource cannot be found.                                                              |
| **405**  | Method Not Allowed            | Request method not supported for targeted resource.                                              |
| **408**  | Request Timeout               | Server timed out waiting for the request.                                                        |
| **409**  | Conflict                      | Request could not be processed due to a conflict in the request.                                 |
| **500**  | Internal Server Error         | Unexpected condition encountered by the server.                                                  |
| **502**  | Bad Gateway                   | Invalid response from upstream server while acting as a gateway or proxy.                        |
| **503**  | Service Unavailable           | Server is currently unavailable due to overload or maintenance.                                  |
| **504**  | Gateway Timeout               | Timed out waiting for a response from the upstream server.                                       |
| **511**  | Network Authentication Required | Client needs to authenticate to gain network access.                                            |

---