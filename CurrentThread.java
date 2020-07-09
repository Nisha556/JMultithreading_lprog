package Thread;

public class CurrentThread {
public static void main(String args[]) {
	Thread t = Thread.currentThread();
	System.out.println("Current thread"+t);
	t.setName("My Thread");
	System.out.println("After change the name"+t);
	Thread t2 = Thread.currentThread();
	System.out.println(t2);
	
	}
}

/*Current threadThread[main,5,main]
After change the nameThread[My Thread,5,main]
Thread[My Thread,5,main]*/