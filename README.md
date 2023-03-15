# Files
Files
This is a Java class that creates a file on the user's desktop and writes their personal information to it.

Getting Started
To use this class in your Java project, simply include the Files.java file in your project directory, and import the Files class in your main program.

java
Copy code
import Files;

public class Main {
    public static void main(String[] args) {
        Files.createPersonalInfoFile();
    }
}
When you run your program, the createPersonalInfoFile() method will create a new file on your desktop named personal_info.txt, and prompt you to enter your personal information. Once you have entered your information, it will be written to the file.

Acknowledgments
This class was inspired by a similar example in the book "Java: A Beginner's Guide" by Herbert Schildt.
