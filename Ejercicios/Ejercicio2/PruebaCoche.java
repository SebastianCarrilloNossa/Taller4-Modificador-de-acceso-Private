package Taller4ModificadordeaccesoPrivate.Ejercicios.Ejercicio2;

public class PruebaCoche {
    public static void main(String[] args) {
        // Crear un objeto Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 180);

        // Intentar acceder a las propiedades privadas directamente (esto causará un error de compilación)
        
        // System.out.println(miCoche.marca); // Error: marca tiene modificador de acceso private
        // System.out.println(miCoche.modelo); // Error: modelo tiene modificador de acceso private
        // System.out.println(miCoche.velocidadMaxima); // Error: velocidadMaxima tiene modificador de acceso private

        // Usar los métodos getter para acceder a las propiedades
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Velocidad Máxima: " + miCoche.getVelocidadMaxima());

        // Acelerar el coche
        miCoche.acelerar(20);
        System.out.println("Nueva velocidad máxima: " + miCoche.getVelocidadMaxima());

        // Intentar acelerar con un valor negativo
        miCoche.acelerar(-10); // Debe mostrar un mensaje indicando que el incremento no es válido
    }
}

