public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Item item1 = new Item("generic item", 12);
        // Fruit fruit = new Fruit("fuji", "Apple", 20);
        // Weapon weapon1 = new Weapon("AR", "AK-47", 10, 90);
        // inventory.addItem(item1);
        // inventory.addItem(fruit);
        // inventory.addItem(weapon1);
        // inventory.displayInventory();
        // System.out.println(weapon1.getDamage());


        Item item = new Item("Very Generic items",20);
        Fruit fruit = new Fruit("fruits","Apple",15);
        Weapon weapon = new Weapon("AR","AK-47",10,90);

        inventory.addItem(item);
        inventory.addItem(fruit);
        inventory.addItem(weapon);
        inventory.displayInventory();
    }
}