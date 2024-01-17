import java.util.Scanner;
import java.util.Random;

public class Bootcamp7 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the course code
        System.out.print("Enter the course code: ");
        String courseCode = scanner.nextLine().toUpperCase(); // Convert to uppercase for consistency

        // Generate a random number (you might want to use a more sophisticated method)
        Random random = new Random();
        int randomNumber = random.nextInt(1000);

        // Create the student ID by combining course code and random number
        String studentID = courseCode + randomNumber;

        // Display the generated student ID
        System.out.println("Generated Student ID: " + studentID);

        // Close the Scanner to avoid resource leak
        scanner.close();
    }
}
