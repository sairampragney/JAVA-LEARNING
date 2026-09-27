import java.util.*;

public class Hollow_Rectangle {

    public static void main(String[] args) {

        // n = number of rows
        int n = 4;

        // m = number of columns
        int m = 5;

        // Outer loop controls the rows
        for (int i = 1; i <= n; i++) {

            // Inner loop controls the columns
            for (int j = 1; j <= m; j++) {

                // The if condition checks whether i is equal to 1 or n,
                // or j is equal to 1 or m.

                // Explanation:
                // The hollow rectangle is formed when i = 1, i = n,
                // j = 1, or j = m. That is why we use this if condition.
                if (i == 1 || j == 1 || i == n || j == m) {

                    System.out.print("*");

                } else {

                    // Otherwise, we print a space inside the rectangle frame
                    // to keep the rectangle hollow.
                    System.out.print(" ");
                }
            }

            // Move to the next row
            System.out.println();
        }
    }
}
