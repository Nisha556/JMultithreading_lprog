package Thread;
import java.util.*;


public class ThreadA extends Thread {

	public synchronized void run()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(n%2==0)
		{ System.out.println("Thread is  even " );
		
		}
		else
			System.out.println("Sorry not" );
		System.out.println( );
	}
	
	
}

class ThreadB extends Thread 
{
	public  synchronized void run()
	{
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			
		}
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc1.nextInt();
		
		if(n%2 !=0)
		{
		System.out.println("Thread is odd" );
		}
		else
		{
			System.out.println( "Sorry not");
			System.out.println( );
		}
		}
}
class Multi
{
	public static void main(String args[])
			{
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.start();
		b.start();
			}
}
