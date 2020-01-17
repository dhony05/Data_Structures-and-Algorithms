package GenericStack;


/***
 * 
 * @author donelysfamilia
 *
 * @param <T>
 */
public class Stack<T> {
	
	int size;
	
	StackElement<T> top;
	
	
	public Stack() {
		size = 0;
		top = null;
	}
	
	public void push(T newValue) {
		StackElement<T> newElement = new StackElement<T>(newValue, top);
		top = newElement;
		size ++;
	}
	
	public T pop() {
		
		StackElement<T> oldTop = top;
		if(oldTop == null || size == 0) {
			return null;
		}
		top = top.getNext();
		size --;
		return oldTop.getValue();
		
		
	}
	public T peek(){
		if(size == 0) {
			return null;
		}
		return top.getValue();
	}
	
	
//	public void empty() {
//		size = 0;
//	}
	public boolean isEmpty() {
		return (top == null);
	}
	
	
	
	

}
