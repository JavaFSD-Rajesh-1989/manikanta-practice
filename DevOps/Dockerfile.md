[Best practices](https://docs.docker.com/build/building/best-practices/)
A Dockerfile is a text-based document that's used to create a [[container image]]. It provides instructions to the image builder on the commands to run, files to copy, startup command, and more.

```Dockerfile
FROM <base-image>
WORKDIR <path/in/the/image>
COPY <host-path> <image-path>
RUN <command>
# Environment variables
ENV <name> <value>
EXPOSE <port-number>
# default user for all subsequent instructions.
USER <user-or-uid>
CMD ["<command>", "<arg1>"]
```
A Dockerfile typically follows these steps:

1. Determine your base image
2. Install application dependencies
3. Copy in any relevant source code and/or binaries
4. Configure the final image

## Building image
The process of building an image based on a `Dockerfile`
```sh
docker build PATH | URL
```
The [build context](https://docs.docker.com/build/concepts/context/#what-is-a-build-context) is the set of files that your build can access.
- The relative or absolute path to a local directory
- A remote URL of a [Git repository](https://docs.docker.com/build/concepts/context/#git-repositories), tarball, or plain-text file.
```sh
docker run image-id
```
Using the **build cache** effectively lets you achieve faster builds by reusing results from previous builds and skipping unnecessary work.
## Tagging
Tagging images is the method to provide an image with a memorable name.
`[HOST[:PORT_NUMBER]/]PATH[:TAG]`

- `HOST`: registry host name (docker.io)
- `PATH`: `[NAMESPACE/]REPOSITORY` default value for namespace is `library`
- `TAG`: used to identify different versions or variants of an image.

```sh
# docker.io/library/my-image:latest
docker build -t my-image .
```

Use `docker image push` to share your images to the [Docker Hub](https://hub.docker.com/) registry or to a self-hosted one. you will need to be authenticated. To do so, simply use the [docker login](https://docs.docker.com/engine/reference/commandline/login/) command.

```sh
docker push my-username/my-image
```



## Multi-stage builds
[Multi-stage builds](https://docs.docker.com/get-started/docker-concepts/building-images/multi-stage-builds/) introduce multiple stages in your Dockerfile, each with a specific purpose.
No need to bundle the entire compiler in your final image.

```Dockerfile
# Stage 1: Build Environment
FROM builder-image AS build-stage 
# Install build tools (e.g., Maven, Gradle)
# Copy source code
# Build commands (e.g., compile, package)

# Stage 2: Runtime environment
FROM runtime-image AS final-stage  
#  Copy application artifacts from the build stage (e.g., JAR file)
COPY --from=build-stage /path/in/build/stage /path/to/place/in/final/stage
# Define runtime configuration (e.g., CMD, ENTRYPOINT) 
```
