package lab2.builder;

import java.util.ArrayList;
import java.util.List;

public class Character {
    String name;
    String height;
    String bodyType;
    String hairColor;
    String eyeColor;
    String clothes;
    List<String> inventory = new ArrayList<>();
    String alignment;
    List<String> deeds = new ArrayList<>();

    public void showCharacter() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Body type: " + bodyType);
        System.out.println("Hair color: " + hairColor);
        System.out.println("Eye color: " + eyeColor);
        System.out.println("Clothes: " + clothes);
        System.out.println("Inventory: " + inventory);
        System.out.println("Alignment: " + alignment);
        System.out.println("Deeds: " + deeds);
    }
}