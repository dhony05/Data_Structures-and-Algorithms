package ds.Stack;


public class App {

	public static void main(String[] args) throws InterruptedException {
		//Stack stack = new Stack(2);

		//		stack.push(50);
		//		stack.push(13);
		//		flexibleStack<String> hello = new flexibleStack<>();	
		//		while(!stack.isEmpty()) {
		//			String value = stack.pop();
		//			System.out.println(value);
		//			Thread.sleep(2000);
		//	
		System.out.println(reverseString("About"));
	}


	//}
	/***
	 * 
	 * @param str
	 * @return reversedString
	 * @throws InterruptedException
	 * 
	 *  This method will receive a string , every char will pushed it to the stack 
	 *  and will pop using the LIFO principle , we use the info to concatenate it and create a 
	 *  whole new String to be returned.
	 */
	public static String reverseString(String str) throws InterruptedException{
		//	int stackSize = str.length(); // get the max size
		Stack newStack = new Stack(str.length()); // create an stack set the reference to a new stack object with specific size
		for (int i = 0; i < str.length(); i++) { // iterate through the input string
			char inChar = str.charAt(i); // this will get the char from index
			newStack.push(inChar); // pushing to the stack	 

		}
		String reversedString = ""; // we create a empty string 
		while(!newStack.isEmpty()) { // iterate if is not empty
			char newChar = newStack.pop(); // create a char variable to hold the poping 
			reversedString += newChar; // we are concatenating the char to create the return string
			//Thread.sleep(2000);

		}
		return reversedString;// return the string
	}



}
