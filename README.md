<h1>Java Basics</h1>

<p>This is a collection of stuff I am doing for CSIS1400. It includes assignments, practice stuff from the book, and code challenges given in class.</p>

<p>NOTE: For the sake of simplicity, these are NOT entire projects built with NetBeans or Intellij. (too many unnecessary folders and files!) These are meant to be compiled and ran from the command line. </p>

<h3>Basic instructions on how to compile and run:</h3>

<ul>
  <li>Navigate to the directory of the file you want to run.</li>
  <li> ```javac FileName.java```</li>
  <li> ```java ClassName```</li>
</ul>

<p>If it doesn't run:</p>
<ul>
 <li>Ensure you have JDK installed on your local machine. If not, download it from here: <a href=" https://www.oracle.com/technetwork/java/javase/downloads/index.html">Java Platform SE (JDK 13)</a></li>
 <li>Check to see if you have your JAVA_HOME variable path configured.
   <p>The following is for MacOS only:</p>
   <p>```vim ~/.bash_profile```</p>
   <p>Verify or add: ```JAVA_HOME=x/Library/Java/JavaVirtualMachines/jdk-13.0.2.jdk/Contents/Home/bin/java``` (Replace the jdk version with whateverversion you have installed.) You can check your version in another terminal tab with `javac -version`</p>
  <p>```:wq```  (to save and quit)</p>
  <p>```source ~/.bash_profile```</p>
  <p>If you are new to Vim and lost/stuck... here's some help: <a href="https://www.keycdn.com/blog/vim-commands">Popular Vim Commands</a></p></li>
</ul>

<p>If this doesn't help, another option would be to copy pasta to a Netbeans project. Just make sure your project name matches the class name, etc.</p>
