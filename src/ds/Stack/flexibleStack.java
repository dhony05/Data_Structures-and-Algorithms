package ds.Stack;

import java.util.ArrayList;
import java.util.List;

public class flexibleStack<E> {


	private List<E> stackList = new ArrayList<E>();

	private int top = -1;

	private E e;

	public E getE() {	return this.e;}

	public void setE(E newE) {  this.e = newE; }

	public void push(E e) {
		// this method takes a value which is going to be added to the stack
		// and the top will be incremented
//		if(isFull())  {
//			System.out.println("This stack is full");
//
//	
			top++;
			stackList.add(e);
			
		}	

		
	public E pop() {
	//This method will remove the element that is at the top of the array
	//Then will set a new top value;
	if(isEmpty())  {
		System.out.println("This stack is full");
		return e ;
		//return  E - ;
	}else {
		int old_top = top;
		top -- ;
		return stackList.remove(old_top);
	}
	}
	public E peak() {
		//This method will return the value at the top in the array
		return stackList.get(top);
	}
	
	public boolean isEmpty() {
		//This method will return true if the stack is empty
		return (top == -1);
		
	}
}





