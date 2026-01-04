import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new Guy object in a variable called joe
        // Set its name field to "Joe"
        // Set its cash field to 50

        // Create a new Guy object in a variable called bob
        // Set its name field to "Bob"
        // Set its cash field to 100

        while (true) {
            // Call the writeMyInfo methods for each Guy object

            System.out.print("Enter an amount: ");
            String howMuch = scanner.nextLine();
            if (howMuch.isEmpty()) return;

            // Use Integer.parseInt inside a try/catch to convert howMuch to an int
            // if it was successful
            {
                System.out.print("Who should give the cash: ");
                String whichGuy = scanner.nextLine();
                if (whichGuy.equals("Joe")) {
                    // Call the joe object's giveCash method and save the results
                    // Call the bob object's receiveCash method with the saved results
                } else if (whichGuy.equals("Bob")) {
                    // Call the bob object's giveCash method and save the results
                    // Call the joe object's receiveCash method with the saved results
                } else {
                    System.out.println("Please enter 'Joe' or 'Bob'");
                }
            }
            // else (if parsing failed)
            {
                System.out.println("Please enter an amount (or a blank line to exit).");
            }
        }
    }
}
