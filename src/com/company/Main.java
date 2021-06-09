package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Weapon weapon = new Weapon();

        while (true) {
            System.out.format("У игрока %d слотов с оружием," + " введите номер, чтобы выстрелить," + " -1 чтобы выйти%n", player.getSlotsCount());
            int slots = scanner.nextInt() ;
            if (slots == 1) {
                weapon = new Rpg();
            } else {
                weapon = new Weapon();
            }
            Weapon RpgShot = new Weapon();
            weapon.shot();

            if (slots == 2) {
                weapon = new Pistol();
            } else {
                weapon = new Weapon();
            }
            Weapon PistolShot = new Weapon();
            weapon.shot();

            if(slots == (-1)){
                break;
            }

        }
    }
}
