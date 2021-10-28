package com.ennova_research.academy.basemaven.together;

/**
 * @author Alberto Ielpo
 */
public class Quadrato extends QuadratoAbs implements Quadrilatero {

	private float lato;

	public Quadrato() {

	}

	public Quadrato(float lato) {
		this.lato = lato;
	}

	public float getLato() {
		return lato;
	}

	public void setLato(float lato) {
		this.lato = lato;
	}

	@Override
	public float perimetro() {
		return this.lato * 4;
	}

	@Override
	public float area() {
		return this.lato * this.lato;
	}

	@Override
	public String toString() {
		return String.valueOf(this.lato);
	}

	@Override
	public boolean equals(Object obj) {
		return (this.lato == ((Quadrato) obj).lato);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
