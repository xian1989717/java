public class Varargs {
  public static void test(int a, String... books) {
    for (String temp : books) {
      System.out.println(temp);
    }
    int i;
    for (i = 0; i < books.length; i++) {
      System.out.println(books[i]);
    }
  }

  public static void main(String[] args) {
    test(6, "java", "javascript");
  }
}