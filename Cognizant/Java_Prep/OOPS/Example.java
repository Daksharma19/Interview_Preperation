public class Example {
    public void display() {
        System.out.println("No args method");
    }
    public void display(String name) {
        System.out.println("Args method: " + name);
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.display();
        e.display("daksh");
    }
}
