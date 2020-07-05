# 20-Abgabe02-Heiling-Suekar
A repository to manage the Config-Assignment

## Description:
This is a Project about Bugfixing and Build Automation using Maven and JUnit5 testing. 
For Documentation we use JavaDoc and MavenSiteDoc. Given are the classes `IQueue.java`, 
`StringQueue.java` and the `StringQueueTest.java`. 

## Contributors:
* Marco Heiling
* Michael Sükar

## Planned Execution: 
- We start by reading all files, to get brief overview.
- We setup the project with the maven project structure and the given files
- We complete the pom.xml and check all maven targets
- We will find the three errors in the given implementation
- Then we implement the Generic Queue
- Writing tests to have a 100% code coverage
- create maven site documentation where we have the javadoc and some manual informations
- while we are doing the project we write our labreport


## Tasklist
- [x] First Steps
- [x] Git
- [x] Maven & POM
- [x] Implementation & Comments
- [x] Testing
- [x] Maven Site Documentation
- [x] Lab-Report

## Relevant Code Sniped:
```
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-site-plugin</artifactId>
	<version>3.7.1</version>
</plugin>
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-project-info-reports-plugin</artifactId>
	<version>3.0.0</version>
</plugin>
```

## ERRORs in StringQueue.java
* [CORRECTED] Konstrutor typo in parameter "maxSize", forgotten use of this. fixed.
* [CORRECTED] In function `poll()` had a wrong comparision: changed == to !=
* [CORRECTED] In function `remove()` had a line that provided that any return value from the poll call could be used.