package ADT;

public class App {

	
	public static void main(String[] args) {
		
		Counter counter = new Counter("Bill");
		for (int i = 0; i < "bill".length(); i++) {
			counter.increment();
		}
		
		System.out.println(counter.getCurrentValue());
		System.out.println(counter);
	}
}
