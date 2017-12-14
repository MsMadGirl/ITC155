import java.util.*;

public class Partition {

	public static void main(String[] args) {
		
		partition();
		
	}//end main
	
	public static void partition() {
		
		Scanner console = new Scanner(System.in);
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		LinkedList<Integer> partitioned = new LinkedList<Integer>();
		
		System.out.print("What number would you like to divide the list at? ");
		int divide = console.nextInt();
		
		System.out.print("Please enter eight numbers: ");
		numbers.add(console.nextInt());
		numbers.add(console.nextInt());
		numbers.add(console.nextInt());
		numbers.add(console.nextInt());
		numbers.add(console.nextInt());
		numbers.add(console.nextInt());
		numbers.add(console.nextInt());
		numbers.add(console.nextInt());
		
		System.out.println("Linked list: " + numbers);
		System.out.println("The partition number is: " + divide);
		
		Iterator<Integer> i = numbers.iterator();
		
		while (i.hasNext()) {
			
			int element = i.next();
			
			if (element < divide) {
				
				i.remove();
				partitioned.addFirst(element);
				
			}//end if
			
			else {
				
				i.remove();
				partitioned.addLast(element);
				
			}
			
		}//end while
		
		console.close();
		
		System.out.println("The partitioned list is: " + partitioned);
		
	}//end partition
	
}//end class
