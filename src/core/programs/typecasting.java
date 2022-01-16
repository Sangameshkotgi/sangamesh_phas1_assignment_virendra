package core.programs;

public class typecasting {

	public static void main(String[] args) {
		int i =100;
		long l= i;
		System.out.println("long value "+ l);
		
		int o=(int) l;
		System.out.println("int value "+ o);
		
		char t=(char) i;
		System.out.println("char value "+ t);
		
		double d= 1976565457879.0777665645685;
		float r= (float) d;
		System.out.println("float value "+ r);
		System.out.println("double value "+ d);
		
		double d2= 1976565457879.0777665645685;
		long l2 = (long) d2;
		int i2 = (int) l2;
		System.out.println("double value "+ d2);
		System.out.println("long value "+ l2);
		System.out.println("int value "+ i2);
		
		float f=1;
		System.out.println("float value "+ f);
		
		byte b;
		int ii = 257;
		double dd= 323.452;
		System.out.println(" conversion of int into byte" );
		b= (byte) ii;
		System.out.println("ii ="+ ii + "b = " + b);
		System.out.println("conversion of doublr to byte");
		 
		b= (byte) dd;
		System.out.println("dd = " + dd +  "b=" + b);
		
		
		
		
	}

}
