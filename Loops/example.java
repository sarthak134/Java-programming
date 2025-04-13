import java.util.Scanner;

public class example {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // int choice;
    // int evenNum = 0;
    // int oddNum = 0;

    // do {
    // System.out.println("Enter a number: ");
    // int num = sc.nextInt();
    // if (num % 2 == 0) {
    // evenNum += num;
    // } else {
    // oddNum += num;
    // }

    // System.out.print("Do you want to continue? Press 1 for yes or 0 for no");

    // choice = sc.nextInt();
    // } while (choice == 1);

    // System.out.println("Sum of even number: " + evenNum);
    // System.out.println("Sum of even number: " + oddNum);

    // Find a Factorial of a number

    // int num;
    // int fact = 1;

    // System.out.print("Enter any positive number: ");
    // num = sc.nextInt();
    // for (int i = 1; i <= num; i++) {
    // fact *= i;
    // }
    // System.out.println("Factorial: " + fact);

    int n;
    int mult = 0;
    System.out.print("Enter any positive number: ");
    n = sc.nextInt();

    for (int i = 0; i <= 10; i++) {
      System.out.println(n + "*" + i + "=" + n * i);

    }

    System.out.print(mult);

  }

}
