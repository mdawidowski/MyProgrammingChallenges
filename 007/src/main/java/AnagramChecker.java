import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Anagram Checker! Please insert phrase");
        String input1 = scanner.nextLine();
        System.out.println("Please insert second phrase:");
        String input2 = scanner.nextLine();

        if (isAnagram(input1, input2) == true){
            System.out.println("Great! Second phrase is anagram!");
        } else {
            System.out.println("Ooops! This phrase is not anagram!");
        }
    }

    public static boolean isAnagram(String input1, String input2){
        char text1[] = input1.toCharArray();
        char text2[] = input2.toCharArray();

        if (text1.length != text2.length){
            return false;
        } else {
            Arrays.sort(text1);
            Arrays.sort(text2);
            for (int i = 0; i < text1.length; i++) {
                if (text1[i] != text2[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
