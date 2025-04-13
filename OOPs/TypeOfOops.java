public class TypeOfOops {

  public static void main(String args[]) {
    // Dog dobby = new Dog();
    // dobby.eats();
    // dobby.legs = 4;
    // System.out.println(dobby.legs);

  }

}
// Parent Class

class Animal {
  String color;

  void eats() {
    System.out.println("Eats");
  }

  void breath() {
    System.out.println("Breath");
  }

}
// Drived Class, Child Class

class Mammals extends Animal {
  void walk() {
    System.out.println("Walk");
  }
}

class Fish extends Animal {
  void swim() {
    System.out.println("Swim");
  }
}

class Birds extends Animal {
  void fly() {
    System.out.println("Fly");
  }
}

// class Dog extends Mammals {
// int breed;
// }

// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.println("Swim in water");
// }

// }
