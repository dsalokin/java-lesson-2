package aquarium;

//Задание 2. Доступы, обращения к объектам других классов, кастомный конструктор:
//1. Создать класс aquarium.Aquarium.
//2. Добавить ему приватные поля width(int, обязательное), depth(int, обязательное), length(int, обязательное), fishes(Fish[], может быть пустым).
//3. Создать экземпляр класса aquarium.Aquarium.

//Задание 3. Методы, доступы:
//1. В классе aquarium.Aquarium создать публичный метод addFish, который добавляет в массив fishes новую рыбку(Fish).
//2. В классе aquarium.Aquarium создать публичный метод removeFish, который удаляет из массива fishes последнюю рыбку(Fish) c конца.
//3. В классе aquarium.Aquarium создать приватный метод checkFish, который возвращает boolean значение, если рыбка с искомым индексом существует.


import java.util.Random;

public class Aquarium {

    Random r = new Random();

    private int width;
    private int depth;
    private int length;

    private int price;

    private Fish[] fishes = new Fish[10];


    //В классе aquarium.Aquarium добавить метод feedAllFishes(fishes), который у всех рыб в аквариуме
//поменяет поле hungry на true.
    public void feedAllFishes() {
        for (int i = 0; i < fishes.length - 1; i++) {
            if (fishes[i] != null) {
                fishes[i].setHungry(true);
            }
        }
    }

    //В классе aquarium.Aquarium добавить метод getInfo, который выводит информацию об аквариуме и
    //список рыб, живущих в нем, с полной информацией о них.

    public Aquarium getInfo() {
        System.out.println("Длина: " + this.length + "\nШирина: " + this.width +
                "\nГлубина: " + this.depth + "\nЦена: " + this.price);
        System.out.println("Рыбки: ");
        for (int i = 0; i < fishes.length - 1; i++) {
            if (fishes[i] != null) {
                System.out.printf("имя: %s, цвет: %s, тип: %s, голодная: %b \n",
                        fishes[i].name, fishes[i].color, fishes[i].type, fishes[i].getHungry());
            }
        }
        return this;
    }

    public void addFish(Fish fish) {
        if (checkFishExist(fish)) { //true
            System.out.println("Рыбка уже существует");
        } else {
            if (this.fishes[fishes.length - 1] != null) {
                System.out.println("Аквариум переполнен");
                return;
            }

            for (int i = 0; i < fishes.length; i++) {
                if (this.fishes[i] == null) {
                    this.fishes[i] = fish;
                    break;
                }
            }
        }
    }

    public void removeFish() {
        if (this.fishes[0] == null) {
            System.out.println("Аквариум уже пуст");
            return;
        }

        for (int i = fishes.length - 1; i >= 0; i--) {
            if (this.fishes[i] != null) {
                this.fishes[i] = null;
                break;
            }
        }
    }

    private boolean checkFishExist(Fish fish) {
        boolean var = false;
        for (int i = 0; i < this.fishes.length; i++) {
            if (this.fishes[i] == fish) {
                var = true;
            }
        }
        return var;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDepth() {
        return this.depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Aquarium(int price, int width, int length, int depth) {
        this.price = price;
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    public Aquarium() {
        this.price = r.nextInt(800, 4000);
        this.width = r.nextInt(3, 7);
        this.length = r.nextInt(3, 7);
        this.depth = r.nextInt(3, 7);
    }

}
