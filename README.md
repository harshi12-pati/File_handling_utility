# File_Handling_Utility

**COMPANY:** CODTECH IT SOLUTIONS

**NAME:** HARSHITHA PATI

**INTERN ID:** CT08DM1234

**DOMAIN:** JAVA PROGRAMMING

**DURATION:** 8 WEEKS

**MENTOR:** NEELA SANTOSH

---

### **DESCRIPTION:**

During my internship at **CodTech**, I was given a project to create a simple **File Handling Utility** using **Java**. The idea was to build a console-based tool that could perform three basic but important operations on a text file: writing data to the file, reading data from it, and modifying existing content. I wanted to keep the tool straightforward and easy to use, especially for beginners who are just starting to learn Java file handling.

---

### **What the Tool Does:**

The utility works with a file named `file.txt`. When you run the program, it shows a menu with four options:

1. **Write text to the file**
2. **Read and display the file’s contents**
3. **Modify the file by replacing a specific word**
4. **Exit the program**

The user simply enters the number corresponding to what they want to do. The program runs continuously, showing the menu again after each action, until the user chooses to exit. This keeps the experience smooth and interactive.

---

### **How I Built It:**

I stuck to using **core Java features only** — no external libraries — to keep the project lightweight and easy to understand. The main tools I used were:

* `Scanner` for user input
* Java I/O classes such as `FileReader`, `FileWriter`, `BufferedReader`, and `BufferedWriter` for handling file operations

The program is built around a loop that keeps showing the menu and accepting user commands. I implemented input validation, so the user can only enter numbers from 1 to 4, preventing crashes due to invalid input.

Each function (write, read, modify) is handled in its own method to make the code cleaner and easier to follow:

* **Writing to the file:** When chosen, the program asks the user to enter a line of text. This text is saved to `file.txt`, overwriting any existing content. I used `BufferedWriter` because it’s efficient and straightforward.
* **Reading from the file:** This option reads the file line by line using `BufferedReader` and prints everything to the console so the user can see what’s stored.
* **Modifying the file:** This feature allows the user to enter a word they want to replace and the new word to substitute it with. The program reads the entire file into memory, replaces every occurrence of the old word with the new one, and writes the updated content back to the file. It’s a simple way to demonstrate text editing.

---

### **Handling Errors and Edge Cases:**

I focused on **proper error handling** throughout. For example, if the file doesn’t exist yet and the user tries to read or modify it, the program politely informs them to write to the file first instead of crashing. Also, I ensured all file streams are properly closed using **try-with-resources** blocks to avoid memory leaks and other resource issues.

---

### **Tools and Environment:**

I developed and tested the utility using an online Java compiler like **JDoodle**. This approach made it easy to work on the project from anywhere without needing to install Java locally. It also sped up the testing and debugging process, allowing me to run the code instantly.

---

### **What I Learned:**

Working on this project gave me practical experience with Java file handling. It helped me understand how to read, write, and modify files, and how to manage exceptions and streams properly. Writing modular methods for each task taught me better ways to organize code for improved readability and maintainability.

Most importantly, this project boosted my confidence in building working Java applications from scratch using only standard libraries. It also gave me a clearer understanding of how data is stored and manipulated in files—essential knowledge for many real-world applications such as file editors, data processors, and simple databases.

---

### **Output:**


![Screenshot 2025-06-11 192321](https://github.com/user-attachments/assets/9fb8b39e-2167-4da5-8df9-15b67bfaba02)

