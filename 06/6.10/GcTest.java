public class GcTest {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      new GcTest();
      System.gc();
    }
  }

  public void finalize() {
    System.out.println("xi tong zheng zai qing li GcTest dui xiang de zi yuan...");
  }
}