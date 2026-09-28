import java.util.Scanner;

public class Right_Angled_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of rows from the user
        int n = sc.nextInt();

        // Outer loop controls the number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop prints stars equal to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print a star on the same line
            }

            // Move to the next line after printing the current row
            System.out.println();
        }
    }
}
