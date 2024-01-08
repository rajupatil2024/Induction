package com.threads;

class Mythread extends Thread
{
	@Override
	public void run() {
		System.out.println("Thread1 is Running");
	}
}
class Mythread1 implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread2 is Running");
	}
}
public class Test1 {

	public static void main(String[] args)  {
		System.out.println(Thread.currentThread());
		Mythread t1=new Mythread();
		
		t1.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		Mythread1 t2=new Mythread1();
		
		Thread th=new Thread(t2);
		t1.setPriority(6);
		th.setPriority(3);
		
		t1.start();
		th.start();
		
//		t1.join();
		
//		th.stop();
		t1.setName("Mytread");
		th.setName("Mythread1");
		System.out.println(t1.getName());
		System.out.println(th.getName());

	}

}
