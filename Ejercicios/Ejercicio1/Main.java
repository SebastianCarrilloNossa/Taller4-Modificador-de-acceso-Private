package Taller4ModificadordeaccesoPrivate.Ejercicios.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Sebastián", 20, 4.5);

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota promedio: " + estudiante.getNotaPromedio());

        estudiante.setEdad(-5); // Imprime: Edad inválida.
        estudiante.setNotaPromedio(6.0); // Imprime: Nota promedio inválida.
    }
}
