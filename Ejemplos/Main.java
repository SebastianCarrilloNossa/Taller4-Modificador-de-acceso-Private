package Taller4ModificadordeaccesoPrivate.Ejemplos;

public class Incorrecto1 {
    private String nombre;

    public Incorrecto1(String nombre) {
        this.nombre = nombre;
    }
}

public class Main {
    public static void main(String[] args) {
     Incorrecto1 p = new Incorrecto1("Juan");
        System.out.println(p.nombre); // Error de compilación: nombre tiene acceso privado
    }
}
