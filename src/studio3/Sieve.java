package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) 
	
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("?Tu Quires que numero a usar? ");
		int userNum = in.nextInt();
	
		int[] numArray = new int[userNum];
		int[] primeArray;
		
		for (int i = 0; i < numArray.length; i++) 
		{
			numArray[i] = i+1;
			System.out.println(numArray[i]);
			
		}
		
		
		for (int i = 3; i < numArray.length; i++)
		{
			
			
			
		}
		
		in.close();
		
		/*
		 * 
		 * 
	algorithm Sieve of Eratosthenes is
    input: an integer n > 1.
    output: all prime numbers from 2 through n.

    let A be an array of Boolean values, indexed by integers 2 to n,
    initially all set to true.
    
    for i = 2, 3, 4, ..., not exceeding √n do
        if A[i] is true
            for j = i2, i2+i, i2+2i, i2+3i, ..., not exceeding n do
                set A[j] := false

    return all i such that A[i] is true.
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	
		
		
	}

}
