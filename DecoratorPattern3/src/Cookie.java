public class Cookie extends CondimentDecorator {
    Icecream icecream;
    public Cookie(Icecream icecream) { this.icecream = icecream; }
    public String getDescription() {return icecream.getDescription() + ", Cookie";}
    public double cost() { return 500 + icecream.cost();}
    public double calories() { return 50.1 + icecream.calories(); }
}
