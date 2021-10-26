public class TCS extends CondimentDecorator {
    Car car;
    public TCS(Car car) {this.car = car;}
    public String getDescription() {return car.getDescription() + ", TCS";}
    public int cost() {return 2000 + car.cost();}
}
