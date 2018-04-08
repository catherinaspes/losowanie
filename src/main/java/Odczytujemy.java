import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

        Random random = new Random();
        Integer randomIndex = random.nextInt(listOfSentences.sizeOfList());

        int length = listOfSentences.getSentence(randomIndex).replace(" ", "").length();

        System.out.println(listOfSentences.getSentence(randomIndex)+"; to zdanie zawiera taką liczbę znaków: "+length);

        //liczanie liczby słów


        System.out.println("A z tylu słów się składa: "+listOfSentences.numberOfWords(listOfSentences.getSentence(randomIndex)));


    }




}
