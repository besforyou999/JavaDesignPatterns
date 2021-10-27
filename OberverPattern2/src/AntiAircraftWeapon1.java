public class AntiAircraftWeapon1 implements Observer, DisplayElement {
    private double pos_x;
    private double pos_y;
    private Subject radar;

    public AntiAircraftWeapon1(Subject radar) {
        this.radar = radar;
        radar.registerAllyObject(this);
    }

    public void update(double x, double y) {
        this.pos_x = x;
        this.pos_y = y;
        display();
    }

    public void display() {
        System.out.println("Anti-Aircraft Weapon1 pos_x, pos_y : " + pos_x + " " + pos_y);
    }
}
