package COMIDASRAPIDAS.Productos;
import COMIDASRAPIDAS.*;
public class FrenchFries extends Producto {
    private String estilo;

    public FrenchFries(String estilo) {
        super("French Fries", 5000);
        this.estilo = estilo;
    }

    public String toString() {
        return getNombre() + ": " + estilo;
    }
}
