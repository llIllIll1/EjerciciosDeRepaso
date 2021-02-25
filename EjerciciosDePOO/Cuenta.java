/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDePOO;

/**
 *
 * @author misae
 */
public class Cuenta  {
	private String titular;
	private double cantidad;

	
	public double getCantidad() {
		return cantidad;
	}
	
	public Cuenta(String titular) throws Exception {
		this(titular,0);
	}
	
	public Cuenta(String titular, double cantidad) throws Exception {
		if(titular.isBlank() || titular.isEmpty()) {
			throw new Exception("Ocupas un nombre");
		}
		this.titular=titular;
		this.cantidad=cantidad;
	}
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	@Override
	public String toString() {
		return "El saldo de "+this.titular+" es de "+this.cantidad+" en el banco ";
	}
	
	public void ingresar(double cantidad) {
		if(cantidad>0) {
			this.cantidad+=cantidad;
		}
	}

	public void retirar(double cantidad) throws Exception {
		if(cantidad>0 && cantidad<=this.cantidad) {
			this.cantidad-=cantidad;
		}else throw new Exception("No puedes retirar mas de lo que tienes");
	}
	
	
}
