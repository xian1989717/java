package src;

public class EqualTest {
  public static void main(String[] args) {
    int it = 65;
    float fl = 65.0f;
    System.out.println("65和65.0f是否相等?" + (it == fl));
    char ch = 'A';
    System.out.println("65和'A'是否相等?" + (it == ch));
    String str1 = new String("hello");
    String str2 = new String("hello");
    System.out.println("str1和str2是否相等?" + (str1 == str2));
    System.out.println("str1是否equals str2?" + (str1.equals(str2)));
  }
}