import java.util.*;

public class Palindrome {
	
	 //establish the variable
	static boolean isit;
	
	public static void main(String[] args) {
		
		//int[] data = {16, 24, 35, 68, 35, 24, 16};
		int[] data = {234, 36, 245, 76};
		//int[] data = {12, 24, 48, 72};
		
		isPalindrome(data);
		
	}//end main
	
	public static void isPalindrome(int[] data) {
		
		//build queue
		Queue<Integer> que = new LinkedList<Integer>();
		
		for (Integer ntgr : data) {
			que.add(ntgr);
		}
		
		//build stack
		Stack<Integer> stk = new Stack<Integer>();
		
		for (Integer ntgr : data) {
			stk.push(ntgr);
		}
		
		//print queue and stack
		System.out.println("Queue = " + que);
		System.out.println("Stack = " + stk);
		
		//Check for nulls
	    if (stk == null || que == null)
	    		System.out.println("-1");
	    
	    while (!stk.isEmpty()) {
	        //Step through each item in both stacks, if any don't match print -1
	    		int numstk = stk.pop();
	    		int numque = que.remove();
	           if(numstk == numque)
	        	   	isit = true;
	           else
	        	   	isit = false;
	           	break;
	    }
	    
	    //final response
	    if(isit == false)
	    		System.out.println("-1");
	    else
	    		System.out.println("The list is a palindrome.");
		
	}//end isPalindrome

}//end class
