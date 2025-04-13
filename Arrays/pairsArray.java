public class pairsArray {

  public static void parisNumber(int arr[]) {
    int n = arr.length;
    int tp = (n * (n - 1)) / 2;
    for (int i = 0; i < arr.length; i++) {
      int curr = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        System.out.print("(" + curr + "," + arr[j] + ")");

      }
      System.out.println();
    }
    System.out.print("Total Count : " + tp);

  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };
    parisNumber(arr);
  }

}
