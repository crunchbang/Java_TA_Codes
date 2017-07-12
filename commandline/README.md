# Surviving on the commandline

Paths on \*Nix systems : /home/username/movies/new_movie.mp4


### Some directory conventions
* `.` - current directory
* `..` - parent directory
* `~` - home directory
* `-` - last directory you were in

### Getting around

* `pwd` - **p**rint **w**orking **d**irectory
* `cd <dir>` - **c**hange **d**irectory 
* `ls` - **l**i**s**t files in current directory
	* `ls -l` - long list
	* `ls -a` - list hidden files
	* `ls *.java` - list all files ending with .java
* `mkdir <name>` - make a directory
* `rm <file>` - remove file
	* `rm *.java` - remove all files with .java extension
* `cat file.txt` - output the contents of `file.txt`

### I/O Redirection
* `command > file.txt` - redirect output of `command` to `file.txt`. If `file.txt` does not already exist, it will be created automatically. If it exists, its contents will be overwritten.
* `command >> file.txt` - append the output of `command` to `file.txt`.
* `command < file.txt` - `command` takes contents of `file.txt` as input.

### Other essential stuff
* `grep pattern file.txt` - outputs lines containing `pattern` in `files.txt`

### Java stuff
* `javac Test.java` compiles the file and produces `Test.class` which contains the bytecode in binary format.
* `java Test` takes the .class file and runs it to produce the output
* `javap -c Test` disassembles the class file to produce the bytecode in human readable format
> Side note : Check out the book `Head First Java`.

### Pipes
`command1 | command2` - Output of command1 is used as input by command 2

### Vim
Copy the `.vimrc` file into your home directory. Refer this [handy doc](https://learnxinyminutes.com/docs/vim/) for a cheatsheet of vim commands. Use `vimtutor` to get yourself started after the class. And finally **do not** use the mouse when you're inside vim.<sub><sup><sup>NEVER EVER</sup></sup></sub>\
My preferred plugin manager - [Vim-plug](https://github.com/junegunn/vim-plug)

### Other cool stuff on the commandline
All the programs can be installed using `sudo apt-get install <program name>`
* `htop` and `glances` 
* `pandoc` - cheatsheet available [here](https://github.com/dsanson/Pandoc.tmbundle/blob/master/Support/doc/cheatsheet.markdown)
* `cmatrix`\
Find a lot more [here](https://kkovacs.eu/~cure-unix-tools).

### Making life a little easier
Bash/Dash is the default shell you get on most systems. Install the fish shell if you want to make your life on the shell a litter easier (and colorful). `sudo apt-get install fish` to install `fish`. Use ``chsh -s `which fish` `` to set fish as your default shell. Otherwise you'll have to keep typing fish each time to get the fish shell. It provides syntax highlighting (for wrong commands), command completion and a lot more. 

### Check out [The Art of The Command Line](https://github.com/jlevy/the-art-of-command-line) if you're looking to level up your commandline game.


References & Further reading:
* [Terminals are sexy](https://github.com/k4m4/terminals-are-sexy)

* [TLDP](http://www.tldp.org/LDP/abs/html/index.html)

* [Unix Programming Tools](http://cslibrary.stanford.edu/107/UnixProgrammingTools.pdf)

* [Vi commands](http://web.stanford.edu/~laha/docs/Vi-commands.pdf)
