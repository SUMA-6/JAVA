CONDITIONAL:

Given two integers a and b, compute a power b.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First and only line of input contains two positive integers a and b.

Constraints

1 <= a <= 100
0 <= b <= 9

Output Format

Print a power b.

Inputcopy	Outputcopy
2 3                8
Explanation 0

PROGRAM:

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=1;
        for(int i=0;i<b;i++){
            result=result*a;
        }
        System.out.println(result);
    }
}

