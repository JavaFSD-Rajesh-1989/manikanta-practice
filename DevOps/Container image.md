A container image is a standardized package that includes all of the files, binaries, libraries, and configurations to run a container.
There are two important principles of images:

1. **Images are immutable.** Once an image is created, it can't be modified. You can only make a new image or add changes on top of it.
2. Container images are composed of **layers**. Each layer represented a set of file system changes that add, remove, or modify files.

[Docker Hub](https://hub.docker.com/) is the default global marketplace for storing and distributing images.

```sh
docker search imgname
docker pull imgname
docker image ls
```
## Image layers
Each layer in an image contains a set of filesystem changes - additions, deletions, or modifications.
- any Dockerfile instruction that modifies the file system creates a new layer. 
- the instructions that started with `LABEL`, `ENTRYPOINT`, and `CMD` directives didn’t modify the file system so they didn’t add any layers (**intermediate layers 0 B**) that increased the file size of the Docker image.

![layers](https://docs.docker.com/get-started/docker-concepts/building-images/images/container_image_layers.webp)

```sh
docker image history imgname
```
