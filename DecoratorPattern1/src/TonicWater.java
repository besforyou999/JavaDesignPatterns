public class TonicWater extends CondimentDecorator {
    Drink drink;

    public TonicWater (Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {return drink.getDescription() + ", Tonic Water";}

    public double cost() { return 0.2 + drink.cost();}
}
