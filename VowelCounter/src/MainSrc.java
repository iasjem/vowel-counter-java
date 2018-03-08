/*
 * 	Counts the number of vowels in a sentence
 * */

import java.util.Scanner;
public class MainSrc {

	private static Scanner input = new Scanner(System.in);
	private static VowelCounter vowelCounter;
	
	public static void main(String[] args) {
		System.out.println("Vowel Counter Java version by IasJem\n");
		myVowelCounter(); // count the vowels of the sentence 
		input.close();
	}
	
	private static void myVowelCounter() {
		System.out.print("Enter a sentence: ");
		String str = input.nextLine();
		vowelCounter = new VowelCounter(str);
		System.out.println( 
				vowelCounter.getVowelCount(vowelCounter.getSentence())
				+ " vowels found in the sentence \"" + str + "\"."
				);
	}

}
