public class ChocolateSause extends CondimentDecorator {
    Icecream icecream;
    public ChocolateSause(Icecream icecream) {this.icecream = icecream;}
    public String getDescription() { return icecream.getDescription() + ", Chocolate Sause";}
    public double cost() {return 100 + icecream.cost();}
    public double calories() {return 27.8 + icecream.calories();}
}
