public class GenderTest {
  public static void main(String[] args) {
    Gender g = Gender.valueOf("FEMALE");
    g.setName("nv");
    System.out.println(g + " dai biao:" + g.getName());

  }
}