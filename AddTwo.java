/*
Write a program (AddTwo.java) that adds two given integers and prints the result in a fancy way.
The command line is: java AddTwo a b.
*/
public class AddTwo {
    public static void main(String[] args) {

        // Declare variables to store the given integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Calculate the sum of the integers given
        int sum = num1 + num2;

        // Print the sum pf the integers
        String output = String.format("%d + %d = %d", num1, num2, sum);
        System.out.println(output);
    }

}
