public class Caramel extends CondimentDecorator {
    Icecream icecream;
    public Caramel(Icecream icecream) {this.icecream = icecream;}
    public String getDescription() {return icecream.getDescription() + ", Caranmel";}
    public double calories() {return 38.1 + icecream.calories();}
    public double cost() {return 300 + icecream.cost();}
}
