package ds.Stack;

public class Stack {
	
	private int maxSize;
	
	private long[] stackArray;
	
	private int top; // return the last value in the stack
	
	
	public Stack(int size){
		// maxSize is going to be the size that will be pass to this
	
			this.maxSize = size;
			this.stackArray = new long[maxSize];
			this.top = -1;
	
		
	}
	
	public void push(long value) {
		// this method takes a value which is going to be added to the stack
		// and the top will be incremented
		if(isFull())  {
			System.out.println("This stack is full");
			
		}else {
		top++;
		stackArray[top] = value;
		}	
		
	}
	public long pop() {
		//This method will remove the element that is at the top of the array
		//Then will set a new top value;
		if(isEmpty())  {
			System.out.println("This stack is full");
			return -1;
		}else {
		int old_top = top;
		top -- ;
		return stackArray[old_top];
		}
	}
	
	public long peak() {
		//This method will return the value at the top in the array
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		//This method will return true if the stack is empty
		return (top == -1);
		
	}
	
	public boolean isFull() {
		//This method will return true if the maximum size -1 is equal to top
		//have to remember top represent the index position of items 
		return (maxSize -1 == top);
	}

}
