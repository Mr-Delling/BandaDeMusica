package dominio;

import java.util.ArrayList;
import java.util.List;

// Clase que representa una banda de música
public class BandaMusica {
    private String nombre; // Nombre de la banda
    private List<Actuacion> actuaciones; // Lista de actuaciones de la banda

    // Constructor: inicializa el nombre y la lista de actuaciones
    public BandaMusica(String nombre) {
        this.nombre = nombre;
        this.actuaciones = new ArrayList<>();
    }

    // Método para añadir una actuación a la lista
    public void annadirActuacion(Actuacion actuacion) {
        this.actuaciones.add(actuacion);
    }

    // Sobrescritura de toString para representar la banda y sus actuaciones
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BANDA DE MÚSICA DE ").append(nombre.toUpperCase()).append("\n");
        for (Actuacion actuacion : actuaciones) {
            sb.append(actuacion).append("\n");
        }
        return sb.toString();
    }
}
