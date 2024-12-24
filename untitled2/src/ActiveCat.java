import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// код можно менять только в особо отмеченных местах этого файла.

public final class ActiveCat {
    private static final Random r = new Random();
    private static final List<String> names = List.of("Peach", "Ginger", "Toby", "Seth", "Tibbles", "Tabby", "Poppy",
            "Millie", "Daisy", "Jasper", "Misty", "Minka");
    private final String name;

    // Поле action типа интерфейса Action
    private Action action;

    // Конструктор, который принимает объект типа Action
    public ActiveCat(Action action) {
        name = names.get(r.nextInt(names.size()));
        this.action = action;
    }

    public final String getName() {
        return name;
    }

    // Метод для выполнения действия
    public void doAction() {
        System.out.printf("Я %s. %s%n", name, action.perform());
    }

    /*****/
    // Действия доступные для котов: реализуем их как статические методы, возвращающие объекты Action

    public static Action jump() {
        return () -> "Я прыгаю!";
    }

    public static Action sleep() {
        return () -> "Я сплю!";
    }

    public static Action eat() {
        return () -> "Я кушаю!";
    }

    /*****/
}