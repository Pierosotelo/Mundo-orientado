public abstract class Vehiculo {
    // Atributos privados para encapsulamiento
    private String marca;
    private String modelo;

    // Constructor público para inicializar los atributos
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método público para acceder a la marca (encapsulamiento)
    public String getMarca() {
        return marca;
    }

    // Método público para acceder al modelo (encapsulamiento)
    public String getModelo() {
        return modelo;
    }

    // Método abstracto que debe ser implementado por las clases hijas (polimorfismo)
    public abstract void encender();
}