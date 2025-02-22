package Taller4ModificadordeaccesoPrivate.Ejercicios.Ejercicio3.Punto1;

public class PruebaAcceso {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan");

        // Intentamos acceder directamente a la propiedad 'nombre' (esto causará un error de compilación)
            System.out.println(persona.nombre); // Error: nombre tiene modificador de acceso private
        // Esto genera un error de compilación porque 'nombre' es una propiedad privada en la clase Persona
    }
}

