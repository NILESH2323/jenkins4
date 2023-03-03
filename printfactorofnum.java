package java_basic;

import java.util.Scanner;
public class printfactorofnum {

public static void main(String[] args) {
    // Write your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i=2;
    while(n>i)
    {
        if(n%i==0)
        {

          System.out.println(i+" ");
        }
        i++;
    }
}
}
