package module1;

public class Coffee {
    private String name;
    private int cup;
    private double grains;
    private double water;
    private double milk;
    private double price;

    public Coffee(){

    }
    public Coffee(String name, int cup, double grains, double water, double milk, double price) {
        this.name = name;
        this.cup = cup;
        this.grains = grains;
        this.water = water;
        this.milk = milk;
        this.price = price;
    }
    public Coffee getCoffee(){
        return this;
    }

    public String getName() {
        return name;
    }

    public int getCup() {
        return cup;
    }

    public double getGrains() {
        return grains;
    }

    public double getWater() {
        return water;
    }

    public double getMilk() {
        return milk;
    }

    public double getPrice() {
        return price;
    }
}
