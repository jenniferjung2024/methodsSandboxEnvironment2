# methodsSandboxEnvironment2
Sandbox environment for methods.....Homework set #11 for CSE 118 (Fundamentals of Programming)

CSE118

Homework Set 11

Create a project. Define the following method in this project, then test each method in main() method.

1.	Define a method to process a string which has multiple words. With this process: (1) all characters which are not letters or digital characters or whitespace characters will be removed; (2) any two adjacent words will be separated by only one whitespace character; (3) the first letter in each word is capitalized. (4) all letters except for the first letter in each word are in lowercase. 

(Sample: the string to be processed is: “CSE*1_1&8      cse??148”. After processing, the new string will be “Cse118 Cse148”) 

		String stringFilter (String str);

2.	Define a method to list/display all those numbers which are divisible by 3 and 7 but not both in certain range. The method signature is shown below. Parameters low and upp specify the range in which all numbers will be checked. Parameter numPerLine indicates how many such numbers will be displayed per line.

		int listNumbers(int low, int upp, int numPerLine);

3.	Define a method to find the letter in a string which has the highest occurrence, return this letter (-ignore the case when finding such letter). For example, the letter with the highest occurrence in the string “Computer Science, CSE118, CST141” is ‘C’

		char occurrence (String str);

4.	Define a method to generate multiple random numbers in the range [-100, 100]. Count how many numbers are positive, and how many numbers are negative. Calculate the ratio between positive and negative numbers. Return this ratio from the method. Below is the method signature. Parameter “num” specifies how many random numbers will be generated.

		double ratioBetweenPosAndNeg (int number);	

5.	Define a method to calculate the sum of all digits in a positive integer num. If the sum value is greater than or equal to 10, continue to find the sum of digits in the sum value. Repeat this process until the sum is less than 10. Return the final sum value.

(For example, if the number is 56783, the sum is 29; since 29 is greater than 10, continue to find the sum of digits in 29; the new sum is 11; 11 is still greater than or equal to 10; continue process, and the final sum is 2, return 2 from the method)

		int sumOfDigits (int num);

------

![image](https://github.com/jenniferjung2024/methodsSandboxEnvironment2/assets/164530692/50945069-f588-4b81-9839-f34e2da3837e)

