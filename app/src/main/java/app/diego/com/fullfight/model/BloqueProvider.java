package app.diego.com.fullfight.model;

import java.util.ArrayList;
import java.util.List;

public class BloqueProvider {
    public static List<Bloque> cargarBloques() {
        List<Bloque> bloques = new ArrayList<>();
        bloques.add(new Bloque("Audio1","Descrición1","Alta"));
        bloques.add(new Bloque("Audio2","Descrición2","Baja"));
        bloques.add(new Bloque("Audio1","Descrición1","Media"));

        return bloques;
    }

}
