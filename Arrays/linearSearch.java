public class linearSearch {

  public static int linear_Search(int num[], int key) {

    for (int i = 0; i < num.length; i++) {
      if (num[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static int Menus(String[] items, String key) {
    for (int i = 0; i < items.length; i++) {
      if (items[i].equals(key)) {
        return i; // Return the index of the matching item
      }
    }
    return -1; // Return -1 if no match is found
  }

  public static void main(String args[]) {
    String[] items = { "Pizza", "Burger", "Pasta", "Salad" };
    String key = "Burger";

    int index = Menus(items, key); // Call the Menus function

    if (index != -1) {
      System.out.println("Item found at index: " + index);
    } else {
      System.out.println("Item not found.");
    }

    // int num[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    // int key = 20;

    // int index = linear_Search(num, key);
    // if (index == -1) {
    // System.out.println("Element not found");
    // } else {
    // System.out.println("Element found at index : " + index);
    // }

  }
}