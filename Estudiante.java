public class Estudiante {
    // Atributos privados (Encapsulamiento)
    private int id;
    private String nombre;
    private int puntos;

    // Constructor por defecto
    public Estudiante() {
    }

    // Constructor parametrizado utilizando la referencia 'this' (Trabajo 2)
    public Estudiante(int id, String nombre, int puntos) {
        this.id = id;
        this.nombre = nombre;
        this.puntos = puntos;
    }

    // Métodos Accessors (Getters) y Mutators (Setters) (Trabajo 2)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    // Método especializado toString para mostrar la información del objeto
    @Override
    public String toString() {
        return "Estudiante [ID=" + id + ", Nombre=" + nombre + ", Puntos=" + puntos + "]";
    }
}