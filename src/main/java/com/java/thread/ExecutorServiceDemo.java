package com.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		ExecutorService service =Executors.newCachedThreadPool();
	}
	
	public void testThreadMethod() {
		System.out.println("print");
	}
}
