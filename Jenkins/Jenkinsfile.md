---
reference: https://www.jenkins.io/doc/book/pipeline/#pipeline-syntax-overview
---
The definition of a [[Jenkins Pipeline]] is written into a text file called a `Jenkinsfile`.

Declarative Pipeline syntax,
```groovy
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                //
            }
        }
        // Other stages
    }
}
```

Scripted Pipeline syntax
```groovy
node {
    stage('Build') {
        //
    }
    // Other stages
}
```