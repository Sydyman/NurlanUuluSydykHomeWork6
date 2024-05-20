public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Имя : " + getName());
        System.out.println("Здоровье: " + getHealth());
        System.out.println("Оружие: " + weapon.getName() +  weapon.getType() );
    }
}
