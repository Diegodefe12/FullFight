package app.diego.com.fullfight.model;

public class Bloque {
    private String título;
    private String descripcion;
    private String intensidad;

    public Bloque() {
    }

    public Bloque(String título, String descripcion, String intensidad) {

        this.título = título;
        this.descripcion = descripcion;
        this.intensidad = intensidad;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }
}
