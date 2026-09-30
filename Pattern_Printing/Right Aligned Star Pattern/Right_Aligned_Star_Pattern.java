public class Right_Aligned_Star_Pattern {
  
    public static void main(String[] args) {
      
        int n = 4;

        // Outer loop controls the rows
        for (int i = 1; i <= n; i++) {

            // Print spaces before the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars according to the row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next row
            System.out.println();
        }
    }
}
