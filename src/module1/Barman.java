package module1;

public class Barman implements CoffeeMaking {
    public String barmanName;

    public Barman() {
    }

    public Barman(String barmanName) {
        this.barmanName = barmanName;
    }

    public String getBarmanName() {
        return barmanName;
    }

    public boolean coffeeIsPossible() {
        Coffee coffee = new Coffee();
        coffee.getCoffee();
        Storage storage = new Storage();
        return (coffee.getGrains() < storage.getGrains() && coffee.getCup() < storage.getCup() &&
                coffee.getMilk() < storage.getMilk() && coffee.getWater() < storage.getWater());
    }

    public void completeTheOrder() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        if (coffeeMachine.coffeeMachineIsWorkable()) {
            coffeeMachine.doCoffee();
        } else doCoffee();
    }

    public void preparative() {
        Storage storage = new Storage();
        Coffee coffee = new Coffee();
        storage.setCup((storage.getCup() - coffee.getCup()));
        storage.setGrains((storage.getGrains() - coffee.getGrains()));
        storage.setWater((storage.getWater() - coffee.getWater()));
        storage.setMilk((storage.getMilk() - coffee.getMilk()));
    }

    public void sellCoffee() {
        People people = new People();
        Coffee coffee = new Coffee();
        Terminal terminal = new Terminal();
        people.setAmountOfMoney((people.getAmountOfMoney() - coffee.getPrice()));
        terminal.setCash(coffee.getPrice());
    }

    @Override
    public void doCoffee() {
        Coffee coffee = new Coffee();
        People people = new People();
        preparative();
        sellCoffee();
        System.out.println("Barman " + barmanName + " sold" + coffee.getName() + " to the client, with the inscription:" + "\n" +
                "Dear" + people.getName() + ", Starbucks wishes you a nice day");
    }
}
