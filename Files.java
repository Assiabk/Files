package Github_Projects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    public static void createPersonalInfoFile() {
        
        String desktopPath = System.getProperty("user.home") + "/Desktop/";
        String fileName = "personal_info.txt";
        File file = new File(desktopPath + fileName);

        try {
            // Check if file already exists
            if (file.exists()) {
                System.out.println("Personal info file already exists.");
                return;
            }

            // Create the file
            file.createNewFile();
            System.out.println("Personal info file created: " + file.getAbsolutePath());

            // Get personal information from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Please enter your address: ");
            String address = scanner.nextLine();
            System.out.print("Please enter your phone number: ");
            String phone = scanner.nextLine();
            scanner.close();

            // Write personal information to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Name: " + name + "\n");
            writer.write("Address: " + address + "\n");
            writer.write("Phone: " + phone + "\n");
            writer.close();

            System.out.println("Personal info written to file.");

        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        createPersonalInfoFile();
    }
}
