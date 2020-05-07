import java.io.*;
import java.util.Random;

public class Functionalities {

    public static String getPhrase() throws IOException {
        File file = new File("phrases.txt");
        RandomAccessFile input = new RandomAccessFile(file, "r");
        int fileLength = (int)file.length();
        Random random = new Random();
        int randomNumber = random.nextInt(fileLength);
        if (randomNumber > 294){
            randomNumber = 294;
        }
        input.seek(randomNumber);
        input.readLine();
        return input.readLine();
    }

    public static String hidePhrase(String phrase){
        for (int i = 0; i < phrase.length(); i++) {
            phrase = phrase.replaceAll("[A-z]","-");
        }
        return phrase;
    }

    public static String changeHiddenPhrase(String phrase, String hiddenPhrase, Character character){
        for (int i = 0; i < phrase.length(); i++) {
            if (character == phrase.charAt(i) || Character.toUpperCase(character) == phrase.charAt(i) || Character.toLowerCase(character) == phrase.charAt(i)){
                hiddenPhrase = hiddenPhrase.substring(0,i) + phrase.charAt(i) + hiddenPhrase.substring(i+1);
            }
        }
        return hiddenPhrase;
    }

    public static boolean checkIfPhraseContainsCharacter(String phrase, Character character){
        for (int i = 0; i < phrase.length(); i++) {
            if (character == phrase.charAt(i) || Character.toUpperCase(character) == phrase.charAt(i) || Character.toLowerCase(character) == phrase.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void drawHangman(int number){
        switch (number){
            case 1:
                System.out.println("------------");
                break;
            case 2:
                System.out.println(
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "------------"
                );
                break;
            case 3:
                System.out.println(
                        "       ______ \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "------------");
                break;
            case 4:
                System.out.println(
                        "       ______ \n" +
                        "      |      |\n" +
                        "      |      |\n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "------------");
                break;
            case 5:
                System.out.println(
                        "       ______ \n" +
                        "      |      |\n" +
                        "      |      |\n" +
                        "      |      O\n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "------------");
                break;
            case 6:
                System.out.println(
                        "       ______ \n" +
                        "      |      |\n" +
                        "      |      |\n" +
                        "      |      O\n" +
                        "      |      |\n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "------------");
                break;
            case 7:
                System.out.println(
                        "       ______ \n" +
                        "      |      |\n" +
                        "      |      |\n" +
                        "      |      O\n" +
                        "      |     /|\\ \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "------------");
                break;
            case 8:
                System.out.println(
                        "       ______ \n" +
                        "      |      |\n" +
                        "      |      |\n" +
                        "      |      O\n" +
                        "      |     /|\\ \n" +
                        "      |     / \\ \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "      |     \n" +
                        "------------");
                break;


        }
    }
}

