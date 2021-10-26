public class Olive extends CondimentDecorator {
    Drink drink;

    public Olive (Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {return drink.getDescription() + ", Olive";}

    public double cost() { return .50 + drink.cost();}
}
