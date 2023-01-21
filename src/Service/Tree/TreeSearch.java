package src.Service.Tree;

import java.util.Map;

import src.Entities.FamilyTree;
import src.Entities.Human;

public class TreeSearch<T extends Human> {
  private FamilyTree<T> tree;
  private Map<Integer, T> humans;

  public TreeSearch(FamilyTree<T> tree) {
    this.tree = tree;
  }

  public Map.Entry<Integer, T> byName(String fullName) {
    humans = tree.getHumans();

    for (Map.Entry<Integer, T> person : humans.entrySet()) {
      if (person.getValue()
          .getFullName()
          .toLowerCase()
          .equals(fullName.toLowerCase())) {
        return person;
      }
    }
    return null;
  }
}
