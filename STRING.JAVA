Given a string, print all the letters present at odd index, followed by the letters present at even index.

Input Format
Input contains a string S, consisting of ascii characters.

Constraints
1 <= len(S) <= 100

Output Format
Print letters present at odd index, followed by the letters present at even index.

Inputcopy	
afdg5tg

Outputcopy
fgtad5g

PROGRAM

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=1;i<s.length();i+=2){
            System.out.print(s.charAt(i));
        }
        for(int i=0;i<s.length();i+= 2){
            System.out.print(s.charAt(i));
        }
    }
}