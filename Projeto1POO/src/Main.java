import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is R$ %.2f", product1, price1);
        System.out.printf("%n%s, which price is R$ %.2f%n", product2, price2);

        System.out.printf("%nRecord: %s years old, code %d and gender: %c%n", age, code , gender);

        System.out.printf("%nMeasue with eight decimal places: %s", measure);
        System.out.printf("%nRouded (three decimal places): %.3f", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("%nUS decimal point: %.3f", measure);
    }
}
