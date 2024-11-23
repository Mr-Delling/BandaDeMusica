package dominio;

import java.math.BigDecimal;

// Clase que representa un músico de refuerzo, extiende Musico
public class MusicoRefuerzo extends Musico {
    private BigDecimal cantidad; // Cantidad de dinero que recibe el músico de refuerzo

    // Constructor: inicializa el nombre, instrumento y cantidad
    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal cantidad) {
        super(nombre, instrumento);
        this.cantidad = cantidad;
    }

    // Representación en texto del músico de refuerzo
    @Override
    public String toString() {
        return getNombre() + ", " + getInstrumento() + ", " + cantidad.setScale(2) + " C";
    }
}
