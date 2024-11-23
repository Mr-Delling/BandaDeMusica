package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Clase que representa una actuación de la banda
public class Actuacion {
    private LocalDate fecha; // Fecha de la actuación
    private List<Participante> participantes; // Lista de participantes en la actuación

    // Constructor: inicializa la fecha y la lista de participantes
    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    // Método para añadir un participante a la actuación
    public void annadirParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    // Sobrescritura de toString para representar la actuación y sus participantes
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha de actuación: ").append(fecha.toString().replace("-", "-")).append("\n");
        for (Participante participante : participantes) {
            sb.append(participante).append("\n");
        }
        return sb.toString();
    }
}
