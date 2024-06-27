package ar.edu.unju.fi.ejercicio6.Model;

public class FelinoDomestico {
	private String Nombre;
	private byte Edad;
	private float Peso;
	
	@Override
	public String toString() {
		return "FelinoDomestico [Nombre=" + Nombre + ", Edad=" + Edad + ", Peso=" + Peso + "]";
	}
	public FelinoDomestico(String nombre, byte edad, float peso) {
		super();
		Nombre = nombre;
		Edad = edad;
		Peso = peso;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public byte getEdad() {
		return Edad;
	}
	public void setEdad(byte edad) {
		Edad = edad;
	}
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float peso) {
		Peso = peso;
	}

	
}