/*Chef was given an integer input N- he needs to find the number of digits in the given integer.
Let's assume the number of digits in N is x. Whenever we divide a number by 10 and store it in an integer, the right-most digit of that number gets removed. Since 1 digit gets removed each time we divide a number by 
10, thus the total number digits we can remove from a number are the total number of digits in the number.
Thus, we can divide N by 10, x times before it becomes 0, after which the division will not affect the number and it will remain 0(as 0 divided by anything is still 0). So, If we keep dividing the integer 
N by 10 in a loop, till it reaches 0, the loop will execute x times. Now, we can just count how many times the loop was executed, by starting a count from 0 and increasing the count each time the loop executes.
Here, we can get the number of digits in N in count.
  */
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        int num, count = 0;
        num = scanner.nextInt();

        while (num != 0) {
            count = count + 1;
            num = num / 10;
        }
        System.out.println(count);
	}
}
