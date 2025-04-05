package COMIDASRAPIDAS.Productos;

import COMIDASRAPIDAS.*;

public class Hotdog extends Producto {
    private boolean conTocineta;
    private boolean conQueso;

    public Hotdog(boolean conTocineta, boolean conQueso) {
        super("Hotdog", 8000);
        this.conTocineta = conTocineta;
        this.conQueso = conQueso;
    }

    public String toString() {
        return getNombre() + ": Tocineta=" + conTocineta + ", Queso Adicional=" + conQueso;
    }
}