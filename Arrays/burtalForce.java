public class burtalForce {
  // WE ARE CALCULATING MXASUM OF SUBARRY BY METHOD BURTALFORCE
  public static void subArrayByBurtalForce(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int start = i;
      for (int j = i; j < arr.length; j++) {
        int end = j;
        currSum = 0;
        for (int k = start; k <= end; k++) {
          currSum += arr[k];
        }
        System.out.println(currSum);
        if (maxSum < currSum) {
          maxSum = currSum;
        }

      }
    }
    System.out.println("MaxSum is : " + maxSum);
  }

  // PRIFIX SUM OF SUBARRAY
  public static void subArrayByPrefixSum(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];

    prefix[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }

    for (int i = 0; i < arr.length; i++) {
      int start = i;
      for (int j = i; j < arr.length; j++) {
        int end = j;
        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("MaxSum is : " + maxSum);
  }

  // KADANS ALGORITHM
  public static void kadans(int arr[]) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;

    for (int i = 0; i < arr.length; i++) {
      currSum = currSum + arr[i];
      if (currSum < 0) {
        currSum = 0;

      }
      maxSum = Math.max(currSum, maxSum);

    }
    System.out.println("MaxSum is : " + maxSum);
  }

  public static void main(String[] args) {
    int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    // subArrayByBurtalForce(arr);
    // subArrayByPrefixSum(arr);
    kadans(arr);
  }

}
