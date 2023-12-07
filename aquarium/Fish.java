package aquarium;

//Задание 1. Классы, поля, стандартный конструктор, объекты:
//1. Создать класс Fish.
//2. Добавить ему поля name(String), color(String), type(String).
//3. Создать экземпляр (объект) класса Fish.

import java.util.Random;

public class Fish {

    Random r = new Random();
    int index = 0;

    private String name;
    private String color;
    private String type;
    private int price;

    private String[] colorArr  = new String[] {"Green", "Red", "Blue", "Black"};
    private String[] typeArr = new String[] {"Tuna", "Anchovy", "Salmon", "Piranha"};


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String getColor(int i) {
        return this.color;
    }
    public String getType(int i) {
        return this.type;
    }
    public int getPrice() {
        return this.price;
    }
    public void getInfo() {
        System.out.printf("Имя: %s/ Цвет: %s/ Тип: %s/ Цена: %d\n",name, color, type, price);
    }

    public Fish(String name, String color, String type, int price) {
        this.price = price;
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public Fish() {
        index = index + 1;
        this.price = r.nextInt(100, 1500);
        this.name = "Рыбка номер " + index;
        this.color = colorArr[r.nextInt(0, 3)].toString();
        this.type = typeArr[r.nextInt(0, 3)].toString();
    }


}
