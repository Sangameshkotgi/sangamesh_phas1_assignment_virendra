package program.java.acessmodifiers.child;

public class x {

private int t= 90;   //private variable
	
	long h = 9000;       // default variable
	
	protected float f= 52.56f;
	
	public char c='d';
	
	public void methodPublic(){     // public method
		methodPrivate();
	}
	
	protected void methodProtected(){   // protected method
		methodPrivate();
	}
	
	void methodDefault(){    //default method
		methodPrivate();
	}
	
	private void methodPrivate(){     // private method
		System.out.println("Class x");
		System.out.println("Value of private value t"+ t);
		System.out.println("Value of long"+ h);
		System.out.println("value of float"+ f);
		System.out.println("value of public value c"+ c);		
}
}
