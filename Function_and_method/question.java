import java.util.Scanner;

public class question {

  // Avergs of three Number

  public static int Average(int a, int b, int c) {

    int avg = (a + b + c) / 3;
    return avg;

  }

  public static boolean isEven(int n) {

    if (n % 2 == 0) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {
    // int a = 10;
    // int b = 20;
    // int c = 30;
    // int result = Average(a, b, c);
    // System.out.println("the averge of 3 number is = " + result);

    // System.out.println(isEven(11));
    System.out.println("Please Enter a Number : ");
    Scanner sc = new Scanner(System.in);
    int palindrome = sc.nextInt();

    if (isPalindrome(palindrome)) {
      System.out.println("Number: " + palindrome + " is a palindrome");
    } else {
      System.out.println("Number: " + palindrome + " is not a palindrome");
    }

  }

  public static boolean isPalindrome(int n) {
    int palindrome = n;
    int rev = 0;
    while (palindrome != 0) {
      int rem = palindrome % 10;
      rev = rev * 10 + rem;
      palindrome = palindrome / 10;

    }
    if (n == rev) {
      return true;
    }
    return false;
  }

}
