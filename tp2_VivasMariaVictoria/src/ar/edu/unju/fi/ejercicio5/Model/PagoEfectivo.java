package ar.edu.unju.fi.ejercicio5.Model;
import java.time.LocalDate;
import ar.edu.unju.fi.ejercicio5.Interfaces.*;
public class PagoEfectivo implements Pago {
	private double montoPagado;
    private LocalDate fechaPago;

    public PagoEfectivo(double montoPagado, LocalDate fechaPago) {
        this.montoPagado = montoPagado;
        this.fechaPago = fechaPago;
    }

    public void realizarPago(double monto) {
        double descuento = monto * 0.10;
        this.montoPagado = monto - descuento;
    }

    public void imprimirRecibo() {
        System.out.println("Fecha de pago: " + fechaPago);
        System.out.println("Monto pagado: " + montoPagado);
    }
    
    
}