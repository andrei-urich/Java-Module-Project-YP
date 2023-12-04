public class ResultViewer {

    public void viewResult(ItemsList itemsList, double moneyPerPerson, int peopleAmount) {
        Formatter formatter = new Formatter();
        double sum = moneyPerPerson * peopleAmount;
        System.out.println("Добавленные товары:");
        for (int i = 0; i < itemsList.names.size(); i = i + 1) {

            System.out.println(itemsList.names.get(i).name + " " + itemsList.names.get(i).price + " " + formatter.makeRightCase(itemsList.names.get(i).price));
        }
        System.out.println("Общая сумма счета: " + String.format("%.2f", sum) + " " + formatter.makeRightCase(sum));
        System.out.println("Делим на " + peopleAmount + "-х.");
        System.out.println("Итого с каждого по " + String.format("%.2f", moneyPerPerson) + " " + formatter.makeRightCase(moneyPerPerson));
    }
}
