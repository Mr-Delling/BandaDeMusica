package dominio;

// Clase base abstracta para músicos (socios y refuerzo)
public abstract class Musico extends Participante {
    private String instrumento; // Instrumento que toca el músico

    // Constructor: inicializa el nombre y el instrumento
    public Musico(String nombre, String instrumento) {
        super(nombre);
        this.instrumento = instrumento;
    }

    // Método para obtener el instrumento del músico
    public String getInstrumento() {
        return instrumento;
    }
}
