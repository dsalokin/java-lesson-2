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
    private int size;
    private final int price;
    private int emptySpace = size;
    private Fish[] aqFishes = new Fish[size];

    public int getPrice() {
        return this.price;
    }

    public void getInfo() {
        System.out.printf("Размер %d / Свободно места %d /  Цена %d\n", size, emptySpace, price);
    }

    public boolean checkAqSpace(Aquarium[] aquarium) {
        boolean a = false;
        for(int i = 0; i < size; i++)
            {
                if(aquarium[i].aqFishes == null) {
                    a = true;
                }else {
                    a = false;
                }
            }
        return a;
    }

    public void byFish(Human user, Fish fish) {
        for (int i = 0; i < aqFishes.length; i++) {
            emptySpace = emptySpace + 1;
            if(aqFishes[i] == null && checkAqSpace(user.userAqs) && user.checkMoney(price)) {
                aqFishes[i] = fish;
                user.setMoney(user.getMoney() - fish.getPrice());
                System.out.printf("Вы купили рыбков за %d и у вас осталось %d денег\n",fish.getPrice(), user.getMoney());
            }else {
                System.out.println("Мы вам только показываем, вам некуда их купить\n");
            }
            break;
        }
    }



    public Aquarium() {
        this.size = r.nextInt(1,4);
        this.price = r.nextInt(1000,4000);
    }

}
