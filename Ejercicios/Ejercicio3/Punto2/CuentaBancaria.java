package Taller4ModificadordeaccesoPrivate.Ejercicios.Ejercicio3.Punto2;

public class CuentaBancaria {
    // Propiedad privada sin métodos get/set
    private double saldo;

    // Constructor
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Aquí no hay métodos get ni set para acceder al saldo
}
