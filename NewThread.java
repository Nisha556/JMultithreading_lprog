package Thread;

public class NewThread implements Runnable {
	Thread t;
	NewThread()
	{
		t= new Thread(this,"Demo Thread");
		System.out.println("Child Thread");
		t.start();
		
	}
	public void run()
	{
		try {
			for(int i = 5; i>0;i--)
			{
				System.out.println("Child Thread");
				Thread.sleep(500);
				
			}
		}
				catch(InterruptedException e)
				{
					System.out.println("interrupted");
					
				}
				System.out.println("Exiting child thread");
				
			}
		}
	class ThreadDemo {
		public static void main(String args[])
		{
			new NewThread();
			try {
				for(int i = 5;i>0;i--)
				{
					System.out.println("Main Thread" +i);
					Thread.sleep(1000);
					
				}
			}
			catch(InterruptedException e)
			
			{
				System.out.println("Main Thread");
				
			}
			System.out.println("Main Thread");
				
			}
		
	}
	


