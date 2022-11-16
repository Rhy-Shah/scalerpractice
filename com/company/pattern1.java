package com.company;

import java.util.Scanner;

public class pattern1 {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int n=z;
        if(z%2==1){
            z = z/2  + 1;
        }
        else{
            z = z/2;
        }
        for(int i=0; i<z; i++){
            for(int j=0; j<n; j++){
                if(j>=i && j<n-i){
                    System.out.print(n-i+" ");
                }
                else if(j<i){
                    System.out.print(n-j+" ");
                }
                else{
                    System.out.print(j+1+" ");
                }
            }
            System.out.println();
        }
        if(n%2==1){
            z-=1;
        }
        for(int i=z-1; i>=0; i--){
            for(int j=0; j<n; j++){
                if(j>=i && j<n-i){
                    System.out.print(n-i + " ");
                }
                else if(j<i){
                    System.out.print(n-j + " ");
                }
                else{
                    System.out.print(j+1 + " ");
                }
            }
            System.out.println();
        }
    }
}
