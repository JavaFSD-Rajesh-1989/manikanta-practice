Computing components of an application are defined as [services](https://docs.docker.com/reference/compose-file/services/). A **service** is an abstract concept implemented on platforms by running the same container image, and configuration, one or more times.

Services communicate with each other through [networks](https://docs.docker.com/reference/compose-file/networks/). In the Compose Specification, a **network** is a platform capability abstraction to establish an IP route between containers within services connected together.

Services store and share persistent data into [volumes](https://docs.docker.com/reference/compose-file/volumes/). The Specification describes such a persistent data as a high-level filesystem mount with global options.

With volumes, [configs](https://docs.docker.com/reference/compose-file/configs/) and [secrets](https://docs.docker.com/reference/compose-file/secrets/) you can have a simple declaration at the top-level and then add more platform-specific information at the service level.