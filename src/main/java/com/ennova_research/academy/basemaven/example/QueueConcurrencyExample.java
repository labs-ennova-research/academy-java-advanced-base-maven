package com.ennova_research.academy.basemaven.example;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * @author Alberto Ielpo
 */
public class QueueConcurrencyExample {
	public static void main(String[] args)  throws Exception {
		//Queue<String> queue = new PriorityQueue<String>();	//this is not synchronized / Exception in thread "Thread-1" java.lang.NullPointerException: Cannot read field "value" because "anotherString" is null
		//Queue<String> queue = new ArrayBlockingQueue<String>(3);	//this is synchronized with fix capacity
		Queue<String> queue = new ConcurrentLinkedQueue<String>();
		
		queue.add("ciao");
		queue.add("come");
		queue.add("va");
		
		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(1000);				
				System.out.println(String.format("Thread 1 %s - Queue size %s", queue.poll(), queue.size()));
				queue.add("ele from thread 1");
			} catch (InterruptedException e) { }
		});
		
		Thread t2 = new Thread(() -> {
			try {
				Thread.sleep(1000);
				System.out.println(String.format("Thread 2 %s - Queue size %s", queue.poll(), queue.size()));
			} catch (InterruptedException e) { }
		});
		
		Thread t3 =  new Thread(() -> {
			System.out.println(String.format("Thread 3 %s - Queue size %s", queue.poll(), queue.size()));	
		});

		
		t1.start();
		//t1.join();		//Waits for this thread to die. 
		t2.start();
		//t2.join();
		t3.start();
		
			
	}
}
