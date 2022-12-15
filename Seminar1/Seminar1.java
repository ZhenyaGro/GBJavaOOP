package Seminar1;

public class Seminar1 {
  public static void main(String[] args) {
    FamilyTree familyTree = new FamilyTree();

    Human ivanIvanov = new Human("Ivan Ivanov", "Male");
    Human mariaIvanova = new Human("Maria Ivanova", "Female");

    Human petrIvanov = new Human("Petr Ivanov", "Male", mariaIvanova, ivanIvanov);

    // System.out.println(petrIvanov);
    System.out.println(petrIvanov.getInfo());
  }
}
