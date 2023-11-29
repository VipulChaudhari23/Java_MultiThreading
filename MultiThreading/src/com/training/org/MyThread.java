package com.training.org;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}

	public void run() {
		System.out.println("r1 " + currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			// do something
		}
		System.out.println("r2 " + currentThread().getName());
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread("Thread1");
		MyThread t2 = new MyThread("Thread2");
		t1.start();
		try {
			t1.join(); // Wating for t1 to finish
		} catch (InterruptedException ie) {
		}
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}
