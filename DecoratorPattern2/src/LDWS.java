public class LDWS extends CondimentDecorator{
    Car car;
    public LDWS(Car car) {this.car = car;}
    public String getDescription() { return car.getDescription() + ", LDWS";}
    public int cost() {return 17000 + car.cost();}
}
