package org.example.entities;

import org.example.entities.enums.Gender;
import org.example.utils.IniReader;

public class Player {

    int id;
    private String name;

    private Gender gender;

    public Player()
    {
        buildPlayer();
    }

    public void buildPlayer()
    {
        IniReader iniReader = new IniReader("src/main/resources/player_config.ini");

        this.id = iniReader.readInt("PLAYER", "id");
        this.name = iniReader.readString("PLAYER", "name");
        this.gender = iniReader.readString("PLAYER", "gender")
                .equals("male") ? Gender.MALE : Gender.FEMALE;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
