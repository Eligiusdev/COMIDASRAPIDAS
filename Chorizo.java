package COMIDASRAPIDAS.Productos;
import COMIDASRAPIDAS.*;
public class Chorizo extends Producto {
    private boolean conEnsalada;

    public Chorizo(boolean conEnsalada) {
        super("Chorizo", 7000);
        this.conEnsalada = conEnsalada;
    }

    public String toString() {
        return getNombre() + ": Ensalada=" + conEnsalada + ", incluye arepa y papa cocida";
    }
}
