package aquarium;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        Fish fish1 = new Fish();
//        fish1.name = "Goldy";
//        Fish fish2 = new Fish();
//        fish2.color = "green";
//        Fish fish3 = new Fish();
//        fish3.type = "1";
//
//        aquarium.Aquarium aq = new aquarium.Aquarium(10, 11, 12);
//
///

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initialAnswer;
        Human user = new Human();

        System.out.println("Введите имя Вашего персонажа");
        user.setName(sc.next());
        System.out.println("Введите возраст Вашего персонажа");
        user.setAge(sc.nextInt());

        do {
            System.out.println("""
                    ---------------------------------------------------------------------------------------------------
                    Введите цифру соответствующую пункту меню:
                     1. Кто я и сколько у меня денег?
                     2. Магазин аквариумов
                     3. Список доступных рыбов
                     4. Участвовать в выставке -100р +?р
                     5. Покормить рыбок -10р
                     6. Почистить аквариум -50р
                     7. Посмотреть аквариумы
                     8. Посмотреть рыбов
                     9. Выключить""");

            initialAnswer = sc.next();

            if (user.checkMoneyExists()) {
                switch (initialAnswer.toLowerCase()) {
                    case "1" -> {
                        System.out.printf("Вы '%s', вам '%d' и у вас '%d' денег\n",
                                user.getName(), user.getAge(), user.getMoney());
                    }
                    case "2" -> {
                        String buyAq;

                        Aquarium aq1 = new Aquarium();
                        Aquarium aq2 = new Aquarium();
                        Aquarium aq3 = new Aquarium();
                        Aquarium aq4 = new Aquarium();

                        Aquarium[] aquariumList = new Aquarium[4];

                        aquariumList[0] = aq1;
                        aquariumList[1] = aq2;
                        aquariumList[2] = aq3;
                        aquariumList[3] = aq4;
                        System.out.println("Доступные аквариумы, выберите действие от 1 до 5:");
                        System.out.printf("Вариант №1 - ширина/длина/глубина/цена:\n%s/%s/%s/%s\n",
                                aquariumList[0].getWidth(), aquariumList[0].getLength(),
                                aquariumList[0].getDepth(), aquariumList[0].getPrice());
                        System.out.printf("Вариант №2 - ширина/длина/глубина/цена:\n%s/%s/%s/%s\n",
                                aquariumList[1].getWidth(), aquariumList[1].getLength(),
                                aquariumList[1].getDepth(), aquariumList[1].getPrice());
                        System.out.printf("Вариант №3 - ширина/длина/глубина/цена:\n%s/%s/%s/%s\n",
                                aquariumList[2].getWidth(), aquariumList[2].getLength(),
                                aquariumList[2].getDepth(), aquariumList[2].getPrice());
                        System.out.printf("Вариант №4 - ширина/длина/глубина/цена:\n%s/%s/%s/%s\n",
                                aquariumList[3].getWidth(), aquariumList[3].getLength(),
                                aquariumList[3].getDepth(), aquariumList[3].getPrice());
                        System.out.println("Вариант №5 - Вернуться в меню");
                        buyAq = sc.next();
                        switch (buyAq) {
                            case "1", "2", "3", "4" -> {

                                user.buyAquarium(aquariumList[Integer.parseInt(buyAq) - 1]);

                            }
                            case "5" -> {
                                System.out.println("Вы вернулись в меню");
                            }
                            default -> {
                                System.out.println("Нет такого варианта, попробуйте снова");
                            }
                        }

                    }
                    case "3" -> {
                        System.out.println("Вы выбрали 3");
                    }
                    case "4" -> {
                        System.out.println("Вы выбрали 4");
                    }
                    case "5" -> {
                        System.out.println("Вы выбрали 5");
                    }
                    case "6" -> {
                        System.out.println("Вы выбрали 6");
                    }
                    case "7" -> {
                        System.out.println("Вы выбрали 7");
                    }
                    case "8" -> {
                        System.out.println("Вы выбрали 8");
                    }
                    case "9" -> {
                        System.out.println("пока");
                    }
                }
            } else {
                System.out.println("игра закончилась, ходов не осталось");
                System.out.println("Ваш счет ");

                break;
            }

        }

        while (!Objects.equals(initialAnswer, "9"));


    }
}

