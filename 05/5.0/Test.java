public class Test {

  public static void main(String[] args) {
    Object[] arr;
    arr = new Object[] { "10", "20", "30" };
    System.out.println(arr[0]);
    int[] arr1;
    arr1 = new int[] { 1, 2, 3 };
    System.out.println(arr1[0]);
    for (int num : arr1) {
      System.out.println(num);
    }
  }
}