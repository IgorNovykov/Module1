package module1;

public class People {
    private String name;
    private String kindOfCoffeeWant;
    private double amountOfMoney;
//    private Barman barman;
//    private Coffee coffee;


    public People() {
    }

    public People(String name, String kindOfCoffeeWant, double amountOfMoney) {
        this.name = name;
        this.kindOfCoffeeWant = kindOfCoffeeWant;
        this.amountOfMoney = amountOfMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfCoffeeWant() {
        return kindOfCoffeeWant;
    }

    public void setKindOfCoffeeWant(String kindOfCoffeeWant) {
        this.kindOfCoffeeWant = kindOfCoffeeWant;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public void buyCoffee(String kindOfCoffeeWant) {

        switch (kindOfCoffeeWant) {
            case "Latte":
                makeAnOrder();
                break;
            case "Espresso":
                makeAnOrder();
                break;
            case "Americano":
                makeAnOrder();
                break;
        }
    }

    private void makeAnOrder() {
        Barman barman = new Barman("Nikita");
        if (barman.coffeeIsPossible() && enoughMoney()) {
            barman.completeTheOrder();
        } else System.out.println("Order not possible!");
    }

    private boolean enoughMoney() {
        Coffee coffee = new Coffee();
        return getAmountOfMoney() >= coffee.getPrice();
    }
}
