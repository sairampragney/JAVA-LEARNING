import java.util.Scanner;
  public class simple_calculator {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("what is a ?");
        int a = sc.nextInt();
        System.out.println("what is b ?");
        int b = sc.nextInt();
        System.out.println("press 1 for addition");
        System.out.println("press 2 for substraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        System.out.println("press 5 for modulo");
        int button = sc.nextInt();
        switch (button) {
         
          case 1 : System.out.println("addition");
          System.out.println(a + b);
          break;
          case 2 : System.out.println("substraction");
          System.out.println(a - b);
          break;
          case 3 : System.out.println("multiplication");
          System.out.println(a * b);
          break;
          case 4 : System.out.println("division");
          System.out.println(a / b);
          break;
          case 5 : System.out.println("modulo");
          System.out.println(a % b);
          break;
          default : System.out.println("Invalid");

        }
    }
  }
