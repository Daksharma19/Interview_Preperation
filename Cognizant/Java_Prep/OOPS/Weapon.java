public class Weapon extends Item {
    private int damage;
    private String type;

    public Weapon(String type,String name, int quantity, int damage) {
        super(name, quantity);
        this.type = type;
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Weapon: "+ getName() + " Quantity: "+ getQuantity() + " Damage: " + getDamage() + " Type:" + getType() ;
    }
}
