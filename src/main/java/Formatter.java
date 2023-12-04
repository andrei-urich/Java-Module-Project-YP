public class Formatter {

    public String makeRightCase(double price) {
        String rightCase="руб.";
        int p = (int) price;

        if (p > 10 && p < 15) {
            rightCase = "рублей";
            return rightCase;
        }

        String p1 = Integer.toString(p);
        int p2 = Integer.parseInt("" + p1.charAt(p1.length() - 1));
        if (p2 == 1) {
            rightCase = "рубль";
        } else if (1 < p2 && p2 < 5) {
            rightCase = "рубля";
        } else if (4 < p2 || p2 == 0) {
            rightCase = "рублей";
        }
        return rightCase;
    }

}
