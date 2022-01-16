package inheritance;

public class Main {
	int id=78;
	String name="amul"; 
	
     void display()
		{
			  System.out.println("id: " +id+ " " +"Name: "  +name);
			  
	    }  
	}  


	class A extends Main
	{  
		int count =50;
		String category="butter";
	
		void display()
		{
			System.out.println("id: "  +id+" " + "Name: "   +name+ "Count: "   +count+   "Category"   +category);
		}  
	}  
		

	class B extends Main
	{
	int count=90;
	String category="milk";  
		void display()
		{
			System.out.println("id: "  +id+" " + "Name: "  +name+  "Count: "   +count+  "Category"  +  category);
		}  
	}
		class C extends Main{
		int count=36;
		String category="choco";  
			void display()
			{
				System.out.println("id: "  +id+  " "  +  "Name: "   +name+ "Count: " +count+  "Category"   +category);
			} 
		}
			class subA extends A {
				int price=30;
				int totalprice=count*price;
				void display()
				{
					System.out.println("id: "+id+" "+"Name: "  +name+ "Count: "  +count+ "Category" +category+ "Price"   +price+  "Totalprice"  +totalprice);
				} 
			}
				class subB extends B {
					int price=10;
					int totalprice=count*price;
					void display()
					{
						System.out.println("id: "+id+" "+"Name: "+name+"Count: "   +count+  "Category"  +category+  "Price"  +price+  "Totalprice" +totalprice);
					} 
				
			public class Main{
				
			
	      public static void main(String[] args) {
	    	  
		subA A=new subA();
		subB B=new subB();
		C c=new C();
		B.display();
		A.display();
		c.display();
		
	}
				}
				}
				



