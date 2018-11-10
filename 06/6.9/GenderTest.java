public class GenderTest {
  public static void main(String[] args) {
    Gender g = Enum.valueOf(Gender.class, "FEMALE");
    g.name = "nv";
    System.out.println(g + " dai biao:" + g.name);

  }
}