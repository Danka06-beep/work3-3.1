package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();


        System.out.format("У игрока %d nслотов с оружием," + " введите номер, чтобы выстрелить," + " -1 чтобы выйти%n", player.getSlotsCount());
        int slots = scanner.nextInt() ;

        while (true) {
            switch (slots) {
                case 0:
                    player.shotWithWeapon(0);
                    break;
                case 1:
                    player.shotWithWeapon(1);
                    break;

                default:
                    System.out.println("Выберите оружие от 0 до 2");
                    break;
            }
            slots = scanner.nextInt() ;
            if(slots == (-1)){
                System.out.println("Game Over!");
                break;
            }
            }
            }
            }







