//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._1_intro_to_random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int number = 0;
		
			
		
		Random ran = new Random();
		number=ran.nextInt(222-88); 
		//5. Now limit the value of num to be between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		System.out.println(number);
		//6. Challenge: Limit the value of num to be between -222 and 88

		//1. Print out the value of num
		
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}
