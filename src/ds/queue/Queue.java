package ds.queue;

public class Queue {

	private int maxSize;  // initializes the set number of slots
	private long[] queArray; // slots to main the data
	private int front; // this will be index position for the element at top
	private int back; // this going to be the index for the element at the back of the line
	private int nItems; // counter to maintain the number of iterms 



	/***
	 * This constructor will initialize all the variables
	 * @param size
	 */
	public Queue(int size)
	{
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0; // index position of the first slot of the array.
		back = - 1; // there is not item in the array yet to be considered as the last item.
		nItems = 0; // since is the begining, we dont have any element in the array.

	}
	/***
	 * This method will insert the data to the en of the queue 
	 * @param j
	 */
	public void insert(long j) 
	{
		if(back == maxSize -1) { // if rear is equal to the index position at the end of the array  bring it back to the begining
			back = -1;  // this will overwrite or replace if insert more than the maximum size (called Circular Quee)
		}
		back ++; //  increment back
		queArray[back] = j; // here we are going to put the data in back position
		nItems ++ ; // is the number of items and will be incremented.

	}
	public long remove() // this method will remove items from the front of queue
	{ 	 
		long temp = queArray[front]; // stractring any variable at the front " index" position"
		front ++;  // increment front because it has to point tp next thing in line
		if(front == maxSize) {
			front = 0; // its set front back to the 0th index so that we can utilize the entire array again
		}
		nItems -- ;  // the number of items will decrese because we remove one
		return temp;
	}
	
	public long peekFront() // this method will peek in front of the line to see who is in the begining

	{ 
		return queArray[front]; // front is a pointer  , not changing 
	}
	
	
	public boolean isEmpty() // this method will return a boolean whether is empty or not 
	{ 
		return (nItems == 0);
	}
	
	public boolean isFull() // this method will return a boolean whether is full or not 
	{
		return (nItems == maxSize);
		
	}
	
	public void view() 
	{
		//when this method is called it present a view of what is inside the queue
		System.out.print("[");
		for (int i = 0; i < queArray.length; i++) 
		{
			System.out.print(queArray[i] + " ");
		}
		System.out.print( "]");
		
	}
	
	

}
