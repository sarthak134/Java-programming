public class getLargets {

  public static int get_Largetest(int arr[]) {
    int larget = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > larget) {
        larget = arr[i];
      }
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }
    System.out.println("Samllest Number is " + smallest);
    return larget;

  }

  public static void main(String args[]) {
    int[] arr = { 1, 2, 3, 6, 5, 4 };
    System.out.println("Get largest Number " + get_Largetest(arr));
  }

}
