Print unique elements of the array in the same order as they appear in the input.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format
First line of input contains a single integer N - the size of array and second line contains array elements.

Constraints
1 <= N <= 100
0 <= ar[i] <= 109

Output Format
Print unique elements of the array.

INPUT
7
5 4 10 9 21 4 10
OUTPUT
5 9 21

PROGRAMS:
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}