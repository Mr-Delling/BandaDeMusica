package dominio;

// Clase que representa un músico socio, extiende Musico
public class MusicoSocio extends Musico {
    private int numeroSocio; // Número de socio del músico

    // Constructor: inicializa el nombre, instrumento y número de socio
    public MusicoSocio(String nombre, String instrumento, int numeroSocio) {
        super(nombre, instrumento);
        this.numeroSocio = numeroSocio;
    }

    // Representación en texto del músico socio
    @Override
    public String toString() {
        return getNombre() + ", " + getInstrumento() + ", número de socio: " + numeroSocio;
    }
}
