/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Cancellation implements Runnable {
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" : "+i);
			try {
            // thread to sleep for 1000 milliseconds
            Thread.sleep(1000);
         } catch (Exception e) {
            System.out.println(e);
         }
		}
	}
}

class Reservation implements Runnable {
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" : "+i);
			try {
            // thread to sleep for 1000 milliseconds
            Thread.sleep(1000);
         } catch (Exception e) {
            System.out.println(e);
         }
		}
	}
}
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Cancellation obj=new Cancellation();
		Thread t=new Thread(obj,"Cancellation");
		Reservation obj1=new Reservation();
		Thread t1=new Thread(obj1,"Reservation");
		
		t.start();
		t1.start();
	}
}
