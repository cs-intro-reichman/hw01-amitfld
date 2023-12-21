/*
Three sides can form a triangle if the sum of the lengths of any two sides is greater than the
length of the remaining side. This is known as the Triangle Inequality Theorem. For example, the
three numbers 3, 4, 5 form a triangle, and the three numbers 2, 3, 6 don’t form a triangle. Write
a program (Triangle.java) that tests if three given integers form a triangle.
 */
public class Triangle {
    public static void main(String[] args) {

        // Declare variables to store the size of the three sides of the suspected triangle
        int side1, side2, side3;
        side1 = Integer.parseInt(args[0]);
        side2 = Integer.parseInt(args[1]);
        side3 = Integer.parseInt(args[2]);

        // Declare a boolean variable to store the answer: is it a triangle?
        boolean isTriangle = side1 + side2 > side3 &&
                             side1 + side3 > side2 &&
                             side2 + side3 > side1;

        // Print the size of the sides and the answer
        String output = String.format("%d, %d, %d: %b", side1, side2, side3, isTriangle);
        System.out.println(output);
    }
}
