package threads;

public class ThreadsJava extends Thread {
	
	public void run() {
		for(int i=1;i<4;i++) {
			
		
			 try{
		    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
		    	}
		    catch(InterruptedException e)
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

	

	public static void main(String[] args) {
	
		ThreadsJava m1=new ThreadsJava();  
		ThreadsJava m2=new ThreadsJava();  
		ThreadsJava m3=new ThreadsJava();
		  
		  m1.setName("IT");
		  m2.setName("HR");
		  m3.setName("FINANCE");
		 
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY);  
		  m3.setPriority(Thread.NORM_PRIORITY); 
		  
		  m2.setDaemon(true); 
		  
		  m1.start();  
		  m2.start();  
		  m3.start();
		   
	}

}
