package com.ennova_research.academy.basemaven.together;

public abstract class QuadratoMilanese extends Quadrato implements Quadrilatero {

	public abstract float getPerimetroAndArea();
	
	public float getAreaAndPerimetro() {
		return 0;
	}
}
