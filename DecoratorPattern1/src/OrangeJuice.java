public class OrangeJuice extends CondimentDecorator {
    Drink drink;

    public OrangeJuice (Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {return drink.getDescription() + ", Under Rock Ice";}

    public double cost() { return .15 + drink.cost();}
}
