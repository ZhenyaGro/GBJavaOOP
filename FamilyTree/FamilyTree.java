package FamilyTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;;

public class FamilyTree {

  private List<Human> humans;

  public FamilyTree(List<Human> humans) {
    this.humans = humans;
  }

  public FamilyTree() {
    this(new ArrayList<>());
  }

  public void addHuman(Human human) {
    this.humans.add(human);
  }

  public void addHuman(String fullName, String gender) {
    this.humans.add(new Human(fullName, gender));
  }

  public void addHuman(String fullName, String gender, Human mother, Human father) {
    this.humans.add(new Human(fullName, gender, mother, father));
  }

  public Human searchByName(String fullName) {
    for (Human person : humans) {
      if (person.getFullName().toLowerCase().equals(fullName.toLowerCase())) {
        System.out.println(person);
        return person;
      }
    }
    return null;
  }

  public void showHumans() {
    for (Human person : humans)
      System.out.println(person);
  }

  public List<Human> getHumans(String gender) {
    List<Human> foundPeople = new ArrayList<Human>();

    if (gender == null) {
      for (Human person : humans)
        foundPeople.add(person);
    } else {
      for (Human person : humans) {
        if (person.getGender().toLowerCase().equals(gender.toLowerCase()))
          foundPeople.add(person);
      }
    }

    return foundPeople;
  }

  public Map<Integer, Human> betterGetterHumans(String gender) {
    Map<Integer, Human> foundPeople = new HashMap<>();

    int count = 0;
    if (gender == null) {
      for (Human person : humans)
        foundPeople.put(++count, person);
    } else {
      for (Human person : humans) {
        if (person.getGender().toLowerCase().equals(gender.toLowerCase()))
          foundPeople.put(++count, person);
      }
    }

    return foundPeople;
  }

}
