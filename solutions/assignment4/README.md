### Working with multiple files

```
Q3
├── Circle.java
├── Square.java
├── Tester.java
├── TesterCircle.java
├── TesterSquare.java
└── classes
    ├── Tester.class
    └── shapes
        ├── circle
        │   ├── Circle.class
        │   └── TesterCircle.class
        └── square
            ├── Square.class
            └── TesterSquare.class

4 directories, 10 files

```

### Compilation
We'll compile the java files and direct the compiler to put the compiled class files within the `classes` folder.

Compile the files as follows:

`javac -d classes Circle.java`\
`javac -d classes Square.java`

The `-d` option tells the compiler to put the compiled class files within the `classes ` directory according to the package structure. The directory structure within `classes` folder is automatically created by the compiler based on the package declaration at the top of each file. A package declaraion of `shapes.circle` in `Circles.java` translates to a directory structure of `shapes/circle/Circle.class` after compilation. 

When creating a testing class, you can choose to include it in the same package or not.

**Same Package**

Here `TesterCircle.java` and `TesterSquare.java` are part of the respective packages. \
**NOTE**: Packages within the same class can see other and can refer to each without importing the package i.e `TesterCircle` can directly refer to `Circle` without any extra imports. Same goes for `Square` and `TesterSquare`.

Compile the tester files as follows:

`javac -d classes -cp classes TesterCircle.java`\
`javac -d classes -cp classes TesterSquare.java`

The `-cp` option is used to tell the compiler where to find the class files for the user defined classes, `Circle` and `Square` in this case. When compiling a file that references user defined classes, the `-cp` option should be used to tell the compiler where to look for these classes (so that the compiler can resolve these references). Otherwise you'll get a compile time error message saying that the class you're refering to does not exist.
If the `-cp` option is not specified, the compiler will search the current directory for the referenced classes.\
*Extra*: It is similar to search path in gcc where you use the `-I` flag to specify the search path.

Go into the classes folder and run the tester files as follows:\
`cd classes`

`java shapes.square.TesterSquare`\
`java shapes.circle.TesterCircle`

Here we did not have to specify the classpath because the compiler searches the specified directory i.e `shapes/square/` to resolve the reference to `Square` class and it succeeds. 

**Different Package**
`Tester` is another testing class which is not part of any of the above packages. In order to test the classes, it imports the appropriate classes and then uses them. Based on the discussion above, the class can be compiled as follows:

`javac -d classes -cp classes Tester.java`

And it can be run as follows:\
`cd classes`\
`java Tester`

I hope you can understand why we did not have to specify the `-cp` option in the above command.

**Aside**: If you had compiled the files as follows `javac -cp classes Tester.java`, i.e the class file will be in the same directory as the source file, then you would have had to use `java -cp classes Tester` to run the program. Take a moment. See if you understand why it is so. 

