package co.com.bancolombia.certificacion.ejemplopizza;

import co.com.bancolombia.certificacion.ejemplopizza.models.Pizza;
import co.com.bancolombia.certificacion.ejemplopizza.models.builder.PizzaHawaianaBuilder;

import static co.com.bancolombia.certificacion.ejemplopizza.models.builder.PizzaHawaianaBuilder.crearPizza;

public class Main {
    public static void main(String[] args) {

        Pizza pizzaHawaiana = crearPizza()
                .conMasa("Delgada")
                .conSalsa("Tomate")
                .yRelleno("jamon queso y piña");

        pizzaHawaiana = crearPizza()
                .conMasa("Delgada")
                .conSalsa("Tomate")
                .conRelleno("jamon queso y piña")
                .build();

        Pizza pizzaJamonYQueso = crearPizza()
                .conMasa("cuasdn")
                .conSalsa("dse")
                .yRelleno("sedwefwe");

        System.out.println(pizzaHawaiana);
        System.out.println(pizzaJamonYQueso);
    }
}
