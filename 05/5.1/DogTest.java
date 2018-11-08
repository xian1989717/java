public class DogTest {
  public void eat() {
    System.out.println("eatting........");
  }

  public static void main(String[] args) {
    new Dog().run();
    new DogTest().eat();
  }
}