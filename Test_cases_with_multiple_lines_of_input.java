/*
Task
Let's write a program in the IDE which performs the following:

The 1st line of input is an integer - T - the count of test cases.
Each test case consists of 2 lines of input.
The 1st line of input has 2 space separated integers - accept them as variables a and b .
The 2nd line of input has 3 space separated integers - accept them as variables c, d and e.
For each test case - output all integers on a single line.
Sample 1:
Input
Output
3
1 2
3 4 5
11 22
33 44 55
1 23
456 789 101112
1 2 3 4 5
11 22 33 44 55
1 23 456 789 101112
  */
// Update the '_' below to solve the problem
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        // accept the count of test cases given in the 1st line
        int t = read.nextInt();
        
        // Run a loop to accept 't' inputs
        for(int i=0; i<t; i++)
        {
            // accept 5 integers in each test case
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int d = read.nextInt();
            int e = read.nextInt();
            // output the 5 integers on a single line for each test case
            System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        }
	}
}
