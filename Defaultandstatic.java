package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,i;
        n = in.nextInt();
        String [] l = new String[n+1];
        for(i=0;i<n+1;i++)
            l[i]=in.nextLine();
        for(String num : l)
            System.out.println(num);
    }
}
