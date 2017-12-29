package com.practice;

public class StaticMethodOverridingTest {
	public static void main(String[] args) {
		Parent ref ;
		ref = new Child();
		ref.staticMethod();
		ref.method();
		
		System.out.println("this is arg values");
		for(int i=0;  i < args.length; i++)
			System.out.println(i + "=> "+args[i]);
	}
}


class Parent {
	public static void staticMethod(){
		System.out.println("static method() from Parent");
	}
	public void method(){
		System.out.println("method() from Parent");
	}
}
class Child extends Parent {
	public static void staticMethod(){
		staticMethod();
		System.out.println("static method() from Child");
	}
	public void method(){
		super.staticMethod();
		System.out.println("method() from Child");
	}
}