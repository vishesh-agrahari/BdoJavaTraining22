package JavaDay2;

 
class SimpleThread implements Runnable {
		public void run()
		{
			String importantInfo[] = {"Mares eat oats","Does eat oats","Little lambs eat ivy","A kid will eat ivy too"};
			try {
				for (int i = 0; i < importantInfo.length; i++)
				{//Pause for 4 seconds
					Thread.sleep(4000);
					//Print a message
					System.out.println(importantInfo[i]);
					}
				} 
				catch (InterruptedException e) 
			{
					System.out.println("Exception is caught");
			}
			}
}
public class SimpleThreads{
	public static void main(String [] args) throws InterruptedException{  
		Thread t1 = new Thread(new SimpleThread());   // Using the constructor Thread(Runnable r)  
		t1.start(); 
	}
	}
