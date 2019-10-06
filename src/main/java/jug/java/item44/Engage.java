package jug.java.item44;

import jug.kotlin.Weapon;

import java.util.function.Supplier;

public class Engage {

    public void engage(String target, Supplier<Weapon> weaponSupplier) {
        final var weapon = weaponSupplier.get();
        System.out.println(target + " engaged using " + weapon);
        weapon.fire();
    }

}
