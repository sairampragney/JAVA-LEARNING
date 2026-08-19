import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a");
    int a = sc.nextInt();
    System.out.println("enter b");
    int b = sc.nextInt();
    System.out.println("enter c");
    int c = sc.nextInt();
    
    if(a == b) {
      System.out.println("a = b");
    } else if (a > b) {
      System.out.println("a is greater");
    } else if (a < b) {
      System.out.println("a is lesser");
    }
  }
}
