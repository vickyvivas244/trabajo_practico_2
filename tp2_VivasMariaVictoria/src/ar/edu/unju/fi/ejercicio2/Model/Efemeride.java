package ar.edu.unju.fi.ejercicio2.Model;

import ar.edu.unju.fi.ejercicio2.Constantes.Mes;

public class Efemeride {
	private String codigo;
	private Mes mes;
	private int dia;
	private String detalle;
	
	public Efemeride () {
		
	}
	public Efemeride(String codigo, Mes mes, int dia, String detalle) {
		super();
		this.codigo = codigo;
		this.mes = mes;
		this.dia = dia;
		this.detalle = detalle;
	}
	public void MostrarDatos() { 
		System.out.println("Codigo: "+codigo);
		System.out.println("Mes: "+this.mes );
		System.out.println("Dia: "+dia);
		System.out.println("Detalle: "+detalle);
	}

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Mes getMes() {
		return mes;
	}


	public void setMes(Mes mes) {
		this.mes = mes;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	@Override
	public String toString() {
		return "Efemeride [codigo=" + codigo + ", mes=" + mes + ", dia=" + dia + ", detalle=" + detalle + "]";
	}
	
	
}
