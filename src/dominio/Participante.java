package dominio;

// Clase base abstracta para todos los participantes en una actuación
public abstract class Participante {
    private String nombre; // Nombre del participante

    // Constructor: inicializa el nombre
    public Participante(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el nombre del participante
    public String getNombre() {
        return nombre;
    }

    // Método abstracto que será implementado por las subclases
    @Override
    public abstract String toString();
}
