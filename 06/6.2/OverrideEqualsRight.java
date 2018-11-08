
class MyPerson {
  private String name;
  private String idStr;

  public MyPerson() {
  };

  public MyPerson(String name, String idStr) {
    this.name = name;
    this.idStr = idStr;
  };

  public void setName(String name) {
    this.name = name;
  };

  public String getName() {
    return this.name;
  };

  public void setIdStr(String idStr) {
    this.idStr = idStr;
  };

  public String getIdStr() {
    return this.idStr;
  };

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj != null && obj.getClass() == MyPerson.class) {
      MyPerson personObj = (MyPerson) obj;
      if (this.getIdStr().equals(personObj.getIdStr())) {
        return true;
      }
    }
    return false;
  }
}

public class OverrideEqualsRight {
  public static void main(String[] args) {
    MyPerson p1 = new MyPerson("孙悟空", "12343433433");
    MyPerson p2 = new MyPerson("孙行者", "12343433433");
    MyPerson p3 = new MyPerson("孙悟饭", "99933433");
    System.out.println(p1.equals(p2));
    System.out.println(p2.equals(p3));
  }
}