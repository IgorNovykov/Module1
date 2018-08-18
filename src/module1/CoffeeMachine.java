package module1;

public class CoffeeMachine implements CoffeeMaking {
    public String model;
    private double coefficientOfHeating;
    private final double MAX_COEFFICIENT_OF_HEATING = 3;

    public CoffeeMachine() {
    }

    public CoffeeMachine(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public double getCoefficientOfHeating() {
        return coefficientOfHeating;
    }

    public void setCoefficientOfHeating(double coefficientOfHeating) {
        this.coefficientOfHeating = coefficientOfHeating;
    }

    @Override
    public void doCoffee() {
        Barman barman = new Barman();
        People people = new People();
        Coffee coffee = new Coffee();
        barman.preparative();
        barman.sellCoffee();
        System.out.println("Barman " + barman.getBarmanName() + " sold" + coffee.getName() + " to the client, with the inscription:" + "\n" +
                "Dear" + people.getName() + ", Starbucks wishes you a nice day");
    }

    public boolean coffeeMachineIsWorkable() {
        return coefficientOfHeating < MAX_COEFFICIENT_OF_HEATING;
    }
}
