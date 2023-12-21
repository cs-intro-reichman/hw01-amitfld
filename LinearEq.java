/*
Write a program (LinearEq.java) that solves linear equations of the form 𝑎 ⋅ 𝑥 + 𝑏 = 𝑐. The
program gets a, b, and c as command-line arguments, computes x, and prints the result. Assume
that a is not zero. The program treats the three arguments as well as the computed value as
double values. The program prints the equation, and its solution.
 */
public class LinearEq {
    public static void main(String[] args) {

        // Declare variables to store the equation's variables
        double a, b, c;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);

        // Solve the linear equation and store the result in a variable
        double x = (c - b) / a;

        // Print the solution of the equation
        System.out.println(a + " * x + " + b + " = " + c + "\nx = " + x);
    }
}
