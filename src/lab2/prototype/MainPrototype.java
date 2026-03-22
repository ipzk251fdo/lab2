package lab2.prototype;

public class MainPrototype {

    public static void main(String[] args) {


        Virus parent = new Virus(2.5, 5, "Alpha", "A");


        Virus child1 = new Virus(1.2, 2, "Beta", "B");
        Virus child2 = new Virus(1.3, 2, "Gamma", "B");


        Virus grand1 = new Virus(0.5, 1, "Delta", "C");
        Virus grand2 = new Virus(0.6, 1, "Omega", "C");

        child1.addChild(grand1);
        child2.addChild(grand2);

        parent.addChild(child1);
        parent.addChild(child2);

        System.out.println("=== ORIGINAL FAMILY ===");
        parent.showInfo();
        child1.showInfo();
        child2.showInfo();


        Virus cloned = parent.clone();

        System.out.println("\n=== CLONED FAMILY ===");
        cloned.showInfo();
    }
}
