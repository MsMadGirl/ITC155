import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args) {

		//establishes the arraylist
		ArrayList<String> listicle = new ArrayList<String>();
		
		//populates the arraylist
		listicle.add("pear");
		listicle.add("apple");
		listicle.add("cherry");
		listicle.add("mango");
		listicle.add("pomegranate");
		
		//if I comment out the listicle.add lines, it returns 0.0
		
		avgVowels(listicle);
		
	}//main
	
	public static void avgVowels(ArrayList<String> listicle) {
		
		//sets the count
		double vowelCount = 0;
		
		//calculates number of vowels
		
		//iterates through the words in the list
		for (int i = 0; i < listicle.size(); i++) {
			
			String s = listicle.get(i);
			
			//iterates through the letters in the word
			//I don't actually have any idea what the convention is for naming ii
			for (int ii = 0; ii < listicle.get(i).length(); ii++) {
			
				switch(s.charAt(ii)) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						vowelCount++;
						break;
					// do nothing
					default:

				}//switch
			
			}//2nd for
			
		}//1st for

		double vAvg = 0;
		
		//calculates the average number of vowels per word in the listarray
		if (listicle.size() == 0) {
			vAvg = 0.0;
		}//end if
		else {
			vAvg = vowelCount / listicle.size();
		}//end else
		
		System.out.println(listicle);
		//prints the number of words in the array
		System.out.println("The total number of words in the array is " + listicle.size());
		//prints the number of vowels in the array
		System.out.println("The total number of vowels in the array is " + vowelCount);
		//prints the average
		System.out.println("The average number of vowels per word is " + vAvg);
		
	}//avgVowels
	


}//class
