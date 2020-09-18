package GenericStack;

public class App {

	
	public static void main(String[] args) {
		
		Stack<String> myStr = new Stack<String>();
		
		myStr.push("hello");
		myStr.push("roo");
		System.out.println(myStr.peek());
		System.out.println(myStr.pop());
		System.out.println(myStr.pop());
		System.out.println(myStr.isEmpty());
		
		
		Stack<Integer> myInt = new Stack<Integer>();
		
		myInt.push(2);
		myInt.push(4);
		System.out.println(myInt.isEmpty());
	}
}
