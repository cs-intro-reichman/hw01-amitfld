/*
Write a program (AddTwo.java) that adds two given integers and prints the result in a fancy way.
The command line is: java AddTwo a b.
*/
public class AddTwo {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;

        String output = String.format("%d + %d = %d", num1, num2, sum);
        System.out.println(output);
    }

}