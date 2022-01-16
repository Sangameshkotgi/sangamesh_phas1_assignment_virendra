package constructors;

public class constructors1 {
		int a;
		float b;
		double z;
		
	    //creating four arg constructor  
		constructors1(int x, int y){  
	    a=x*y;    
	    }     
	    
	   constructors1(float x, float y){  
	    b= x*y;
	    }  
	    
	    //creating three arg constructor  
	   constructors1(double x){  
	     z=3.142f*x*x;
	    } 
	    
	  void area()
	    {
		  System.out.println("area of square"+a);
		  System.out.println("area of rectangle"+b);
		  System.out.println("area of circle"+z);
	    	
	    }  
	 
public static void main(String[] args) {
	
	constructors1 s1= new constructors1(5,7);
	constructors1 s2= new constructors1(3.142f,4.8f);
	constructors1 s3= new constructors1(6f);
	s1.area();
	s2.area();
	s3.area();

}
}
