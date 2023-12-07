package aquarium;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Human user = new Human();
        Scanner sc = new Scanner(System.in);
        String initialAnswer;
        System.out.println("Введите имя");
        user.setName(sc.next());
        System.out.println("Введите возраст");
        user.setAge(Integer.parseInt(sc.next()));
        System.out.printf("На начало игры у вас %d денег\n", user.getMoney());
        do {
            System.out.println("""
                    ---------------------------------------------------------------------------------------------------
                    Введите цифру соответствующую пункту меню:
                     1. Кто я и сколько у меня денег?
                     2. Купить аквариумов
                     3. Купить рыбов
                     4. Выключить
                    ---------------------------------------------------------------------------------------------------
                    """);



            initialAnswer = sc.next();

            if (user.getMoney()>0) {
                switch (initialAnswer) {
                    case "1" -> {user.getInfo();}
                    case "2" -> {
                        Aquarium[] aqStore = new Aquarium[4];
                        aqStore[0] = new Aquarium();
                        aqStore[1] = new Aquarium();
                        aqStore[2] = new Aquarium();
                        aqStore[3] = new Aquarium();

                        System.out.println("Доступные аквариумы, выберите действие от 1 до 5:");
                        System.out.printf("Вариант №1: ");
                        aqStore[0].getInfo();
                        System.out.printf("Вариант №2: ");
                        aqStore[1].getInfo();
                        System.out.printf("Вариант №3: ");
                        aqStore[2].getInfo();
                        System.out.printf("Вариант №4: ");
                        aqStore[3].getInfo();
                        System.out.println("Вариант №5: Вернуться в меню");
                        String aqIndex = sc.next();
                        switch (aqIndex) {
                            case "1", "2", "3", "4" -> {
                                System.out.printf("Покупка аквариума №%s\n", aqIndex);
                                user.buyAq(aqStore[Integer.parseInt(aqIndex)-1]);
                            }
                            case "5" -> {
                                System.out.println("Вы вернулись в меню");
                            }
                            default -> {System.out.println("Нет такого варианта, попробуйте снова");}
                        }
                    }
                    case "3" -> {
                        Fish[] fishStore = new Fish[4];
                        fishStore[0] = new Fish();
                        fishStore[1] = new Fish();
                        fishStore[2] = new Fish();
                        fishStore[3] = new Fish();

                        System.out.println("Доступные рыбов, выберите действие от 1 до 5:");
                        System.out.printf("Вариант №1:");
                        fishStore[0].getInfo();
                        System.out.printf("Вариант №2:");
                        fishStore[1].getInfo();
                        System.out.printf("Вариант №3:");
                        fishStore[2].getInfo();
                        System.out.printf("Вариант №4:");
                        fishStore[3].getInfo();
                        System.out.println("Вариант №5: Посмотрев. Сапасибое");
                        String fishIndex = sc.next();
                        switch (fishIndex) {
                            case "1", "2", "3", "4" -> {
                                System.out.println("Выберите аквариум из списка:");
                                user.getAqsList();
                                String aqIndex = sc.next();
                                user.userAqs[Integer.parseInt(aqIndex)-1].byFish(user, fishStore[Integer.parseInt(fishIndex)-1]);
                            }
                            case "5" -> {
                                System.out.println("Вы вернулись в меню");
                            }
                            default -> {
                                System.out.println("Нет такого варианта, попробуйте снова");
                            }

                        }
                    }
                    case "4" -> {
                        System.out.println("Вы выбрали 4");
                    }

                }
            } else {
                System.out.println("игра закончилась, ходов не осталось");
                System.out.println("Ваш счет ");
                break;
            }

        }

        while (!Objects.equals(initialAnswer, "4"));


    }
}

