package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Human {
  private String fullName;
  private String gender;
  private Human mother;
  private Human father;
  private List<Human> children;

  public Human(String fullName, String gender, Human mother, Human father) {
    this.fullName = fullName;
    this.gender = gender;
    this.mother = mother;
    this.father = father;
    father.children.add(this);
    mother.children.add(this);
    this.children = new ArrayList<>();
  }

  public String getLastName() {
    return fullName.split(" ")[0];
  }

  public String getInfo() {
    String info = String.format("Name: %s, gender: %s.\nIt's parents:\nFather: %s\nMother: %s", fullName,
        gender, father, mother);

    if (children.isEmpty())
      return info;

    return String.format(info + "\nIt's children: %s", children);
  }

  @Override
  public String toString() {
    return String.format("Name: %s, gender: %s", fullName, gender);
  }

}
