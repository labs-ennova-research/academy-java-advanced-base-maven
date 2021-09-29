package com.ennova_research.academy.basemaven.exercise;

/**
 * @author Alberto Ielpo 
 */
public class ExerciseTwo {
	/**
	 * Example
	 * <pre>
	 * Return true :  [], ([]), {[]({})} , {[()]}, (()), {{(())}}
	 * Return false: [{], ([)], "", null
	 * </pre>
	 * @param s
	 * @return true is valid input
	 */
    public static boolean isValid(String s){
        if(s == null || s.length() == 0) {
        	return false;
        }
        s = s.replaceAll(" ", "");
    	
    	int l = s.length() + 1;
        while (l > s.length()){
            l = s.length();            
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s.length() == 0;
    }
    
    /**
     * 
     * @param args
     */
	public static void main(String[] args) {
		String[] good = new String[] {"[]", "([])", "{[]({})}" , "{[()]}", "(())", "{{(())}}"};
		String[] bad = new String[] {"[{]", "([)]", "", null};
		for(String g : good) {
			System.out.println(ExerciseTwo.isValid(g));
		}
		
		for(String b : bad) {
			System.out.println(ExerciseTwo.isValid(b));
		}
		
	}
	
}
