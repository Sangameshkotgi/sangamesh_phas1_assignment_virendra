package methodOverload;

public class methodoverload1 {
	
	public void add(int a,int b)
    {
         System.out.println("add two number : "+(a+b));
    }
    
	public void area(int r) 
    {
         System.out.println("area of Circle : "+(3.14*r*r));
    }
	
	public void area(int l, int b)
	{
		System.out.println("area of rectangle"+(l*b));
	}

	public static void main(String[] args) {
		methodoverload1 ob1 = new methodoverload1();
		ob1.add(5,10);
		ob1.area(5);
		ob1.area(5,6);
		
		
	}

}
