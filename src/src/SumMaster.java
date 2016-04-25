package src;

import java.util.ArrayList;
import java.util.Arrays;

public class SumMaster {

	public static int[] sum_master(int[] numArray)
	{
            ArrayList<Integer> numArray2 = new ArrayList<Integer>(); 
		    for (int count1=0; count1 < numArray.length; count1++)
		    {
		        for (int count2=(count1+1); count2 < numArray.length; count2++)
		        {
		            int mySum = numArray[count1]+numArray[count2];
		            for (int count3=0; count3 < numArray.length; count3++)
		            {

		                if (numArray[count3] == mySum)
		                {
		                    if (!numArray2.contains(mySum))
		                        numArray2.add(mySum);
		                }
		            }
		        }
		    }
		    
		    int[] resultArray = new int[numArray2.size()];
		    for (int count = 0; count < numArray2.size(); count++)
		    {
		    	resultArray[count] = numArray2.get(count);
		    }
		    return resultArray;
	}
	
	public static void main(String[] args) {
		int[] array_1 = {1,2,3};
	    int[] array1 = sum_master(array_1);
		
		Arrays.sort(array1);
	    for (int count=0; count < array1.length ; count++)
	    {
	        if (count < (array1.length-1))
	            System.out.print(array1[count] + ",");
	        else
	        	System.out.println(array1[count]);
	    }
	}

}
