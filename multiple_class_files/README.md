### Building multiple class files 

```
Preferred structure of the directory:
        
        /files/multiple_class_files
        ├── class
        │   └── com
        │       └── iiitb
        │           ├── Dependent.class
        │           └── Standalone.class
        └── src
            └── com
                └── iiitb
                    ├── Dependent.java
                    └── Standalone.java

        6 directories, 4 files
```

* Create all the .java files within the package structure in the src directory.
* Navigate to the top directory, i.e java_stuff

Compile with the following command 

`javac -cp ./class/ -d ./class/ src/com/iiitb/Standalone.java` 

`javac -cp ./class/ -d ./class/ src/com/iiitb/Dependent.java`

* `-d`: Specify the destination where the class files are to be placed. The directory structure within class folder will be created automatically by the compiler.

* `-cp`: Specify the classpath. Tells the compiler where the other compiled files are kept. This will help resolve references to other class files, like in Dependent.java.

### Running the program:

Assuming the main program sits in `Dependent.java`, the program can be run as follows.

* Move to the top level directory and move into `class` folder.

* Execute `java com/iiitb/Dependent` to get the output.



Reference:
* [SO answer on compiling multiple Java files](https://stackoverflow.com/a/2396759/3624795)


