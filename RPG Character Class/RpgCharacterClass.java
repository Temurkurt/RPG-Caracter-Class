package com.company;

public class RpgCharacterClass {
    private String Name;
    private String Gender;
    private String CharacterClass;
    private String Race;

    private int Strength;
    private int Dexterity;
    private int Constitution;
    private int Intelligence;
    private int Wisdom;
    private int Charisma;
    private int Total;

    public RpgCharacterClass(String Name,
                             String Gender,
                             String CharacterClass,
                             String Race,
                             int Strength,
                             int Dexterity,
                             int Constitution,
                             int Intelligence,
                             int Wisdom,
                             int Charisma) {
        this.Name = Name;
        this.Gender = Gender;
        this.CharacterClass = CharacterClass;
        this.Race = Race;
        this.Strength = Strength;
        this.Dexterity = Dexterity;
        this.Constitution = Constitution;
        this.Intelligence = Intelligence;
        this.Wisdom = Wisdom;
        this.Charisma = Charisma;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCharacterClass() {
        return CharacterClass;
    }

    public void setCharacterClass(String characterClass) {
        CharacterClass = characterClass;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    public int getConstitution() {
        return Constitution;
    }

    public void setConstitution(int constitution) {
        Constitution = constitution;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public void setWisdom(int wisdom) {
        Wisdom = wisdom;
    }

    public int getCharisma() {
        return Charisma;
    }

    public void setCharisma(int charisma) {
        Charisma = charisma;
    }

    public int getTotal() {
        return this.Strength +
                this.Dexterity +
                this.Constitution +
                this.Intelligence +
                this.Wisdom +
                this.Charisma;
    }

    @Override
    public String toString() {
        return String.format("Name: " + this.Name +
                             "\nGender: " + this.Gender +
                             "\nCharacterClass: " + this.CharacterClass +
                             "\nRace: " + this.Race +
                             "\n" +
                             "\nSTR: " + this.Strength +
                             "\nDEX: " + this.Dexterity +
                             "\nCON: " + this.Constitution +
                             "\nINT: " + this.Intelligence +
                             "\nWIS: " + this.Wisdom +
                             "\nCHA: " + this.Charisma +
                             "\nTOTAL: " + this.getTotal());
    }
}
