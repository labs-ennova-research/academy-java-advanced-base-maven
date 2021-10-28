package com.ennova_research.academy.basemaven.together;
/**
 * @author Alberto Ielpo
 */
public class Rettangolo extends QuadratoAbs implements Quadrilatero {

	private float latoa;
	private float latob;
	
	public Rettangolo() {
		
	}
	
	public Rettangolo(float a, float b) {
		this.latoa = a;
		this.latob = b;
	}

	@Override
	public float perimetro() {
		return (this.latoa*2) + (this.latob*2);
	}

	@Override
	public float area() {
		return this.latoa * this.latob;
	}

}
