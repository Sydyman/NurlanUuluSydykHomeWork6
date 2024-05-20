public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.AXE, "GoreHowl: ");
        Boss boss = new Boss();
        boss.setName("HellScream");
        boss.setHealth(7000);
        boss.setWeapon(bossWeapon);

        boss.printInfo();



        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Auriel: ");
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setName("Clinkz");
        skeleton1.setHealth(13);
        skeleton1.setWeapon(skeletonWeapon1);
        skeleton1.setArrowCount(10);
        skeleton1.printInfo();

        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Cross: ");
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setName("Skeleton");
        skeleton2.setHealth(37);
        skeleton2.setWeapon(skeletonWeapon2);
        skeleton2.setArrowCount(15);
        skeleton2.printInfo();

    }
}