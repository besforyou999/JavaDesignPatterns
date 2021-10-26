public class SeatWarmer extends CondimentDecorator {
    Car car;
    public SeatWarmer(Car car) {this.car = car;}
    public String getDescription() {return car.getDescription() + ", Seat Warmer";}
    public int cost() { return  + car.cost();}
}
