package program.java.acessmodifiers.child;

import program.java.acessmodifiers.m;
import program.java.acessmodifiers.n;


public class y extends n {
	
	public static void main(String[] args) {
		System.out.println("variable of m class");
		System.out.println("\n");
		new m().methodPublic();
		
		System.out.println("\n");
		System.out.println("variable of n class");
		System.out.println("\n");
		new n().methodPublic();
		
		System.out.println("\n");
		System.out.println("variable of x class");
		System.out.println("variable of h "+new x().h);
		System.out.println("variable of f "+new x().f);
		System.out.println("variable of c "+new x().c);
			
		
	}

}
