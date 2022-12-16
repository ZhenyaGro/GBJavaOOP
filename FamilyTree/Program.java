package FamilyTree;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    FamilyTree familyTree = new FamilyTree();

    Human ivanIvanov = new Human("Иван Иванов", "Мужской");
    Human mariaIvanova = new Human("Мария Иванова", "Женский");
    Human petrIvanov = new Human("Петр Иванов", "Мужсой", mariaIvanova, ivanIvanov);

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
        System.out.println("\nВведите имя и фамилию: ");
        fullName = str.next() + " " + str.next();
        Human foundPerson = familyTree.searchByName(fullName);
        if (foundPerson != null) {
          System.out.println("Получить дополнительную информацию о найденном человеке? (y/n): ");
          if (str.next().toLowerCase().equals("y"))
            System.out.println(foundPerson.getInfo());
        } else {
          System.out.println("Человек не найден");
        }
        break;

      case "3":
        System.out.print("\nВведите имя и фамилию: ");
        fullName = str.next() + " " + str.next();
        System.out.print("Выберите пол (введите букву: М - мужской, Ж - женский): ");
        String gender = str.next().toLowerCase();
        if (gender.equals("ж"))
          gender = "Женский";
        else
          gender = "Мужской";
        // familyTree.addHuman(fullName, gender);
        System.out.println("Введено: Имя " + fullName + " пол " + gender);
        familyTree.showHumans();
        break;

      default:
        System.out.println("Выбран недействительный пункт меню");
        break;
    }

  }
}
