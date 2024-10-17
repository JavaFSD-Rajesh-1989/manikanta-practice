Creating Maven projects in command line

```bat
mvn ^
-B archetype:generate ^
-DgroupId=com.maven.example ^
-DartifactId=app ^
-DarchetypeArtifactId=maven-archetype-quickstart ^
-DarchetypeVersion=1.4
```