import java.util.Scanner;
  public class simple_calender{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("press 1 for january");
      System.out.println("press 2 for February");
      System.out.println("press 3 for March");
      System.out.println("press 4 for April");
      System.out.println("press 5 for May");
      System.out.println("press 6 for june");
      System.out.println("press 7 for july");
      System.out.println("press 8 for August");
      System.out.println("press 9 for September");
      System.out.println("press 10 for October");
      System.out.println("press 11 for November");
      System.out.println("press 12 for December");
      int button = sc.nextInt();
      switch (button) {
        case 1 : System.out.println("january");
          break;
        case 2 : System.out.println("February");
          break;
        case 3 : System.out.println("March");
          break;
        case 4 : System.out.println("April");
          break;
        case 5 : System.out.println("May");
          break;
        case 6 : System.out.println("june");
          break;
        case 7 : System.out.println("July");
          break;
        case 8 : System.out.println("August");
          break;
        case 9 : System.out.println("September");
          break;
        case 10 : System.out.println("October");
          break;
        case 11 : System.out.println("November");
          break;
        case 12 : System.out.println("December");
          break;
        default : System.out.println("Invalid");
      }
    }
  }
