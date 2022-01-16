package Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		 Stack stack1 = new Stack();
		 stack1.push("apple");
		 stack1.push("banana");
		 stack1.push("chickoo");
		 stack1.push("corn");
		 stack1.push("strawberry");
		 stack1.push("pune");
		 stack1.push("bangalore");
		 stack1.push("gulbarga");
		 stack1.push("delhi"); 
		 stack1.push(1);
		 stack1.push(2);
		 stack1.push('m');
		 stack1.push('f');
		 System.out.println(stack1); 
		 stack1.pop();
		 stack1.pop();
		 stack1.pop();
		 stack1.pop();
		 stack1.pop();
		 stack1.pop();
		
		 System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
		 stack1.pop();
		 stack1.pop();
		 System.out.println("index of element inside the stack"+stack1.indexOf("bangalore"));
		 System.out.println("index of element inside the stack"+stack1.indexOf("pune"));	 		 
		 System.out.println(stack1); 
	}

}
