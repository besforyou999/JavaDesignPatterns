public class Cherry extends CondimentDecorator {
    Icecream icecream;
    public Cherry(Icecream icecream) { this.icecream = icecream;}
    public String getDescription() {return icecream.getDescription() + ", Cherry"; }
    public double cost() {return 300 + icecream.cost();}
    public double calories() {return 5 + icecream.calories();}
}
