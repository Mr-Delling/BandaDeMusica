package aplicacion;

import java.math.BigDecimal;
import java.time.LocalDate;
import dominio.*;

public class Principal {
    public static void main(String[] args) {
        // Crear una banda de música
        BandaMusica bd = new BandaMusica("Villar del Monte");
        
        // Primera actuación
        Actuacion act1 = new Actuacion(LocalDate.of(2019, 11, 25));
        bd.annadirActuacion(act1); // Añadir actuación a la banda

        // Crear director y añadirlo a la actuación
        Director dir = new Director("José García López");
        act1.annadirParticipante(dir);

        // Crear músico socio y añadirlo a la actuación
        MusicoSocio msc1 = new MusicoSocio("Antonio López Suárez", "clarinete", 28534);
        act1.annadirParticipante(msc1);

        // Crear músico de refuerzo y añadirlo a la actuación
        MusicoRefuerzo msr1 = new MusicoRefuerzo("Juan Jaén Bernal", "tuba", new BigDecimal("121.00"));
        act1.annadirParticipante(msr1);

        // Segunda actuación
        Actuacion act2 = new Actuacion(LocalDate.of(2019, 12, 16));
        bd.annadirActuacion(act2); // Añadir actuación a la banda

        // Reutilizar el director y músico socio para la segunda actuación
        MusicoRefuerzo msr2 = new MusicoRefuerzo("María López Gil", "oboe", new BigDecimal("130.00"));
        act2.annadirParticipante(dir);
        act2.annadirParticipante(msc1);
        act2.annadirParticipante(msr2);

        // Mostrar la información de la banda y sus actuaciones
        System.out.println(bd);
    }
}
