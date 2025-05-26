# File_handling_utility

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: HARSHITHA PATI 

*INTERN ID*: CT08DM1234

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 8 WEEKS

*MENTOR*: NEELA SANTOSH

*DESCRIPTION*:

As part of my internship with CodTech, I was assigned a project to create a File Handling Utility using Java. The purpose of this utility is to perform three basic but essential operations on a text file — writing to the file, reading from the file, and modifying the file content. This tool was built using core Java without any external libraries, and it was tested using an online Java compiler, which made it easy to develop and debug from any device.

**About the Tool:**

The utility is designed to interact with a text file called file.txt. It allows the user to choose from a set of menu options displayed on the console. Based on the user’s input, it performs one of the three main actions:

1.Write to the File

2.Read from the File

3.Modify Content in the File

The fourth option lets the user exit the program. Each feature is implemented in a simple and user-friendly way, making the tool ideal for beginners learning file handling in Java.

**How I Built It**:

To create this project, I used basic Java concepts such as loops, conditionals, methods, and file I/O classes like BufferedReader, BufferedWriter, FileReader, and FileWriter. The logic is organized into separate methods for each operation to make the code clean and maintainable.

*Writing to the File*:

When the user selects this option, they are prompted to enter a line of text. This text is then saved to the file. If the file already has content, it will be overwritten. I used BufferedWriter for efficient writing.

*Reading from the File*:

This option opens the file, reads it line by line, and displays the content on the screen. It helps users confirm what’s currently saved in the file. I used BufferedReader for this part, which handles reading large files efficiently.

*Modifying File Content:*

This feature lets users replace a specific word in the file with another word. It reads the entire content into memory, replaces all instances of the given word, and writes the modified content back to the same file. This is a useful feature that simulates basic text editing.

I included proper exception handling to catch errors like file not found, input/output errors, etc., and to make sure the program doesn’t crash unexpectedly. Also, I ensured all streams are closed properly after use to prevent memory leaks.

**Tools Used :**

For this project, I used an online Java compiler like JDoodle, which helped me test the code quickly from anywhere without setting up Java locally. This was especially convenient while working remotely during the internship.

**What I Learned :**

This project helped me understand the practical use of file handling in Java. While writing this utility, I got a better grip on how Java reads and writes data, handles exceptions, and works with streams. It also taught me how to structure a small program using modular functions and a menu-driven approach.

More importantly, it gave me confidence in writing clean and working Java code from scratch, using just the standard library. I also improved my understanding of how data is stored, retrieved, and modified — which is the basis of many real-world applications like file editors, data processors, and even databases.


