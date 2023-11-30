package aquarium;

//Создать класс Human с полями name и age, и методом getFood(aquarium.Aquarium).
public class Human {

    private int age;
    private String name;
    private int money = 40000;
    Aquarium[] userAqs = new Aquarium[10];

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return this.money;
    }

    public boolean checkSpace() {
        boolean a = false;
        for(int i = 0; i < userAqs.length; i++) {
            if(userAqs[i] == null) {
                a = true;
            }else {
                a = false;
            }
        }
        return a;
    }
    public boolean checkMoney(int price) {
        return price < money;
    }

    public void getInfo() {
        System.out.printf("Вы %s вам %d и у вас %d денег", name, age, money);
    }

    public void getAqsList() {
        for (int i = 0; i < userAqs.length; i++) {
            if(userAqs[i] != null) {
                System.out.printf("№" + i + " ");
                userAqs[i].getInfo();
            }
            else {
                System.out.println("Пустое");
            }

        }
    }
    public void buyAq(Aquarium aquarium) {
        for (int i = 0; i < userAqs.length; i++) {
            if(userAqs[i] == null && checkMoney(aquarium.getPrice()) && checkSpace()) {
                userAqs[i] = aquarium;
                setMoney(money - aquarium.getPrice());
                System.out.printf("Вы купили оквариум за %d и у вас осталось %d денег\n", aquarium.getPrice(), getMoney());
                return;
            }else {
                System.out.println("Вам некуда купить");
            }
        }
    }

    public Human() {
        this.name = getName();
        this.age = getAge();
        this.money = getMoney();

    }
}