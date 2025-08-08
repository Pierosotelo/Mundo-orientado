
public class Main {
    public static void main(String[] args) {
        Vehiculo auto1 = new Auto("Toyota", "Corolla");
        Vehiculo auto2 = new Auto("Hyundai", "New Santa Fe Mx5");
        Vehiculo motocicleta1 = new Motocicleta("Honda", "CBR");
        Vehiculo motocicleta2 = new Motocicleta("Italika", "Italika200");

        try {
            // Llamar al método encender() en cada objeto
            // Aunque la variable es de tipo Vehiculo, el método ejecutado es el de la clase hija
            // Ejemplo de polimorfismo
            System.out.println("\n");
            Thread.sleep(1000); // 1-second delay
            System.out.println("--- Encendiendo autos y Notocicleta---");
            Thread.sleep(1000); // 1-second delay
            System.out.println("En 3...");
            Thread.sleep(1000); // 1-second delay
            System.out.println("2...");
            Thread.sleep(1000); // 1-second delay
            System.out.println("1...");
            Thread.sleep(1000); // 1-second delay
            auto1.encender();
            Thread.sleep(1000); // 1-second delay
            auto2.encender();
            Thread.sleep(1000); // 1-second delay
            motocicleta1.encender();
            Thread.sleep(1000); // 1-second delay
            motocicleta2.encender();
        } catch (InterruptedException e) {
            // Handle the exception if the thread is interrupted while sleeping
            e.printStackTrace();
        }
    }
}