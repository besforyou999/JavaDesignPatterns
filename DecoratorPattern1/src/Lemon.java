public class Lemon extends CondimentDecorator {
    Drink drink;

    public Lemon (Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {return drink.getDescription() + ", Lemon";}

    public double cost() { return .30 + drink.cost();}
}
