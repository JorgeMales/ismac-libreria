package com.distribuida.entities;

public class FacturaDetalle {

	private int idFacturaDetalle;
	private int cantidad;
	private double subTotal;
	private Factura factura;
	private Libro libro;
	//private int idFactura;
	//private int idLibro;
	
	public FacturaDetalle() {}
	//Contructor
	public FacturaDetalle(int idFacturaDetalle, int cantidad, double subTotal) {
	
		this.idFacturaDetalle = idFacturaDetalle;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
		//this.idFactura = idFactura;
		//this.idLibro = idLibro;
	}

	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}

	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}



	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subTotal="
				+ subTotal + ", factura=" + factura + ", libro=" + libro + "]";
	}

	
	

}