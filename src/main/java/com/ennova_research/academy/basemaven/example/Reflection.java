package com.ennova_research.academy.basemaven.example;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alberto Ielpo
 */
public class Reflection {
	
    private static void printDeclaredMethod(String classFullName) {
        try {
            Class<?> c = Class.forName(classFullName);
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++) {
          	  System.out.println(m[i].toString());
            }
         }
         catch (Throwable e) {
            System.err.println(e);
         }
    }
    
    @SuppressWarnings("unchecked")
	private static <T> T instantiateDynamically(String classFullName) {
    	try {
    		Class<?> c = Class.forName(classFullName);
    		Constructor<?> ct = c.getConstructor();
    		return (T) ct.newInstance();
    	} catch (Exception e) {
    		System.out.println(e);
    		return null;
    	}
    }
    
    private static void declareAnArrayDynamicallyAndSetAStringInPositionFive() {
        try {
        	Class<?> cls = Class.forName("java.lang.String");
            Object arr = Array.newInstance(cls, 10);
            Array.set(arr, 5, "this is a test");
            String s = (String)Array.get(arr, 5);
            System.out.println(s);
        } catch (Exception e) {
        	System.out.println(e);
        }
    	
    }
    
    private static void assignTheSameValueAtTheSameFieldOfDifferentObject() {
		List<Object> objectList = new ArrayList<Object>();
		Arrays.asList(
			"com.ennova_research.academy.basemaven.example.obj.DummyClass", 
			"com.ennova_research.academy.basemaven.example.obj.DummyClassBis").forEach(className -> {
				Object obj = instantiateDynamically(className);
				try {
					Field fld = obj.getClass().getField("pippo");
					fld.set(obj, "my-value");					
				} catch (Exception e) {
					e.printStackTrace();
				} 
				
				objectList.add(obj);
		});
		
		System.out.println(objectList);
    }
    
	public static void main(String args[]) throws Exception {

		printDeclaredMethod("com.ennova_research.academy.basemaven.example.obj.DummyClass");

		declareAnArrayDynamicallyAndSetAStringInPositionFive();
		
		assignTheSameValueAtTheSameFieldOfDifferentObject();
		

    }
}
