package org.example;

import org.example.entities.Character;
import org.example.entities.Player;
import org.example.utils.IniReader;

public class Main {
    public static void main(String[] args) {

        Character character = new Character();

        System.out.println(character);

        Player player = new Player();

        System.out.println(player);

    }
}