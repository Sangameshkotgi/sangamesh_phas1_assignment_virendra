package threads;
class Table{
	synchronized public void getTable()  
{
		
		for (int i = 0; i < 4; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
			try
			{
				Thread.sleep(2000);   //0.4 secs
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			  System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
			    
				System.out.println("running thread name is:"+Thread.currentThread().getName());  // name of the thread
			   System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  // it will print state of the thread running
			   System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
			   System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
			  }  
}
}
	class MyThread extends Thread{
		
		Table table;
		MyThread (Table table)
		{
			this.table=table;
		}
	public void run()
	{
		table.getTable();
	}
	}

	public class Synchronized{
		
	

	public static void main(String[] args) {
		Table obj= new Table();

			MyThread n1= new MyThread(obj);
			MyThread n2= new MyThread(obj);
			MyThread n3= new MyThread(obj);
			
				n1.setName("IT");
				n2.setName("HR");
				n3.setName("FINANCE");
				
				  n1.setPriority(Thread.MAX_PRIORITY);  
				  n2.setPriority(Thread.NORM_PRIORITY);  
				  n3.setPriority(Thread.MIN_PRIORITY);
				
				  
				n1.start();
				n2.start();
				n3.start();
	}
	}





