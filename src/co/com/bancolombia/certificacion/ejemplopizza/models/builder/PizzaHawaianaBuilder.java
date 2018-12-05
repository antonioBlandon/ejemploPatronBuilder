package co.com.bancolombia.certificacion.ejemplopizza.models.builder;

import co.com.bancolombia.certificacion.ejemplopizza.models.Pizza;
import co.com.bancolombia.certificacion.ejemplopizza.utils.Builder;

public class PizzaHawaianaBuilder implements Builder<Pizza> {

    private String masa = "";
    private String salsa = "";
    private String relleno = "";

    public static PizzaHawaianaBuilder crearPizza() {
        return new PizzaHawaianaBuilder();
    }

    public PizzaHawaianaBuilder conMasa(String masa) {
        this.masa = masa;
        return this;
    }

    public PizzaHawaianaBuilder conSalsa(String salsa) {
        this.salsa = salsa;
        return this;
    }

    public PizzaHawaianaBuilder conRelleno(String relleno) {
        this.relleno = relleno;
        return this;
    }

    public Pizza yRelleno(String relleno) {
        this.relleno = relleno;
        return build();
    }

    @Override
    public Pizza build() {
        return new Pizza(masa,salsa,relleno);
    }
}
