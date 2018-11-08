public class PersonTest {
  public static void main(String[] args) {
    Person p;
    p = new Person();
    p.name = "李刚";
    p.say("Java语言很简单,学习很容易!");
    System.out.println(p.name);
  }
}
