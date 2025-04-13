import java.util.Scanner;

public class basicFunction {

  public static void printHelloWorld() {
    System.out.println("Hello World");
  }

  public static int calculateSum(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
  }

  public static int multiply(int a, int b) {
    int product = a * b;
    return product;
  }

  public static int factorial(int n) {
    int fact = 1;

    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public static int binCoeff(int n, int r) {
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n - r);

    int binCoeff = fact_n / (fact_r * fact_nmr);
    return binCoeff;
  }

  public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = calculateSum(a, b);
    // System.out.print(sum);

    // int a = 3;
    // int b = 5;
    // int prod = multiply(a, b);
    // System.out.println("a * b = " + prod);
    // System.out.println(factorial(7));

    System.out.println(binCoeff(5, 2));

  }
}