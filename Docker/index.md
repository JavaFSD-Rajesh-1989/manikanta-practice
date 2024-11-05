**Containerization** is a technology that allows a developer to package an application and its dependencies into a single container.

**Docker** is a popular containerization platform that allows developers to easily build, deploy, and run applications using containers.

The docker daemon process running on the host which manages images and containers (also called **Docker Engine**)

**Docker Desktop** includes Docker Engine, Docker CLI client, Docker Compose, Docker Content Trust, Kubernetes, and Credential Helper.

A **[[container]]** is a runtime instance of a [docker image](https://docs.docker.com/reference/glossary/#image). A Docker container consists of
- A [[Container image]]
- An execution environment
- A standard set of instructions

An **image** typically contains a union of layered filesystems stacked on top of each other. An image does not have state and it never changes.

In an image, a **layer** is modification to the image, represented by an instruction in the Dockerfile. Layers are applied in sequence to the base image to create the final image

A **Registry** is a hosted service containing [repositories](https://docs.docker.com/reference/glossary/#repository) of [images](https://docs.docker.com/reference/glossary/#image) which responds to the Registry API.

A **repository** is a set of Docker images. A repository can be shared by pushing it to a [registry](https://docs.docker.com/reference/glossary/#registry) server. The different images in the repository can be labeled using [tags](https://docs.docker.com/reference/glossary/#tag).

[Compose](https://github.com/docker/compose) is a tool for defining and running complex applications with Docker. With Compose, you define a multi-container application in a single file,

To scale containers, you need a [container orchestration](https://circleci.com/blog/what-is-container-orchestration/) tool like [Docker Swarm](https://docs.docker.com/engine/swarm/) or [Kubernetes](https://kubernetes.io/). Both tools provide a framework for managing multiple containers, and each has its own strengths, weaknesses, and specific focus.

https://docs.docker.com/reference/glossary/