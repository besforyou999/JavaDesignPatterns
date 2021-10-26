public class VDC extends CondimentDecorator {
    Car car;
    public VDC (Car car) {this.car = car;}
    public String getDescription() { return car.getDescription() + ", VDC";}
    public int cost() { return 3000 + car.cost();}
}
