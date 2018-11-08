public class Primitive2String {
  public static void main(String[] args) {
    String intStr = "123";
    int it1 = Integer.parseInt(intStr);
    int it2 = new Integer(intStr);
    System.out.println(it2);
    String floatStr = "4.56";
    float ft1 = Float.parseFloat(floatStr);
    float ft2 = new Float(floatStr);
    System.out.println(ft2);
    String ftStr = String.valueOf(2.345f);
    System.out.println(ftStr);
    String boolStr = String.valueOf(true);
    System.out.println(boolStr);
  }
}