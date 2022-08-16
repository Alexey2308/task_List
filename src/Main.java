import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из операций:" + "\n" + " 1-Добавить  2-Показать  3-Удалить 4-Найти");

            int numberOfChoice = Integer.parseInt(scanner.nextLine());

            if (numberOfChoice == 1) {
                System.out.println("Какую покупку хотите добавить?");
                String item = scanner.nextLine();
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

                System.out.println("Какую хотите удалить? Введите номер или название");

                if (scanner.hasNextInt()) {
                    int itemDel = Integer.parseInt(scanner.nextLine());
                    String prodDel = list.get(itemDel - 1);
                    System.out.println("Покупка" + " " + prodDel + " " + "удалена");
                    list.remove(itemDel - 1);
                    continue;
                }
                String itemDel = scanner.nextLine();
                System.out.println("Покупка" + " " + itemDel + " " + "удалена");
                list.remove(itemDel);
            }

            if (numberOfChoice == 4) {

                System.out.println("Введите текст для поиска:");
                String queryLower = scanner.nextLine().toLowerCase();
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
