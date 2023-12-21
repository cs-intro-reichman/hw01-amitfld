/*
Assume that there are two coins only: A coin of 25 cents, called quarter, and a coin of a single
cent, called cent. Write a program (Coins.java) that gets a quantity of cents as a command-line
argument, and prints how to represent this quantity using as many quarters as possible, plus the
remainder in cents.
 */
public class Coins {
    public static void main(String[] args) {

        // Declare a variable to store the number of cents received
        int quantity = Integer.parseInt(args[0]);

        // Calculate the number of quarters and cents and declare a variable to store each of them
        int quarters = quantity / 25;
        int cents = quantity % 25;

        // Print the number of quarters and cents required
        String output = String.format("Use %d quarters and %d cents", quarters, cents);
        System.out.println(output);
    }

}