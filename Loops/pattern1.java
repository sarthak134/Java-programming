public class pattern1 {

  public static void main(String[] args) {

    // for (int i = 1; i <= 4; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");

    // }
    // System.out.println();

    // }

    // Print Inverted-Star pattern
    int n = 5;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j);

      }
      System.out.println();
    }

    // Print Half-Pyramid pattern
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }

    // Print Character pattern
    // int n = 5;
    // int ch = 1;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(ch + " ");
    // ch++;

    // }
    // System.out.println();
    // }

  }
}
