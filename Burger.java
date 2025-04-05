package COMIDASRAPIDAS.Productos;
import COMIDASRAPIDAS.*;
public class Burger extends Producto {
    private int tipoCarne;

    public Burger(int tipoCarne) {
        super("Burger", 10000 + (tipoCarne - 1) * 3000);
        this.tipoCarne = tipoCarne;
    }

    public String toString() {
        String tipo = tipoCarne == 1 ? "Sencilla" : tipoCarne == 2 ? "Doble" : "Triple";
        return getNombre() + ": " + tipo + ", incluye tocineta, lechuga, queso y pepinillo";
    }
}
