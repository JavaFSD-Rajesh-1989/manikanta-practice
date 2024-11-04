a VM is an entire operating system with its own kernel, hardware drivers, programs, and applications. Spinning up a VM only to isolate a single application is a lot of overhead.

A container is simply an isolated process with all of the files it needs to run. If you run multiple containers, they all share the same kernel, allowing you to run more applications on less infrastructure.
- Self-contained
- Isolated
- Independent
- Portable
```sh
# Running
docker run -p 8080:80 image_name
# list running containers
docker ps
# list all containers
docker ps -a
# stop the container
docker stop unique-id
```
