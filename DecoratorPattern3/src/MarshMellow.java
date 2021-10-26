public class MarshMellow extends CondimentDecorator {
    Icecream icecream;
    public MarshMellow(Icecream icecream ){this.icecream = icecream;}
    public String getDescription() {return icecream.getDescription() + ", MarshMellow";}
    public double cost() {return 400 + icecream.cost();}
    public double calories() {return 31.8 + icecream.calories();}
}
