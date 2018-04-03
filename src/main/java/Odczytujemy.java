import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Odczytujemy {


    public static void main(String[] args) throws IOException {

        ListOfSentences listOfSentences = new ListOfSentences();

        String filePath = "D:\\Dokumenty_Kasia\\zdaniaDoLosowania.txt";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String sentence = line;
                listOfSentences.addSentence(line);
            }
        } catch (Exception e) {
            System.err.println("Jakis blad");
            e.printStackTrace();
        }

        System.out.println(listOfSentences.toString());

    }
}
