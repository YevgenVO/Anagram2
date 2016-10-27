//package com.gmail.yevgen.v.o;

import java.util.Scanner;

public class Anagram {
    private static Scanner scanner = new Scanner(System.in);
    private static final char SPACE = ' ';
    private static String line;

    public static void main(String[] args) {
        readWords();
        System.out.println(line);
        scanner.close();
    }

    private static void readWords() {
        int firstLetter;
        int lastLetter = -2;
        line = scanner.nextLine();
        int length = line.length();
        for (int i = 0; length > i; i++) {
            if (line.charAt(i) == SPACE && i > 0) {
                firstLetter = lastLetter + 2;
                lastLetter = i - 1;
                addAnagram(firstLetter, lastLetter);
                line = line + " ";
            }
            if (i == length - 1) {
                firstLetter = lastLetter + 2;
                lastLetter = length - 1;
                addAnagram(firstLetter, lastLetter);
            }
        }
        line = line.substring(length);
    }

    private static void addAnagram(int firstLetter, int lastLetter) {
        for (int i = 0; i < lastLetter - firstLetter + 1; i++) {
            line = line + line.charAt(lastLetter - i);
        }
    }
}