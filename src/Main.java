public class Main {
    public static void main(String[] args) {
        // Creamos los coches
        Coche audi_a6 = new Coche("A6", "Audi", 2019, 79000, "Negro", 4);
        System.out.println("Audi A6" + audi_a6);
        Coche bwm_serie_1 = new Coche("Serie 1", "BMW", 2009, 10000, "Blanco", 1);
        System.out.println("BMW Serie 1" + bwm_serie_1);
        Coche scirocco = new Coche("Scirocco" ,"Volkswagen", 2016, 20000, "Azul", 6);
        System.out.println(scirocco);

        // Bucle for para vender los coche y ver que pasa cuando se han vendido todos
        for (int i = 0; i < 5; i++) {
            try{
                audi_a6.sell();
                System.out.println("Audi A6: " + audi_a6);
            }catch (VentaException e) {
                System.err.println(e.getMessage());
            }

            try {
                bwm_serie_1.sell();
                System.out.println("BMW Serie 1: " + bwm_serie_1);
            }catch (VentaException e) {
                System.err.println(e.getMessage());
            }

            try {
                scirocco.sell();
                System.out.println("Volkswagen Scirocco: " + scirocco);
            } catch (VentaException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}