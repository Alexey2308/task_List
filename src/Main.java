import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;


public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Выберите одну из операций:" + "\n" + " 1-Добавить  2-Показать  3-Удалить 4-Найти");
            Scanner scanner = new Scanner(in);
            int numberOfChoice = scanner.nextInt();

            if (numberOfChoice == 1) {
                Scanner s = new Scanner(in);
                System.out.println("Какую покупку хотите добавить?");
                String item = s.nextLine();
                list.add(item);
                System.out.println("Итого в списке покупок:" + list.size());
                continue;
            }

            if (numberOfChoice == 2) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + "." + " " + list.get(i));
                }
            }

            if (numberOfChoice == 3) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + "." + " " + list.get(i));
                }

                Scanner s1 = new Scanner(System.in);
                System.out.println("Какую хотите удалить? Введите номер или название");
                try {
                    int itemDel = s1.nextInt();
                    String prodDel = list.get(itemDel - 1);
                    System.out.println("Покупка" + " " + prodDel + " " + "удалена");
                    list.remove(itemDel - 1);
                } catch (Exception e) {
                    String itemDel = s1.nextLine();
                    System.out.println("Покупка" + " " + itemDel + " " + "удалена");
                    list.remove(itemDel);
                }
            }

            if (numberOfChoice == 4) {
                Scanner s2 = new Scanner(System.in);
                System.out.println("Введите текст для поиска:");
                String queryLower = s2.nextLine().toLowerCase();
                for (int i = 0; i < list.size(); i++) {
                    String itemLower = list.get(i).toLowerCase();
                    if (itemLower.contains(queryLower)) {
                        System.out.println((i + 1) + " " + list.get(i));
                    }

                }
            }

        }

    }
}



