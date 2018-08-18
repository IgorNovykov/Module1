package module1;

public class Storage {
    int cup;
    double grains;
    double water;
    double milk;

    public Storage() {
    }

    public Storage(int cup, double grains, double water, double milk) {
        this.cup = cup;
        this.grains = grains;
        this.water = water;
        this.milk = milk;
    }

    public int getCup() {
        return cup;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }

    public double getGrains() {
        return grains;
    }

    public void setGrains(double grains) {
        this.grains = grains;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public boolean coffeeIsPossible(Coffee coffee) {

        return (coffee.getGrains() < getGrains() && coffee.getCup() < getCup() &&
                coffee.getMilk() < getMilk() && coffee.getWater() < getWater());
    }
}

