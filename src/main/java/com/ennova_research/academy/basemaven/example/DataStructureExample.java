package com.ennova_research.academy.basemaven.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 * @author Alberto Ielpo
 */
public class DataStructureExample {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Collection<String> a = new ArrayList<String>();
		a.add("ciao"); // [ciao]
		System.out.println(a);
		a.remove("ciao");
		System.out.println(a); // []

		List<String> b = new ArrayList<String>();
		b.add("ciao");
		b.add("ciao");
		b.add("pippo");
		System.out.println(b); // [ciao, ciao, pippo]
		System.out.println(b.indexOf("pippo")); // 2

		Set<String> c = new HashSet<String>();
		c.add("ciao");
		c.add("ciao");
		c.add("pippo");
		System.out.println(c); // [ciao, pippo]

		/** FIFO **/
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Ele1");
		queue.add("Ele2");
		queue.add("Ele3");
		System.out.println(queue.remove()); // Get the first element removing it
		System.out.println(queue);
		System.out.println(queue.peek()); // Get the first element without removing
		System.out.println(queue);

		/** LIFO */
		Stack<String> stack = new Stack<String>();
		stack.push("ciao");
		stack.push("pippo");
		System.out.println(stack.pop()); // "pippo"
		
		/** MAP **/
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "ciao");
		map.put(2, "come");
		map.put(3, "stai");
		
		System.out.println(map.get(2));	//come

	}
}
