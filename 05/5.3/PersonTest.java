class Person {
  public String name;
  public static int eyeNum;
}

public class PersonTest {
  public static void main(String[] args) {
    System.out.println("Person的eyeNum类变量值:" + Person.eyeNum);
    Person p = new Person();
    System.out.println("p变量的name变量值是:" + p.name + ";p对象的eyeNum变量值是:" + p.eyeNum);
    p.name = "孙悟空";
    p.eyeNum = 2;
    System.out.println("p变量的name变量值是:" + p.name + ";p对象的eyeNum变量值是:" + p.eyeNum);
    Person p2 = new Person();
    p2.name = "猪八戒";
    System.out.println("p2变量的name变量值是:" + p2.name + ";p2对象的eyeNum变量值是:" + p2.eyeNum);
  }
}