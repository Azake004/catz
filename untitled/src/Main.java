import java.util.List;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        cats.sort(Cat.BY_BREED);
        Printer.print(cats);

        cats.sort(Cat.BY_NAME_AND_AGE);
        Printer.print(cats);

        cats.removeIf(Cat.IS_COLOR_BLACK);
        Printer.print(cats);

        cats.removeIf(Cat.IS_NAME_LENGTH_5);
        Printer.print(cats);
    }
}