/* TASK 
Given the list of numbers, you are to sort them in non decreasing order.

Input
t – the number of numbers in list, then t lines follow [t <= 10^6].
Each line contains one integer: N [0 <= N <= 10^6]

Output
Output given numbers in non decreasing order.

Sample 1:
Input
5
5
3
6
7
1

Output:;
1
3
5
6
7            */

// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
import java.util.Arrays;
class chef{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }
}



