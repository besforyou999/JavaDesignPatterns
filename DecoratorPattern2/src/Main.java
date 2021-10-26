public class Main {
    public static void main(String [] args) {

        Car lg = new Lamborghini();
        lg = new ABS(lg);
        lg = new TCS(lg);
        lg = new VDC(lg);
        lg = new LDWS(lg);
        lg = new Navigation(lg);
        lg = new SeatWarmer(lg);
        lg = new SmartKeys(lg);
        System.out.println(lg.getDescription() +
                " $" + lg.cost());

        Car hyundai = new Hyundai();
        hyundai = new ABS(hyundai);
        hyundai = new TCS(hyundai);
        hyundai = new VDC(hyundai);
        hyundai = new LDWS(hyundai);
        hyundai = new Navigation(hyundai);
        hyundai = new SeatWarmer(hyundai);
        hyundai = new PanoramaSunroof(hyundai);
        System.out.println(hyundai.getDescription() +
                " $" + hyundai.cost());
    }
}
