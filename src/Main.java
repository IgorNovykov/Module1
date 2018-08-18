import module1.Barman;
//import module1.Cafe;
import module1.Coffee;
import module1.CoffeeMachine;
import module1.People;

public class Main {
    public static void main(String[] args) {

        People ivan = new People("Ivan", "Latte", 40.50d);
        People sergey = new People("Sergey", "Espresso", 120.25d);
        People maxim = new People("Maxim", "Americano", 80.75d);
        CoffeeMachine star = new CoffeeMachine("Star");
        Coffee latte = new Coffee("Latte", 1, 0.05, 0.25, 0.2, 31.5);
        Coffee espresso = new Coffee("Espresso", 1, 0.05, 0.25, 0.2, 31.5);
        Coffee americano = new Coffee("Americano", 1, 0.05, 0.25, 0.2, 31.5);
        Barman nikita = new Barman("Nikita");
        //Cafe starbucks = new Cafe("Starbucks", "Star", "Nikita");

        People[] queue = {ivan, sergey, maxim};


        for (People i : queue) {
            i.buyCoffee(i.getKindOfCoffeeWant());
        }

    }
}
