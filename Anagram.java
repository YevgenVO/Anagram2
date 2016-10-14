package com.gmail.yevgen.v.o;

import java.util.Scanner;

public class Anagram {
    private static Scanner scanner = new Scanner(System.in);
    private static final char SPACE = ' ';
    private static String line;

    public static void main(String[] args) {
        read();
        System.out.println(line);
        scanner.close();
    }

    private static void read(){
        int j;
        int k = -2;
        line = scanner.nextLine();
        int length = line.length();
        for(int i = 0; length>i;i++){
            if(line.charAt(i)==SPACE&&i>0){
                j=k+2;
                k=i-1;
                addAnagram(j,k);
                line = line + " ";
            }
            if(i==length-1){
                j=k+2;
                k=length-1;
                addAnagram(j,k);
            }
        }
        line=line.substring(length);
    }

    private static void addAnagram(int j, int k){
        for(int i = 0;i<k-j+1;i++){
            line = line + line.charAt(k-i);
        }
    }
}