package co.com.bancolombia.certificacion.ejemplopizza.models;

import co.com.bancolombia.certificacion.ejemplopizza.utils.Builder;

public class PizzaJamonYQuesoBuilder implements Builder<Pizza> {

    private String masa;
    private String salsa;
    private String relleno;

    public static PizzaJamonYQuesoBuilder crearPizza() {
        return new PizzaJamonYQuesoBuilder();
    }

    public PizzaJamonYQuesoBuilder conMasa(String masa) {
        this.masa = masa;
        return this;
    }

    public PizzaJamonYQuesoBuilder conSalsa(String salsa) {
        this.salsa = salsa;
        return this;
    }

    public Pizza yRelleno(String relleno) {
        this.relleno = relleno;
        return build();
    }

    @Override
    public Pizza build() {
        return new Pizza(masa, salsa, relleno);
    }
}
