import java.util.Scanner;
  public class eligible_to_vote {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();

      if (age >= 18) {
        System.out.println("ELIGIBLE TO VOTE");
      } else {
        System.out.println("NOT ELIGIBLE TO VOTE");
      }
    }
  }
