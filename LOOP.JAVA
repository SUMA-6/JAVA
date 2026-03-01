LOOPS:

For given two sides of a triangle a and b and the angle C between them, calculate the following properties:

S: Area of the triangle
L: The length of the circumference of the triangle
h: The height of the triangle with side a as a bottom edge
Input
The length of a, the length of b and the angle C are given in integers.

Output
Print S, L and h in a line respectively. The output should not contain an absolute error greater than 10-4.

Inputcopy	Outputcopy
4 3 90
                6.00000000
                12.00000000
                3.00000000

PROGRAM:

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double C=sc.nextDouble();
        double rad=Math.toRadians(C);
        double S=0.5*a*b*Math.sin(rad);
        double c=Math.sqrt(a*a+b*b-2*a*b*Math.cos(rad));
        double L=a+b+c;
        double h=(2*S)/a;
        double[] result={S,L,h};
        for(int i=0;i<3;i++){
            System.out.printf("%.8f\n",result[i]);
        }
    }
}