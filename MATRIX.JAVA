Given a matrix of size N x M, print column-wise sum, separated by a newline.

Input Format
The first line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.

Constraints
1 <= N, M <= 100
-106 <= ar[i] <= 106

Output Format
Print column-wise sum of the matrix, separated by newline.

Inputcopy	
2 2
5 -1
19 8
Outputcopy
24
7

PROGRAM

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][] arr= ew int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<M;j++){
            int sum=0;
            for(int i=0;i<N;i++){
                sum+=arr[i][j];
            }
            System.out.println(sum);
        }
    }
}