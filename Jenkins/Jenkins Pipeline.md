---
prerequisites:
  - Jenkins 2.x or later
  - Pipeline plugin
reference: https://www.jenkins.io/doc/book/pipeline/getting-started/
---
Jenkins Pipeline is a suite of plugins which supports implementing and integrating **continuous delivery pipelines** into Jenkins. This process involves building the software in a reliable and repeatable manner, as well as progressing the built software (called a "build") through multiple stages of testing and deployment.

![[pilpeline-senario.png]]

Pipeline provides an extensible set of tools for modeling simple-to-complex delivery pipelines "as code" via the [Pipeline domain-specific language (DSL) syntax](https://www.jenkins.io/doc/book/pipeline/syntax).

Pipeline adds a powerful set of automation tools onto Jenkins, supporting use cases that span from simple continuous integration to comprehensive CD pipelines. 
#### Advantages of pipeline
- pipeline as code
- **durable**:  survive both planned and unplanned restarts of the Jenkins controller.
- **pausable**: Pipelines can optionally stop and wait for human input or approval
- **Versatile:** Pipelines support complex real-world CD requirements
- **Extensible**: The Pipeline plugin supports custom extensions to its DSL

While the syntax for defining a Pipeline, either in the web UI or with a `Jenkinsfile` is the same,
### Concepts
The following concepts are key aspects of Jenkins Pipeline

|          |                                                                                                                                                                                                           |
| -------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Pipeline | A Pipeline is a user-defined model of a CD pipeline. A Pipeline’s code defines your entire build process, which typically includes stages for building an application, testing it and then delivering it. |
| Node     | A node is a machine which is part of the Jenkins environment and is capable of executing a Pipeline.                                                                                                      |
| Stage    | A stage block defines a conceptually distinct subset of tasks performed through the entire Pipeline (e.g. "Build", "Test" and "Deploy" stages)                                                            |
| Step     | A single task. Fundamentally, a step tells Jenkins what to do at a particular point in time                                                                                                               |

### Creating pipeline
A Pipeline can be created in one of the following ways:

- [Through Blue Ocean](https://www.jenkins.io/doc/book/pipeline/getting-started/#through-blue-ocean) - graphical Pipeline editor
- [Through the classic UI](https://www.jenkins.io/doc/book/pipeline/getting-started/#through-the-classic-ui) - basic
- [In SCM](https://www.jenkins.io/doc/book/pipeline/getting-started/#defining-a-pipeline-in-scm) - manually 

Jenkins can then check out your `Jenkinsfile` from source control as part of your Pipeline project’s build process and then proceed to execute your Pipeline.

Both [Declarative and Scripted Pipeline](https://www.jenkins.io/doc/book/pipeline/#declarative-versus-scripted-pipeline-syntax) are DSLs to describe portions of your software delivery pipeline. *Scripted Pipeline is written in a limited form of [Groovy syntax](http://groovy-lang.org/semantics.html).*



