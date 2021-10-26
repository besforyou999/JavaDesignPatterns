public class IceCube extends CondimentDecorator {
    Drink drink;

    public IceCube (Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {return drink.getDescription() + ", Ice Cube";}

    public double cost() { return 0.2 + drink.cost();}
}

