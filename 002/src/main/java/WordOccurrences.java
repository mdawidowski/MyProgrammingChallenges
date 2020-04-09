import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.util.Scanner;

public class WordOccurrences {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program for counting word occurrences in text. Please insert word:");
        String word = scanner.next();
        String text;
        int status = 0;
        while ((text = bufferedReader.readLine())!=null && status!=1){
            if(text.contains(word)){
                System.out.println("Bingo! This text contains word \"" + word + "\"");
                status += 1;
            }
        }
        if (status == 0){
            System.out.println("Word \"" + word + "\" wasn't found in text");
        }

    }
}
