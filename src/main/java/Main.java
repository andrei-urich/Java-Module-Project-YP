

public class Main {
    public static void main(String[] args) {
        PersonsCount personsCount = new PersonsCount();
        ItemsList itemsList = new ItemsList();
        Calculator calculator = new Calculator();
        ResultViewer resultViewer = new ResultViewer();

        int peopleAmount = personsCount.getPeopleAmount();
        itemsList.inputItemsList();
        double moneyPerPerson = calculator.splitSum(peopleAmount, itemsList);
        resultViewer.viewResult(itemsList, moneyPerPerson, peopleAmount);
    }
}