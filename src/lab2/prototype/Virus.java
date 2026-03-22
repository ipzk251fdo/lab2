package lab2.prototype;

import java.util.ArrayList;
import java.util.List;

public class Virus implements Cloneable {

    private double weight;
    private int age;
    private String name;
    private String type;
    private List<Virus> children = new ArrayList<>();

    public Virus(double weight, int age, String name, String type) {
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.type = type;
    }

    public void addChild(Virus child) {
        children.add(child);
    }

    public void showInfo() {
        System.out.println("Virus: " + name +
                " | type: " + type +
                " | age: " + age +
                " | weight: " + weight +
                " | children: " + children.size());
    }

    @Override
    public Virus clone() {

        Virus copy = new Virus(weight, age, name + "_clone", type);

        for (Virus child : children) {
            copy.addChild(child.clone());
        }

        return copy;
    }
}
