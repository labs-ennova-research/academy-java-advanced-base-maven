package com.ennova_research.academy.basemaven.exercise;
/**
 * @author Alberto Ielpo
 */
public class ExerciseOne {
	
//	[]#########
//	@][########
//	@@][#######
//	@@@[]######
//	@@@@][#####
//	@@@@@][####
//	@@@@@@[]###
//	@@@@@@@][##
//	@@@@@@@@][#
//	@@@@@@@@@[]
	
	public static void main(String[] args) {

		String a = "#";
		String b = "@";
		String c = "[]";
		String d = "][";
		StringBuffer buff = new StringBuffer();
		
		for(int ii=0; ii<10; ii++) {
			for(int jj=0; jj<10; jj++) {
				if(ii<jj) {
					buff.append(a);
				} else if(jj<ii) {
					buff.append(b);
				} else {
					if(ii%3 == 0) {
						buff.append(c);
					} else {
						buff.append(d);
					}
				}
			}
			buff.append("\n");
		}
		System.out.println(buff.toString());
		
	}
}
