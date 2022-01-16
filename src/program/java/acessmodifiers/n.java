package program.java.acessmodifiers;

public class n {
	
	protected long h=432;
	
	public int x=20;
	
	double pi=5.6744;
	
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
		System.out.println("Class n: methodProtected");
		System.out.println("Value of public valye x"+ x);
		System.out.println("Value of long"+ h);
		System.out.println("value of double"+ pi);
		
	}

}
