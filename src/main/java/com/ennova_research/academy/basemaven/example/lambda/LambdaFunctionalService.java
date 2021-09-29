package com.ennova_research.academy.basemaven.example.lambda;
/**
 * @author Alberto Ielpo
 * E' definita come functional interface per evidenziare
 * il fatto che avrà solo un metodo astratto 
 * e potrà essere implementata on demand con le lambda expression 
 *
 */
@FunctionalInterface
public interface LambdaFunctionalService {
	public boolean doStuff();
}
