package Taller4ModificadordeaccesoPrivate.Ejercicios.Ejercicio2;

public class Coche {
    // Propiedades privadas
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    // Constructor
    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para acelerar (incrementar velocidadMaxima solo si el incremento es positivo)
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }

    // Métodos getter para acceder a las propiedades privadas
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
}

