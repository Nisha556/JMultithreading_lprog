package Thread;

public class NewThread2 extends Thread{
	NewThread2()
	{
		
	
super("Demo Thread");
System.out.println("Child thread " +this);
start();


}
	public void un()
	{
		try {
			for(int i=5;i>0;i--)
			{
				System.out.println("Child thread" +i);
				Thread.sleep(500);
				
			}
		}
		
			catch(InterruptedException e)
		{
				System.out.println("Child Thread");
				
		}
		System.out.println("Exiting child Thread");
		
		}
	}
class ExtendThread
{
	public static void main(String args[])
	{
		new NewThread();
		try {
			for(int i = 5; i>0;i--)
			{
				System.out.println("Main thread" +i);
				Thread.sleep(1000);
				
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread");
			
		}
		System.out.println("Main thread Exiting");
	}
}
