public class Main {
    public static void main(String [] args) {

        Drink JackCoke = new JackDaniel();
        JackCoke = new Cola(JackCoke);
        JackCoke = new IceCube(JackCoke);
        System.out.println("JackCoke : " + JackCoke.getDescription() +
                " $" + JackCoke.cost());

        Drink jinTonic = new Jin();
        jinTonic = new IceCube(jinTonic);
        jinTonic = new TonicWater(jinTonic);

        System.out.println("Jin Tonic : " + jinTonic.getDescription() +
                " $" + jinTonic.cost());

    }
}
