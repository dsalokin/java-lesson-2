package aquarium;

import java.util.Objects;
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
        Aquarium[] aquariumList = new Aquarium[4];



        System.out.println("Введите имя Вашего персонажа");
        user.setName(sc.next());
        System.out.println("Введите возраст Вашего персонажа");
        user.setAge(sc.nextInt());

        do {
            System.out.println("""
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
                        System.out.printf("Вы %s вам %d\nУ вас '%d' денег\n",user.getName(), user.getAge(), user.getMoney());
                    }
                    case "2" -> {
                        System.out.println(" Доступные аквариумы, выберите действие от 1 до 5:");
                        System.out.printf("купить №1:\n%s\n%s");
                        System.out.printf("купить №2:\n%s\n");
                        System.out.printf("купить №3:\n%s\n");
                        System.out.printf("купить №4:\n%s\n");
                        System.out.println("Выйти");

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
            }else {
                System.out.println("игра закончилась, ходов не осталось");
                System.out.println("Ваш счет ");

                break;
            }

        }

        while (!Objects.equals(initialAnswer, "9"));


    }
}

