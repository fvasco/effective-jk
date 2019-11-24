package jug.java.item44;

import jug.kotlin.Cartridge;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class M134 {

    public void fire(Supplier<Cartridge> ammunitionBelt) {
        Stream.generate(ammunitionBelt)
                .limit(100)
                .map((cartridge) -> cartridge + " fired")
                .forEach(System.out::println);
    }
}
