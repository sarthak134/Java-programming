public class subArray {
  public static void subArrayPairs(int arr[]) {
    int totalSum = 0;
    int minValue = Integer.MAX_VALUE;
    int maxValue = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int start = i;
      for (int j = i; j < arr.length; j++) {
        int end = j;
        int subArraySum = 0;
        for (int k = start; k <= end; k++) {
          System.out.print(arr[k] + " ");
          subArraySum += arr[k];

        }

        System.out.println(" => " + subArraySum);
        totalSum += subArraySum;
        if (subArraySum < minValue) {
          minValue = subArraySum;
        }
        if (subArraySum > maxValue) {
          maxValue = subArraySum;

        }

      }
      System.out.println();

    }
    System.out.println("total sum : " + totalSum);
    System.out.println("Min sum is : " + minValue);
    System.out.println("Max sum is : " + maxValue);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };
    subArrayPairs(arr);
  }

}
