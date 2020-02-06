# Java Basics 

This is a collection of stuff I am doing for CSIS1400. It includes assignments, practice stuff from the book, and code challenges given in class.

NOTE: For the sake of simplicity, these are NOT entire projects built with NetBeans or Intellij. (too many unnecessary folders and files!) These are meant to be compiled and ran from the command line.

## Basic instructions on how to compile and run
Navigate to the directory of the file you want to run.

To compile:
```bash
javac FileName.java
```

To run:
```bash
java ClassName
```


## If it doesn't run:

1.) Ensure you have JDK installed on your local machine. If not, download it from here: 
<a href="https://www.oracle.com/technetwork/java/javase/downloads/index.html">Java Platform SE (JDK 13)</a>

2.) Check to see if you have your JAVA_HOME variable path configured.
 The following is for MacOS only:
```bash
vim ~/.bash_profile
```
Verify or add: 
```bash
JAVA_HOME=x/Library/Java/JavaVirtualMachines/jdk-13.0.2.jdk/Contents/Home/bin/java
``` 
(Replace the jdk version with whateverversion you have installed.) 
You can check your version in another terminal tab with:
```bash
javac -version
```
Back in original terminal tab (where you were editing) press the esc key then:
```bash
:wq
``` 

Then:

```bash
source ~/.bash_profile
```
Now try running the file again.


If you are new to Vim and lost/stuck... here's some help:
<a href="https://www.keycdn.com/blog/vim-commands">Popular Vim Commands</a>

If this doesn't help, another option would be to copy pasta to a Netbeans project. Just make sure to follow proper naming conventions.
