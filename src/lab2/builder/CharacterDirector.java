package lab2.builder;

public class CharacterDirector {

    public Character createHero(CharacterBuilder builder) {
        return builder
                .setName("Arthas")
                .setHeight("190 cm")
                .setBodyType("Athletic")
                .setHairColor("Blonde")
                .setEyeColor("Blue")
                .setClothes("Silver armor")
                .addInventoryItem("Sword")
                .addInventoryItem("Shield")
                .setAlignment("Good")
                .addDeed("Saved the kingdom")
                .addDeed("Protected villagers")
                .build();
    }

    public Character createEnemy(CharacterBuilder builder) {
        return builder
                .setName("Morgoth")
                .setHeight("210 cm")
                .setBodyType("Massive")
                .setHairColor("Black")
                .setEyeColor("Red")
                .setClothes("Dark cloak")
                .addInventoryItem("Cursed blade")
                .addInventoryItem("Poison")
                .setAlignment("Evil")
                .addDeed("Destroyed villages")
                .addDeed("Captured innocent people")
                .build();
    }
}