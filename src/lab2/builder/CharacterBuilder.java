package lab2.builder;

public interface CharacterBuilder {
    CharacterBuilder setName(String name);
    CharacterBuilder setHeight(String height);
    CharacterBuilder setBodyType(String bodyType);
    CharacterBuilder setHairColor(String hairColor);
    CharacterBuilder setEyeColor(String eyeColor);
    CharacterBuilder setClothes(String clothes);
    CharacterBuilder addInventoryItem(String item);
    CharacterBuilder setAlignment(String alignment);
    CharacterBuilder addDeed(String deed);
    Character build();
}