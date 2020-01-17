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
		
		
	}
}
