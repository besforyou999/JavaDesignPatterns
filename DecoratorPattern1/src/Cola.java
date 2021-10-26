public class Cola extends CondimentDecorator {
    Drink drink;

    public Cola (Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {return drink.getDescription() + ", Cola";}

    public double cost() { return .15 + drink.cost();}
}
