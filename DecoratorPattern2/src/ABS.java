public class ABS extends CondimentDecorator {
    Car car;
    public ABS (Car car) { this.car = car;}
    public String getDescription() {return car.getDescription() + ", ABS";}
    public int cost() { return 100 + car.cost();}
}
