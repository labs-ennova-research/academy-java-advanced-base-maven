package com.ennova_research.academy.basemaven.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alberto Ielpo
 */
public class ExerciseRecursive {

	public static Integer reduce(List<Integer> data) {
		if(data == null || data.size() == 0) {
			return null;
		} else if(data.size() == 1) {
			return data.get(0);
		} else {
			Integer cur = data.remove(data.size() - 1);
			cur = cur == null ? 0 : cur;
			Integer prev = data.get(data.size()-1);
			prev = prev == null ? 0 : prev;
			data.set(data.size()-1, cur + prev);
			return reduce(data);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer res = reduce(data);
		System.out.println(res);
	}
	
}
