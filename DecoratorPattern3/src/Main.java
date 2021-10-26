public class Main {
    public static void main(String []args) {

        Icecream icecream1 = new Vanila();
        icecream1 = new ChocolateChips(icecream1);
        icecream1 = new ChocolateSause(icecream1);
        icecream1 = new Sprinkles(icecream1);
        icecream1 = new Cherry(icecream1);
        System.out.println(icecream1.getDescription() +
                "\n" + icecream1.cost() + " 원\n" + icecream1.calories() +" kcal\n");

        Icecream icecream2 = new Chocolate();
        icecream2 = new CondensedMilk(icecream2);
        icecream2 = new Sprinkles(icecream2);
        icecream2 = new Cherry(icecream2);
        icecream2 = new MarshMellow(icecream2);
        System.out.println(icecream2.getDescription() +
                "\n" + icecream2.cost() + " 원\n" + icecream2.calories() +" kcal\n");

        Icecream icecream3 = new Mint();
        icecream3 = new ChocolateChips(icecream3);
        icecream3 = new MarshMellow(icecream3);
        icecream3 = new Cherry(icecream3);
        icecream3 = new ChocolateSause(icecream3);
        icecream3 = new Sprinkles(icecream3);
        icecream3 = new Caramel(icecream3);
        icecream3 = new CondensedMilk(icecream3);
        icecream3 = new Cookie(icecream3);
        System.out.println(icecream3.getDescription() +
                "\n" + icecream3.cost() + " 원\n" + icecream3.calories() +" kcal\n");


    }
}
