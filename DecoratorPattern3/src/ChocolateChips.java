public class ChocolateChips extends CondimentDecorator{
    Icecream icecream;
    public ChocolateChips(Icecream icecream) { this.icecream = icecream;}
    public String getDescription() { return icecream.getDescription() + ", Chocolate Chips";}
    public double cost() { return 500 + icecream.cost();}
    public double calories() {return 54.5 + icecream.calories();}
}
