package lab2.builder;

public class HeroBuilder implements CharacterBuilder {

    private Character character = new Character();

    public CharacterBuilder setName(String name) {
        character.name = name;
        return this;
    }

    public CharacterBuilder setHeight(String height) {
        character.height = height;
        return this;
    }

    public CharacterBuilder setBodyType(String bodyType) {
        character.bodyType = bodyType;
        return this;
    }

    public CharacterBuilder setHairColor(String hairColor) {
        character.hairColor = hairColor;
        return this;
    }

    public CharacterBuilder setEyeColor(String eyeColor) {
        character.eyeColor = eyeColor;
        return this;
    }

    public CharacterBuilder setClothes(String clothes) {
        character.clothes = clothes;
        return this;
    }

    public CharacterBuilder addInventoryItem(String item) {
        character.inventory.add(item);
        return this;
    }

    public CharacterBuilder setAlignment(String alignment) {
        character.alignment = alignment;
        return this;
    }

    public CharacterBuilder addDeed(String deed) {
        character.deeds.add("GOOD: " + deed);
        return this;
    }

    public Character build() {
        return character;
    }
}
