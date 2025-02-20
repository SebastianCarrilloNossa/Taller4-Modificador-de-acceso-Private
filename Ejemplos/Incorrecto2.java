package Taller4ModificadordeaccesoPrivate.Ejemplos;

public class Incorrecto2 {
    private double precio;

    public Incorrecto2(double precio) {
        this.precio = precio;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        // No se realiza ninguna validación aquí
        precio = nuevoPrecio;
    }
}
