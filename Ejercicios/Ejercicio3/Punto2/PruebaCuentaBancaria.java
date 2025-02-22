package Taller4ModificadordeaccesoPrivate.Ejercicios.Ejercicio3.Punto2;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        // Crear una cuenta bancaria con un saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        // Intentar acceder directamente al atributo privado 'saldo' (esto causará un error de compilación)
        // System.out.println(cuenta.saldo); // Error: saldo tiene modificador de acceso private
    }
    //DISCUCION
    /*La protección de datos mediante atributos privados asegura que los valores
     no sean cambiados de manera incorrecta desde fuera de la clase. Esto mejora
    la seguridad, pero limita la flexibilidad si no hay métodos para acceder o modificar esos valores.
     Sin métodos get o set, el acceso es más controlado, pero puede ser más difícil de manejar si se necesitan cambios frecuentes. */
}



