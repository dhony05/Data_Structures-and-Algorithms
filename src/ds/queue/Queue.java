package ds.queue;

public class Queue {

	private int maxSize;  // initializes the set number of slots
	private long[] queArray; // slots to main the data
	private int front; // this will be index position for the element at top
	private int rear; // this going to be the index for the element at the back of the line
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
		rear = - 1; // there is not item in the array yet to be considered as the last item.
		nItems = 0; // since is the begining, we dont have any element in the array.

	}
	/***
	 * This method will insert the data to the en of the queue 
	 * @param j
	 */
	public void insert(long j) 
	{
		rear ++; //  increment rear
		queArray[rear] = j; // here we are going to put the data in rear position
		nItems ++ ; // is the number of items and will be incremented.

	}
	
	public void view() 
	{
		System.out.print("[");
		for (int i = 0; i < queArray.length; i++) 
		{
			System.out.print(queArray[i] + "");
		}
		System.out.print( "]");
	}
	
	

}
