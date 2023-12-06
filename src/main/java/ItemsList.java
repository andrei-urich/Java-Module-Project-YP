import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemsList {
    ArrayList<Item> names = new ArrayList<Item>();

    public void inputItemsList() {
        System.out.println("Давайте добавим позиции из счета!");
        while (true) {
            Item item = new Item();
            System.out.println("Введите текстовое наименование позиции");
            while (true) {
                String regex = "^[a-zA-Zа-яА-Я]+$";
                Pattern pattern = Pattern.compile(regex);
                item.name = MyScanner.scan.next();
                Matcher matcher = pattern.matcher(item.name);
                if (matcher.matches()) {
                    break;
                } else {
                    System.out.println("Некорректный ввод. Название позиции может содержать только буквы");
                }
            }
            System.out.println("Введите стоимость позиции в рублях в формате \"00.00\"");
            while (true) {
                try {
                    item.price = Double.parseDouble(MyScanner.scan.next());
                    if (item.price <= 0) {
                        System.out.println("Некорректный ввод. Нужно ввести десятичное число больше нуля, с разделителем \".\"");
                    } else {
                        break;
                    }
                } catch (NumberFormatException ignore) {
                    System.out.println("Некорректный ввод. Нужно ввести десятичное число больше нуля");
                }
            }
            names.add(item);
            System.out.println("Позиция " + item.name + " с ценой " + item.price + " руб. добавлена.");

            System.out.println("Чтобы добавить еще одну позицию - введите любой символ.");
            System.out.println("Чтобы закончить добавление - напишите \"Завершить\"");
            if (MyScanner.scan.next().equalsIgnoreCase("Завершить")) {
                MyScanner.scan.close();
                return;
            }
        }
    }
}

