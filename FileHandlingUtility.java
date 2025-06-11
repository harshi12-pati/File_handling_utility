import java.io.*;
import java.util.Scanner;

public class FileHandlingUtility {

    private static final String FILE_NAME = "file.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n===== File Handling Utility =====");
            System.out.println("1. Write to File");
            System.out.println("2. Read from File");
            System.out.println("3. Modify File Content");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            // Validate input
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number (1-4): ");
                scanner.next(); // Clear invalid input
            }
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    writeToFile(scanner);
                    break;
                case 2:
                    readFromFile();
                    break;
                case 3:
                    modifyFile(scanner);
                    break;
                case 4:
                    System.out.println("Exiting File Handling Utility.");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1 to 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    /**
     * Writes user input to a text file.
     */
    private static void writeToFile(Scanner scanner) {
        System.out.println("\n--- Write to File ---");
        System.out.print("Enter text to write into the file:\n> ");
        String content = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(content);
            System.out.println("File written successfully to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    /**
     * Reads and displays content from the file.
     */
    private static void readFromFile() {
        System.out.println("\n--- Read from File ---");

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("Contents of " + FILE_NAME + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("File read successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please write to the file first.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    /**
     * Modifies file content by replacing a word.
     */
    private static void modifyFile(Scanner scanner) {
        System.out.println("\n--- Modify File ---");
        System.out.print("Enter word to find: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter replacement word: ");
        String newWord = scanner.nextLine();

        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("File does not exist. Please write to the file first.");
            return;
        }

        try {
            // Read file content
            StringBuilder content = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
            reader.close();

            // Replace old word with new word
            String modifiedContent = content.toString().replace(oldWord, newWord);

            // Write modified content back to file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(modifiedContent);
            writer.close();

            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }
}
