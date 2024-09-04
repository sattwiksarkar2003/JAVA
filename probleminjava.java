// CRED Coins
// For each bill you pay using CRED, you earn 
// X
// X CRED coins.
// At CodeChef store, each bag is worth 
// 100
// 100 CRED coins.

// Chef pays 
// Y
// Y number of bills using CRED. Find the maximum number of bags he can get from the CodeChef store.

// Input Format
// First line will contain 
// T
// T, number of test cases. Then the test cases follow.
// Each test case contains of a single line of input, two integers 
// X
// X and 
// Y
// Y.
// Output Format
// For each test case, output in a single line - the maximum number of bags Chef can get from the CodeChef store.

// Constraints
// 1≤T≤100
// 1≤T≤100
// 1≤X,Y≤1000
// 1≤X,Y≤1000

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		int x,y;
		
		for(int i=1;i<=t;i++){
		    x=sc.nextInt();
		    y=sc.nextInt();
		    
		    
		    int m=x*y;
		    System.out.println(m/100);
		}
	}
}
