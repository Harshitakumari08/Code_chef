/*
You are given the following as a user input:

First line contains the integer 
N
N.
The second line contains 
N
N space separated integers.
The third line contains an integer 
X
X.
You need to insert 
X
X as the 1st and last element and output the list.
Your list will now have 
N
+
2
N+2 elements.
Check the sample output for more details.

Sample 1:
Input
Output
5
1 3 5 7 9
4
4 1 3 5 7 9 4
  */
import java.util.Scanner;

class InsertElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int X = scanner.nextInt();
        int[] result = new int[N + 2];
        result[0] = X;
        for (int i = 0; i < N; i++) {
            result[i + 1] = arr[i];
        }
        result[N + 1] = X;
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }
        
        scanner.close();
    }
}
