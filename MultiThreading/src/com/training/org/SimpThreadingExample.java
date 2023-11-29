package com.training.org;

class ThreadExample extends Thread {
	public void run() {
		System.out.println("Run method is called from ThreadExample class, Id is:  " + currentThread().getId());
		System.out.println("Get the thread name: " + currentThread().getName());
	}
}

public class SimpThreadingExample {
	public static void main(String[] args) {
		ThreadExample th = new ThreadExample();
		th.start();
	}
}
