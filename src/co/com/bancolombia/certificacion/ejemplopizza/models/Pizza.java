package co.com.bancolombia.certificacion.ejemplopizza.models;

public class Pizza {

    private String masa = "";
    private String salsa = "";
    private String relleno = "";

    @Override
    public String toString() {
        return "Pizza{" +
                "masa:'" + masa + '\'' +
                ", salsa:'" + salsa + '\'' +
                ", relleno:'" + relleno + '\'' +
                '}';
    }

    public Pizza(String masa, String salsa, String relleno) {
        this.masa = masa;
        this.salsa = salsa;
        this.relleno = relleno;
    }
}
