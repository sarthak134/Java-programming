import java.util.Scanner;

public class basicLoops {

  public static void main(String[] args) {
    // int counter = 1;
    // while (counter <= 10) {
    // System.out.println(counter);
    // counter++;
    // }

    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number: ");
    // int num = sc.nextInt();
    // int counter = 1;
    // while (counter <= num) {
    // System.out.println(counter);
    // counter++;
    // }
    // System.out.println();

    // int n = sc.nextInt();
    // int i = 1;
    // int sum = 0;
    // while (i <= n) {
    // sum += i;
    // i++;
    // }
    // System.out.println(sum);

    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {
    // System.out.println("****");

    // Revers of number

    // int n = 7112003;
    // int rev = 0;
    // while (n > 0) {
    // int lastDigit = n % 10;
    // rev = (rev * 10) + lastDigit;
    // n = n / 10;
    // }
    // System.out.print(rev);

    // Print a number

    // do {
    // System.out.println("Enter a number: ");
    // int n = sc.nextInt();
    // if (n % 10 == 0) {
    // break;
    // }
    // System.out.println(n);
    // } while (true);

    // Display all number entered by user except multiples of 10
    // do {
    // System.out.print("Enter a number: ");
    // int n = sc.nextInt();
    // if (n % 10 == 0) {
    // continue;
    // }
    // System.out.println(n);
    // } while (true);

    for (int i = 0; i < 5; i++) {
      System.out.println("Hello");
      i += 2;
    }

  }
}
