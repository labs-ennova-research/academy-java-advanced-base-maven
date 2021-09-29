package com.ennova_research.academy.basemaven.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Alberto Ielpo
 */
public class LambdaExample {
	public static void main(String[] args) {
		
		List<Integer> testNumber = new ArrayList<Integer>(Arrays.asList(5,6,7,1,2,8,9,3,4));
		List<String> testData = new ArrayList<String>(Arrays.asList("ciao", "pippo"));
		/* for each */
		testData.forEach(ele -> {
			System.out.println(ele);	
		});
		
//		testData.forEach(ele -> System.out.println(ele));
//		testData.forEach(System.out::println);
		
		/* for each with map */
		Map<Integer, String> testMap = new HashMap<Integer,String>();
		testMap.put(1, "val1");
		testMap.put(2, "val2");
		testMap.put(3, "val3");
		testMap.forEach((k,v) -> {
			System.out.println(String.format("The key is %s the value is %s", k, v));
		});
		
		/* stream */
		System.out.println(testData.stream().filter(x -> x.equals("ciao")).collect(Collectors.toList()));
		
		/** sort ... */
		System.out.println("Test data " + testNumber);
		testNumber.sort((a,b) -> a-b);
		System.out.println("Test data sorted " + testNumber);
		
		/** find min and max */
		Optional<Integer> min = testNumber.stream().min((a,b) -> a-b);
		System.out.println(String.format("min number is %s", min.get()));
		
		Optional<Integer> max = testNumber.stream().max((a,b) -> a-b);
		System.out.println(String.format("min number is %s", max.get()));
		
		/* remove null from array */
		List<String> abc = new ArrayList<String>(Arrays.asList("ciao","come", null, "stai"));
		List<String> bcd = abc.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println(abc +">>>"+bcd);
		
		
		/* anonymous implementation */
		LambdaFunctionalService ld = () -> {
			System.out.println("this is an anonymous implementation");
			return true;
		};
		
		ld.doStuff();
	}
}
