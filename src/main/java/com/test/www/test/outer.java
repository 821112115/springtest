package com.test.www.test;

public class outer {
    public int num=10;
    public outer() {
		Inner inner = new Inner();
	}
    class Inner{
    	public Inner() {
    		int num =30;
    		System.out.println(num);
    		System.out.println(this.num);
		}
    	public int num =20;
  
    }
    public static void main(String[] args) {
    	new outer();
	}
}
