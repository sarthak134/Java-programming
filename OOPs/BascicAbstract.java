public class BascicAbstract {

  public static void main(String agrs[]) {
    Mustang m1 = new Mustang();

  }

}

abstract class Animal {
  String color;

  void eats() {
    System.out.println("Eating");
  }

  Animal() {
    System.out.println("animal constructure is called");
  }

  abstract void walk();
}

class Hourse extends Animal {

  Hourse() {
    System.out.println("Hourse constructure is called");
  }

  void changeColor() {
    color = "dark brown";
  }

  void walk() {
    System.out.println("Hourse is walking");
  }
}

class Mustang extends Hourse {
  Mustang() {
    System.out.println("Mustang constructure is called");
  }
}

class Monkey extends Animal {
  void walk() {
    System.out.println("Monkey is walking");
  }
}