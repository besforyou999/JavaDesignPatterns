public class SmartKeys extends CondimentDecorator {
    Car car;
    public SmartKeys(Car car) {this.car = car;}
    public String getDescription() {return car.getDescription() + ", Smart Keys";}
    public int cost() {return 100 + car.cost();}
}
