import java.io.IOException;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws IOException {
        String phrase = Functionalities.getPhrase();
        String hiddenPhrase = Functionalities.hidePhrase(phrase);
        boolean status = false;
        Scanner scanner = new Scanner(System.in);
        // if status == true or user have more than 8 attempts
        int attempts = 0;
        while (status == false && attempts < 8){
            System.out.println(hiddenPhrase);
            System.out.println("Please insert a character:");
            char character = scanner.next().charAt(0);

            if (hiddenPhrase.indexOf(character) >= 0 || hiddenPhrase.indexOf(Character.toUpperCase(character)) >= 0 || hiddenPhrase.indexOf(Character.toLowerCase(character)) >= 0){
                System.out.println("You have already typed this character!");
                attempts += 1;
                Functionalities.drawHangman(attempts);
            } else {
                if (Functionalities.checkIfPhraseContainsCharacter(phrase, character)) {
                    hiddenPhrase = Functionalities.changeHiddenPhrase(phrase, hiddenPhrase, character);
                } else {
                    attempts += 1;
                    Functionalities.drawHangman(attempts);
                }
            }

            if (hiddenPhrase.equals(phrase)){
                status = true;
                System.out.println("Congratulations! The answer is \""  + phrase + "\"");
            }

            if (attempts == 8){
                System.out.println("Ooops, you've lost! The answer is \""  + phrase + "\"");
            }
            System.out.println(attempts);
        }
    }
}
