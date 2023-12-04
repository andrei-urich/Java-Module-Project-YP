public class PersonsCount {
    public int getPeopleAmount() {
        while (true) {

            System.out.println("Пожалуйста, введите цифру, на сколько человек делим счет");
            try {
                int peopleAmount = MyScanner.scan.nextInt();
                if (peopleAmount > 1 && peopleAmount % 1 == 0) {
                    //MyScanner.scan.close();
                    return peopleAmount;
                } else {System.out.println("Должно быть целое число больше 1 ;)");}

            }catch (Exception e)
            {
                System.out.println("Должно быть целое число больше 1 ;)");
                MyScanner.scan.next();
            }


        }
    }
}
