import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNameSearch {
    public static void main(String[] args) throws FileNotFoundException {
        // Prompt user for name
        Scanner input = new Scanner(System.in);
        String path= "C:\\Users\\emreb\\IdeaProjects\\proje1-2\\src\\babyNames.txt";
        System.out.print("Name? ");
        String name = input.nextLine();
        name = name.toLowerCase(); // convert to lowercase to ensure case-insensitivity

        // Search file for name
        File file = new File(path);
        Scanner fileInput = new Scanner(file);
        while (fileInput.hasNextLine()) {
            String line = fileInput.nextLine();
            String[] parts = line.split(" ");
            if (parts[0].toLowerCase().equals(name)) { // found name
                System.out.println("Statistics on name \"" + parts[0] + "\"");
                for (int i = 1; i < parts.length; i++) {
                    System.out.println((1900 + (i - 1) * 10) + ": " + parts[i]);
                }
                break;
            }
        }
        fileInput.close();
    }
}
