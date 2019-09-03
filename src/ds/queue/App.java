package ds.queue;

public class App 
{
public static void main(String[] args)
{
	Queue theQueue = new Queue(12);
	theQueue.insert(3);
	theQueue.insert(12);
	theQueue.insert(35);
	theQueue.insert(323);
	theQueue.insert(397);
	theQueue.view();
}
	
}
