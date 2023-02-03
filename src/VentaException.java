/**
 * Clase VentaException
 * Clase que hereda de Exception
 * @author Willy
 * @version 1.0
 */
public class VentaException extends Exception{
    /**
     * Constructor VentaExpception que recibe 1 parametro
     * @param message
     */
    public VentaException(String message) {
        super(message);
    }
}
