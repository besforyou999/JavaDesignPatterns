public class Sprinkles extends CondimentDecorator {
    Icecream icecream;
    public Sprinkles(Icecream icecream) {this.icecream = icecream;}
    public String getDescription() {return icecream.getDescription() + ", Sprinkles";}
    public double calories() {return 20 + icecream.calories();}
    public double cost() {return 300 + icecream.cost();}
}
