import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Palindrome Checker! Please insert word:");
        String word = scanner.next();
        int status = 0;
        for (int i = 0; i <= (word.length()-1)/2; i++) {
            if (word.charAt(i)!= word.charAt(word.length()-1-i)){
                status = 1;
            }
        }
        if (status == 0){
            System.out.println("Great! This word is palindrome!");
        } else {
            System.out.println("Ooops! This word isn't palindrome!");
        }
    }
}
