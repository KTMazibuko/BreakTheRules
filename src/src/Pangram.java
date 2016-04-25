package src;

import java.util.HashMap;
import java.util.Scanner;

public class Pangram {

	public static boolean panagram_check(String pangramStr)
	{
		pangramStr = pangramStr.toLowerCase(); //Convert all characters to Lowercase
		HashMap<Character, Integer> letterMap = new HashMap<Character, Integer>();
		//For each letter in the sentence record the presence of the letter in a Hashmap by increasing the value
		//associated with the letter by one
		for (int count = 0; count < pangramStr.length(); count++)
		{
			if (letterMap.get(pangramStr.charAt(count)) == null)
			  letterMap.put(pangramStr.charAt(count), 1);
		    else
			  letterMap.put(pangramStr.charAt(count), letterMap.get(pangramStr.charAt(count))+1);
		}
		
		//Loop through Ascii numbers for Lowercase letters
		for (int count = 97; count <= 122; count++)
		{
			//Any Letter of the alphabet not represented
			if ((letterMap.get((char)count)== null)||(letterMap.get((char)count) == 0 ))
				return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner theScanner = new Scanner(System.in);
		System.out.print("Enter the Sentence: ");
		String panagramStr = theScanner.nextLine();
		boolean answer = panagram_check(panagramStr);
		theScanner.close();
		System.out.print("Answer is: ");
		if (answer)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
