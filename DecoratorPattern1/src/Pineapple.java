public class Pineapple extends CondimentDecorator {
    Drink drink;

    public Pineapple (Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {return drink.getDescription() + ", Under Rock Ice";}

    public double cost() { return .20 + drink.cost();}
}
