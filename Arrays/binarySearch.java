public class binarySearch {

  public static int binary_Search(int arr[], int key) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;

      if (arr[mid] == key) {
        return mid;
      }
      if (arr[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }

    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 5, 6, 8, 9, 4 };
    int key = 8;
    int index = binary_Search(arr, key);
    if (index != -1) {
      System.out.println("Element is present at index " + index);
    } else {
      System.out.println("Element is not present in array");
    }
  }
}