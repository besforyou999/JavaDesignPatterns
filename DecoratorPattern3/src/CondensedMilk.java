public class CondensedMilk extends CondimentDecorator {
    Icecream icecream;
    public CondensedMilk(Icecream icecream) { this.icecream = icecream;}
    public String getDescription() {return icecream.getDescription() + ", Milk";}
    public double cost() { return 100 + icecream.cost();}
    public double calories() { return 42.3 + icecream.calories(); }
}
