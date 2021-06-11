package com.company;

class Player {
    public Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Rpg(),
                new Pistol()

        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;

    }

    public void shotWithWeapon(int slot) {


        Weapon weapon = weaponSlots[slot];
        weapon.shot();

    }
}
