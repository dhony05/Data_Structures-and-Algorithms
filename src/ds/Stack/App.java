package ds.Stack;

public class App {
	
	public static void main(String[] args) throws InterruptedException {
		Stack stack = new Stack(2);
		
		stack.push(50);
		stack.push(13);
		stack.push(24);
		
		flexibleStack<String> hello = new flexibleStack<>();
		
	
	
		
		
		while(!stack.isEmpty()) {
			long value = stack.pop();
			System.out.println(value);
			Thread.sleep(2000);
			
		}
//		while(!flexibleStack.isEmpty()) {
//			String str = (String) flexibleStack.pop();
//			System.out.println(str);
//			Thread.sleep(2000);
//			
//		}
		
		
	}
	public static String reverseString(String str){
		return str;
	}
	
	

}
