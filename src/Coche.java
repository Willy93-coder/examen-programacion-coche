/**
 * Clase Coche
 * Esta Clase gestiona todos los atributos y metodos de coche
 * @author Willy
 * @version 1.0
 */
public class Coche {
    // Atributos
    private String modelo;
    private String marca;
    private int anio;
    private double precio;
    private String color;
    private int cantidad;

    //Constructores
    /**
     * Constructor que no recibe ningun parametro
     */
    public Coche() {
    }

    /**
     * Constructor que recibe 6 parametros
     * @param modelo
     * @param marca
     * @param anio
     * @param precio
     * @param color
     * @param cantidad
     */
    public Coche(String modelo, String marca, int anio, double precio, String color, int cantidad) {
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
        this.color = color;
        this.cantidad = cantidad;
    }

    // Metodos
    /**
     * Metodo que devuelve el modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo que cambia el modelo y recibe un parametro
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo que devuelve la marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo que cambia la marca y recibe un parametro
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo que devuelve el anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Metodo que cambia el anio y recibe un parametro
     * @param anio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Metodo que devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo que cambia el precio y recibe un parametro
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo que devuelve el color
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo que cambia el color y recibe un parametro
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo que devuelve la cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Metodo que cambia la cantidad y recibe un parametro
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo para vender coche que puede lanzar la VentaException
     */
    public void sell () throws VentaException {
        int cantidadCochesVendidos = 0;
        if (this.cantidad <= 0) {
            throw new VentaException("Ya se han vendido todos los " + this.marca + this.modelo + ", ya no se pueden vender más");
        } else {
            cantidadCochesVendidos ++;
            this.cantidad --;
            System.out.println(cantidadCochesVendidos + " coche vendido");
        }
    }

    // To string
    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", anio=" + anio +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
