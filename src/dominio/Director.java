package dominio;

// Clase que representa un director, extiende Participante
public class Director extends Participante {
    // Constructor: inicializa el nombre del director
    public Director(String nombre) {
        super(nombre);
    }

    // Representación en texto del director
    @Override
    public String toString() {
        return getNombre() + ", director";
    }
}
