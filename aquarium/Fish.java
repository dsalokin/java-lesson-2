package aquarium;

//Задание 1. Классы, поля, стандартный конструктор, объекты:
//1. Создать класс Fish.
//2. Добавить ему поля name(String), color(String), type(String).
//3. Создать экземпляр (объект) класса Fish.

public class Fish {

    String name;
    String color;

    String type;

    private boolean hungry;

    public boolean getHungry() {
        return this.hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}
