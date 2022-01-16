package innerClass;

public class Inner_class {
private int data=30;  
	
	void display(){
		System.out.println("i am inside the outer class method");
	}
	 
	class Inner{  		
	 //private int data=20;
	  
	  void msg()
	  {
		 
		  System.out.println("data is "+data);
	  }  
	  
	  // calling the duplicate method of the outer class
	  void display(){
		  System.out.println("i am inside the inner class method");
	  }
	}
	
	  class Inner1{
		  void msg()
		  {
			 Inner_class.this.display();
			  System.out.println("data is "+data);
		  }  
		  void display(){
			  System.out.println("i am inside the inner class method");
		  }
		  
	  }
	   
	public static void main(String[] args) 
	{
		
		  Inner_class obj=new Inner_class ();     // creating object of Outer class
		  
		  Inner_class.Inner in=obj.new Inner();
		  Inner_class.Inner1 in1=obj.new Inner1();
		  in.msg();   
		  in.display(); 
		  in1.msg();
		  in1.display();
	
	}

}



