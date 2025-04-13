import java.util.Scanner;

public class MultiplicationTable {
  public static void printMultiplicationTable(int number) {

    Scanner sc = new Scanner(System.in);
    int n;

    System.out.print("Enter any positive number: ");
    n = sc.nextInt();

    for (int i = 0; i <= 10; i++) {
      System.out.println(n + "*" + i + "=" + n * i);

    }

  }

  public static void main(String s[]) {
    printMultiplicationTable(5);

  }

}