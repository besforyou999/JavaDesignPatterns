public class PanoramaSunroof extends CondimentDecorator {
    Car car;
    public PanoramaSunroof (Car car) {this.car = car;}
    public String getDescription() {return car.getDescription() + ", Panorama Sunroof";}
    public int cost() {return 1000 + car.cost();}
}
