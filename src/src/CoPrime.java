package src;

import java.util.ArrayList;
import java.util.Arrays;

public class CoPrime {
	
	public static boolean checkCoPrime(int num1, int num2)
	{ 
		//Find minimum number
		int min = 0;
		if (num1 < num2)
			min = num1;
		else
			min = num2;
		
		for (int count=2; count <= min; count++)
		{
			if (((num1%count)==0)&&((num2%count)==0)) //Common factors
				return false;
	    }
		return true;
	}
	
	public static int coprime(int[] numArray) {
		int numCoPrime = 0;
		for (int count1 = 0; count1 < numArray.length; count1++) {
			for (int count2 = (count1 + 1); count2 < numArray.length; count2++) {
				if (checkCoPrime(numArray[count1], numArray[count2]))
				{
					numCoPrime++;
				}	
			}
		}
		return numCoPrime;
	}

	public static void main(String[] args) {
		int[] array_1 = { 1, 2, 3 };
		int numCoPrime = coprime(array_1);

		System.out.println(numCoPrime);
	}

}
