import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display a greeting message
        System.out.println("Hello, " + name + "! Welcome to the world of Java programming.");

        // Close the scanner
        scanner.close();
    }
}
