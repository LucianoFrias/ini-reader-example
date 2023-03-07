package org.example.entities;

import org.example.utils.IniReader;

public class Character {

    private String name;
    private int minHP;
    private int maxHP;
    private int armorPoints;
    private String weapon;
    private String shield;

    public Character()
    {
        buildCharacter();
    }

    public void buildCharacter()
    {
        IniReader iniReader = new IniReader("src/main/resources/player_config.ini");

        this.name = iniReader.readString("CHARACTER", "name");
        this.minHP = iniReader.readInt("CHARACTER", "minHP");
        this.maxHP = iniReader.readInt("CHARACTER", "maxHP");
        this.armorPoints = iniReader.readInt("CHARACTER", "armorPoints");
        this.weapon = iniReader.readString("CHARACTER", "weapon");
        this.shield = iniReader.readString("CHARACTER", "shield");

    }


    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", minHP=" + minHP +
                ", maxHP=" + maxHP +
                ", armorPoints=" + armorPoints +
                ", weapon='" + weapon + '\'' +
                ", shield='" + shield + '\'' +
                '}';
    }
}
