
public class Homework11 {

	public static void main(String[] args) {

		System.out.println("Testing Question 1:");
		System.out.println(stringFilter("tCSE*1_1&8      cse??148")); // did not declare a variable for efficiency (save memory)
		System.out.println();

		System.out.println("Testing Question 2:\n");
		listNumbers(5, 58, 5);
		
		System.out.println("\n\nTesting Question 3:");
		System.out.println(occurrence("xComputer Science, CSE118, CST141X"));  // did not declare a variable for efficiency (save memory)

		System.out.println("\nTesting Question 4:");	
		System.out.println(ratioBetweenPosAndNeg(19)); // same as above
		
		System.out.println("\nTesting Question 5:");	
		System.out.println(sumOfDigits(56783));  // same as above

	}
	
	
	
	public static String stringFilter(String str) {  // Question 1
		
		// Step 1: Create a new String that has all characters which are not letters or digital characters or whitespace characters removed
		
		String newString = "";
		
		for (int index = 0; index < str.length(); ++ index) {
			if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z' || str.charAt(index) >= 'a' && str.charAt(index) <= 'z' || str.charAt(index) >= '0' && str.charAt(index) <= '9' || Character.isWhitespace(str.charAt(index))) {
				newString += str.charAt(index);
			}
		}
		
		
		// Step 2: Create a new String in which two adjacent words will be separated by only one whitespace character
		
		String newString2 = "";

		for (int index = 0; index < newString.length(); ++ index) {
			if (!(Character.isWhitespace(newString.charAt(index)) && Character.isWhitespace(newString.charAt(index + 1)))) {
				newString2 += newString.charAt(index);
			}
		}
		
		
		// Steps 3 and 4: Combine both requirements in one process
		// Create a String where the first letter in each word is capitalized
		// Create a String where all letters except for the first letter in each word are in lowercase  
		
		String newString3 = "";		
		
		int firstUpCharIndex = 0;
		
		// First word
		for (int index = 0; index < newString2.length(); ++ index) {

			if (!Character.isLowerCase(newString2.charAt(index))) {  // perhaps first character is a whitespace character or a digit -- instructions never said to trim whitespace characters from front/end
				newString3 += newString2.charAt(index);
			}
			else {
				newString3 += Character.toUpperCase(newString2.charAt(index));
				firstUpCharIndex = index;
				break;
			}
		}
		
		
		if (firstUpCharIndex != newString2.indexOf(newString2.length() - 1)) {  // aka if there is more characters after that upper-case letter
			
			boolean hasWhitespace = false;
			
			for (int index = firstUpCharIndex + 1; index < newString2.length(); ++ index) {
				
				int whiteSpaceIndex = firstUpCharIndex + 1;
				
				hasWhitespace = Character.isWhitespace(newString2.charAt(index));
				whiteSpaceIndex = index;
				
				if (hasWhitespace) {
					
					for (int index2 = firstUpCharIndex + 1; index2 < whiteSpaceIndex; ++ index2) {
						newString3 += Character.toLowerCase(newString2.charAt(index2));
					}			
					
					for (int index2 = whiteSpaceIndex; index2 < newString2.length(); ++ index2) {
						if (!Character.isLowerCase(newString2.charAt(index2))) {  // aka append whitespace character or a digit to the String
							newString3 += newString2.charAt(index2);
						}
						else {
							newString3 += Character.toUpperCase(newString2.charAt(index2));
							firstUpCharIndex = index2;
							break;
						}
					}
					
					hasWhitespace = false; // reset to keep going in loop
				}
			
			}
			
			// Finish up the remainder of the String, since no whitespace characters left
			for (int index = firstUpCharIndex + 1; index < newString2.length(); ++ index) {
				newString3 += Character.toLowerCase(newString2.charAt(index));		
			}		
		}
				
		// Return processed string
		
		return newString3; // Perhaps use StringBuilder to save memory / be more efficient??
	}
	
	
	
	public static void listNumbers(int low, int upp, int numPerLine) {  // Question 2
	
		int count = 0;
		
		for (int index = low; index <= upp; ++ index) {
			if (index % 3 == 0 ^ index % 7 == 0) {
				count++;
				if (count % numPerLine == 0) {
					System.out.println(index);
				}
				else {
					System.out.print(index + "\t");
				}
			}
		}
			
		
	}
	
	
	
	public static char occurrence(String str) {  // Question 3
		
		// Set a reference modeChar and
		char modeChar = str.charAt(0);
		int count = 1;
		
		// Find out count of reference modeChar for comparison
		for (int index = 1; index < str.length(); ++index) {
			if (str.charAt(index) == (Character.toUpperCase(str.charAt(0))) || str.charAt(index) == Character.toLowerCase((str.charAt(0))) )
					count ++;
		}
		
		// Create a variable to store comparison count
		int frequency = 0;
		
		
		// Loop to check for which character is modeChar based on frequency of character
		
		for (int index = 1; index < str.length(); ++index) {
		
			int referenceChar = index;  // comparison character
			
			for (index = 1; index < str.length(); ++index) {
						
				if (str.charAt(index) == (Character.toUpperCase(str.charAt(referenceChar))) || str.charAt(index) == Character.toLowerCase((str.charAt(referenceChar))) ) {
					frequency ++;
					}
			}
			
			if (frequency > count) {
				modeChar = str.charAt(referenceChar);
				count = frequency; // create new point of reference for maximum number of occurrences
			}

			frequency = 0; // set frequency back to 0 before looping next index
		}
		
		
		return modeChar;
		
	}
	
	
	
	
	public static double ratioBetweenPosAndNeg(int number) {  // Question 4
		
		int posCount = 0;
		int negCount = 0;
		
		for (int index = 0; index < number; ++index) {
			int randNum = (int)(Math.random() * 201 - 100);
			
			if (randNum >= 0)
				posCount += 1;
			else
				negCount += 1;
		}
		
		return posCount/(double)negCount;  // did not declare a variable to save memory (efficiency)
	}
	
	
	
	public static int sumOfDigits(int num) {  // Question 5
		
		int sum = 0;
		
        // Calculate the sum of digits
        while (num > 0) {
            sum += num % 10;
            num = num / 10;  // OR "num /= 10;"
        } 
		
        // If the sum is greater than or equal to 10, continue
        while (sum >= 10) {
        	
            int newSum = 0;
            
            while (sum > 0) {
                newSum += sum % 10;
                sum = sum / 10;  // OR "sum /= 10;"
            }
            
            sum = newSum;
            
        	}

        return sum;
        
		}

}
