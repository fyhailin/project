package com.java;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	doTestGC();
    }
    
    
    public static void doYongGC() {
    	
    	Integer m = new Integer(1024*1024*1);
    	byte[] b = new byte[1*m];
    	b=null;
    	System.gc();
    	System.out.println();
    	b=new byte[1*m];
    	b=new byte[1*m];
    	System.gc();
    	System.out.println();
    	
    }
    
    public static void doTestGC() {
    	Object obj = new Object();
    	System.gc();
        System.out.println("print");
        obj = new Object();
        obj = new Object();
        System.gc();
        System.out.println("print");
    	
    }
}
