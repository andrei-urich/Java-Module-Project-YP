
public class Calculator {

    public double splitSum(int peopleAmount, ItemsList itemsList) {
        double sum = 0;
        int s = itemsList.names.size();
        for (int i = 0; i < s; i = i + 1) {
            sum += itemsList.names.get(i).price;
            //System.out.println(sum);
        }
        return sum / peopleAmount;
    }

}
