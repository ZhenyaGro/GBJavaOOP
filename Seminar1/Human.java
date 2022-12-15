package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Human {
  private String fullName;
  private String gender;
  private Human mother;
  private Human father;
  private List<Human> children;

  private String appeal;

  public Human(String fullName, String gender) {
    this.fullName = fullName;
    this.gender = gender;
    this.children = new ArrayList<>();

    if (this.gender.toLowerCase().equals("male"))
      this.appeal = "His";
    else
      this.appeal = "Her";
  }

  public Human(String fullName, String gender, Human mother, Human father) {
    this(fullName, gender);
    this.mother = mother;
    this.father = father;
    father.children.add(this);
    mother.children.add(this);
  }

  public String getLastName() {
    return fullName.split(" ")[0];
  }

  public String getInfo() {
    String info = String.format("Name: %s, gender: %s.\n%s parents:\nFather %s\nMother %s", fullName,
        gender, appeal, father, mother);

    if (children.isEmpty())
      return info + "\n" + fullName + " has not children";

    return String.format(info + "\n%s child(ren): %s", appeal, children);
  }

  public String getChildren() {
    if (children.isEmpty())
      return fullName + " has not children";

    return this.children.toString();
  }

  @Override
  public String toString() {
    return String.format("Name: %s, gender: %s", fullName, gender);
  }

}
