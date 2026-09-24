public class PrincipalEstudiante {
    public static void main(String[] args) {
        // Creación de objeto usando el constructor parametrizado
        Estudiante alumno1 = new Estudiante(1, "Carlos Mendoza", 450);

        // Uso de métodos mutators para actualizar datos
        alumno1.setPuntos(500);

        // Mostrar datos usando el método toString y accessors
        System.out.println(alumno1.toString());
        System.out.println("Nombre consultado con Getter: " + alumno1.getNombre());
    }
}