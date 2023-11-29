package com.training.org;

class ThreadExamples extends Thread {
	private int sleepTime;

	// PrintThread constructor assigns name to thread
	// by calling superclass Thread constructor
	public ThreadExamples(String name) {
		super(name);
		// sleep between 0 and 5 seconds
		sleepTime = (int) (Math.random() * 5000);
		// display name and sleepTime
		System.err.println("Name: " + getName() + ";  sleep: " + sleepTime);
	}

	// control thread's execution
	public void run() {
		System.err.println(getName() + " going to sleep");
		// put thread to sleep
		// Thread.sleep( sleepTime );

		// print thread name
		System.err.println(getName() + " done sleeping");
	}

}

public class SingleThreadExample {
	public static void main(String[] args) {
		ThreadExamples th1 = new ThreadExamples("Thread1");
		ThreadExamples th2 = new ThreadExamples("Thread2");
		ThreadExamples th3 = new ThreadExamples("Thread3");
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);
		th3.setPriority(Thread.MAX_PRIORITY);
		//
		System.out.println("Starting Threads....");
		th1.start();
		th2.start();
		th3.start();

	}
}