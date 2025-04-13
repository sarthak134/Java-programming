public class BasicOOps {

  public static void main(String args[]) {
    // Pen p1 = new Pen();
    // p1.setColor("blue");
    // System.out.println(p1.color);
    // p1.setTip(5);
    // System.out.println(p1.tip);
    Student s1 = new Student("Sarthak");
    System.out.println(s1.name);
  }

}

class Student {
  int rollno;
  String name;

  Student(String name) {
    this.name = name;

  }
}

// class Pen {
// String color;
// int tip;

// void setColor(String newColor) {
// color = newColor;

// }

// void setTip(int newTip) {
// tip = newTip;
// }

// }