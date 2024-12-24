import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Создаем список котов с различными действиями
        var cats = new ArrayList<ActiveCat>();

        // Добавляем котов с различными действиями
        cats.add(new ActiveCat(ActiveCat.jump())); // Кот прыгает
        cats.add(new ActiveCat(ActiveCat.sleep())); // Кот спит
        cats.add(new ActiveCat(ActiveCat.eat())); // Кот кушает

        // Добавим ещё два кота с другими действиями
        cats.add(new ActiveCat(ActiveCat.jump())); // Кот снова прыгает
        cats.add(new ActiveCat(ActiveCat.sleep())); // Кот снова спит

        // Выполняем действие для каждого кота
        cats.forEach(ActiveCat::doAction);
    }
}