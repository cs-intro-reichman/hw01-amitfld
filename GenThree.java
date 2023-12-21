/*
Write a program (Gen3.java) that generates three random integers, each in a given range [a,b),
i.e. greater than or equal to a and less than b, prints them, and then prints the minimal number
that was generated
 */
public class GenThree {
    public static void main(String[] args) {
        // Declare variables to store upper and lower bounds, and the range between them
        int upperBound, lowerBound, range;
        lowerBound = Integer.parseInt(args[0]);
        upperBound = Integer.parseInt(args[1]);
        range = upperBound - lowerBound;

        double num1, num2, num3;

        // Generate three random numbers between 0.0 (inclusive) and 1.0 (exclusive)
        num1 = Math.random();
        num2 = Math.random();
        num3 = Math.random();

        // Scale the random numbers to fit within the specified range
        num1 = num1 * range;
        num2 = num2 * range;
        num3 = num3 * range;

        // Declare three integers that represents the generated random numbers in the given range
        int gen1 = (int) (num1 + lowerBound);
        int gen2 = (int) (num2 + lowerBound);
        int gen3 = (int) (num3 + lowerBound);

        // Find the minimum generated number among gen1, gen2, and gen3
        int minNum = (int) (Math.min(Math.min(gen1, gen2), gen3));

        // Print the generated numbers and the minimum number among them
        String output = String.format(
                "%d\n%d\n%d\nThe minimal generated number was %d", gen1, gen2, gen3, minNum);
        System.out.println(output);
    }
}
