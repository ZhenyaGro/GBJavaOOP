package FamiliTree;

import java.util.ArrayList;
import java.util.List;;

public class FamilyTree {

  private List<Human> humans;

  public FamilyTree(List<Human> humans) {
    this.humans = humans;
  }

  public FamilyTree() {
    this(new ArrayList<>());
  }

  void addHuman(Human human) {
    this.humans.add(human);
  }

  void addHuman(String fullName, String gender) {
    this.humans.add(new Human(fullName, gender));
  }

  Human searchByName(String fullName) {
    for (Human person : humans) {
      if (person.getFullName().toLowerCase().equals(fullName.toLowerCase())) {
        System.out.println(person);
        return person;
      }
    }
    return null;
  }

  void showHumans() {
    for (Human person : humans)
      System.out.println(person);
  }

}
