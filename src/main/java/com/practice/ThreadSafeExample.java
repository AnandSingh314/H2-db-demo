package com.practice;

public class ThreadSafeExample {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		System.out.print('X');
		t.sleep(5*1000);
		System.out.print('Y');
	}

}
