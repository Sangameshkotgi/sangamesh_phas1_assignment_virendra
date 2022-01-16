package program.java.acessmodifiers;

public class m {

	private int y= 10;   //private variable
	
	long k = 1000;       // default variable
	
	protected float f= 2.56f;
	
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
		System.out.println("Class m: methodProtected");
		System.out.println("Value of private valye y"+ y);
		System.out.println("Value of long"+ k);
		System.out.println("value of float"+ f);
		
	}

}
