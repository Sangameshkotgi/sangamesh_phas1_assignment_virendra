package program.java.acessmodifiers;

import program.java.acessmodifiers.m;
import program.java.acessmodifiers.n;

public class p {

	public static void main(String args[]) {
		
		new m().methodPublic();
		new m().methodProtected();
		new m().methodDefault(); 	
		new n().methodPublic();
		new n().methodProtected();
		new n().methodDefault(); 
		System.out.println("Value of long"+ new m().k);	
		System.out.println("Value of long"+ new n().h);		
	}

	public void methodPublic() {
		System.out.println("Class p: methodPublic");
	}

	protected void methodProtected() {
		System.out.println("Class p: methodProtected");
		
	}

	void methodDefault() {
		System.out.println("Class p: methodDefault");
	}

	private void methodPrivate() {
		System.out.println("Class p: methodPrivate");
	}


}
