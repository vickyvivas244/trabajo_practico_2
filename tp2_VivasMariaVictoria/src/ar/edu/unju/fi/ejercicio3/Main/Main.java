package ar.edu.unju.fi.ejercicio3.Main;
import ar.edu.unju.fi.Constantes.Provincia;
public class Main {

	public static void main(String[] args) {
		Provincia[] provincias = Provincia.values();

        System.out.println("  ****  INFORMACION DE LAS PROVINCIAS  ****  ");
        for (Provincia provincia : provincias) {
            System.out.println("Provincia: " + provincia);
            System.out.println("Cantidad de poblacion: " + provincia.getCantidadPoblacion());
            System.out.println("Superficie: " + provincia.getSuperficie() + " km²");
            System.out.println("Densidad poblacional: " + provincia.calcularDensidadPoblacional() + " habitantes/km²");
            System.out.println();
        }
	}
}
