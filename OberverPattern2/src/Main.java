public class Main {
    public static void main(String [] args) {
        Radar radar = new Radar();

        JetFighter1 jetFighter1 = new JetFighter1(radar);
        JetFighter2 jetFighter2 = new JetFighter2(radar);
        AntiAircraftWeapon1 aaw1 = new AntiAircraftWeapon1(radar);
        AntiAircraftWeapon2 aaw2 = new AntiAircraftWeapon2(radar);

        radar.setNewEnemyPosition(10.5, 15.5);
        System.out.println();

        radar.removeAllyObject(aaw1);

        radar.setNewEnemyPosition(5.5, 105.5);
        System.out.println();

        radar.registerAllyObject(aaw1);
        radar.registerAllyObject(aaw1);

        radar.setNewEnemyPosition(50.5, 190.5);
    }
}
