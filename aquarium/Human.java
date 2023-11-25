package aquarium;

//Создать класс Human с полями name и age, и методом getFood(aquarium.Aquarium).
public class Human {

    private String name;
    private int age;
    private int money = 40000;

    private Aquarium[] userAquariums = new Aquarium[10];

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    void setMoney(int money) {
        this.money = money;
    }

    int getMoney() {
        return this.money;
    }


    public void getFood(Aquarium aquarium) {

    }

    public boolean checkMoneyExists() {
        return money > 0;
    }

    public boolean checkCanBuyAquarium(Aquarium aquarium) {
        return money > aquarium.getPrice();
    }

    public void buyAquarium(Aquarium aquarium) {
        if (checkCanBuyAquarium(aquarium)) {
            for (int i = 0; i < this.userAquariums.length; i++) {
                if (this.userAquariums[i] == null) {
                    this.userAquariums[i] = aquarium;
                    this.money = money - aquarium.getPrice();
                    System.out.printf("Поздравляем! вы купили новый аквариум за %d, у вас осталось %d денег\n",
                            aquarium.getPrice(), money - aquarium.getPrice());
                    break;

                } else if (i == this.userAquariums.length - 1) {
                    System.out.println("Список аквариумов полный, необходимо продать или убрать один из списка");
                    System.out.println("Поздравляем! Вы ничего не купили.");
                }
            }

        } else {
            System.out.printf("У вас %d денег, вам не хватает %d для покупки\n", money, aquarium.getPrice() - money);
        }
    }
}

