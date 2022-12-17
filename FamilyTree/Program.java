package FamilyTree;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    FamilyTree familyTree = new FamilyTree();

    Human ivanIvanov = new Human("Иван Иванов", "Мужской");
    Human mariaIvanova = new Human("Мария Иванова", "Женский");
    Human petrIvanov = new Human("Петр Иванов", "Мужской", mariaIvanova, ivanIvanov);

    familyTree.addHuman(ivanIvanov);
    familyTree.addHuman(mariaIvanova);
    familyTree.addHuman(petrIvanov);

    Scanner str = new Scanner(System.in);

    System.out.print(
        "Меню:\n1 - Показать всех людей\n2 - Найти человека по имени и фамилии\n3 - Добавить нового человека\nВыбрано: ");

    String selectedItem = str.next();

    String fullName;
    switch (selectedItem) {
      case "1":
        System.out.println("\nЛюди из семейного дерева:");
        familyTree.showHumans();
        break;

      case "2":
        Human person = familyTree.searchByName();
        familyTree.moreInfo(person);
        break;

      case "3":
        // System.out.print("\nВведите имя и фамилию: ");
        // fullName = str.next() + " " + str.next();
        // System.out.print("Выберите пол (введите букву: М - мужской, Ж - женский): ");
        // String gender = str.next().toLowerCase();
        // if (gender.equals("ж"))
        // gender = "Женский";
        // else
        // gender = "Мужской";

        // System.out.println("Введено: Имя " + fullName + " пол " + gender);

        // Map<Integer, Human> availableParents =
        // familyTree.betterGetterHumans("мужской");
        // System.out.println(availableParents);
        // System.out.println("Выберите отца: ");
        // availableParents.entrySet()
        // .stream()
        // .forEach(person -> System.out.println(person.getKey() + " - " +
        // person.getValue()));
        // int numOfParent = str.nextInt();

        // familyTree.addHuman(fullName, gender, availableParents.get(numOfParent),
        // availableParents.get(numOfParent));

        break;

      default:
        System.out.println("Выбран недействительный пункт меню");
        break;
    }
    str.close();
  }

  public void chooseParent() {

  }
}
