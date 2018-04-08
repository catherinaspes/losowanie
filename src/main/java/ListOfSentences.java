import java.util.ArrayList;
import java.util.List;

public class ListOfSentences {

    private List<String> list = new ArrayList<>();

    public void addSentence(String sentence){
        list.add(sentence);
    }

    public String getSentence(Integer index){
        return list.get(index);
    }

    public int sizeOfList(){
       return list.size();
    }

    public int numberOfWords(String sentence) {
        int words = 1;
        char space = ' ';
        char nextChar;
        for (int i = 0; i <= sentence.length()-1; i++) {
            nextChar = sentence.charAt(i);
            if (nextChar == space) {
                words++;
            }
        }
        return words;
    }

    @Override
    public String toString() {
        return "ListOfSentences{" +
                "list=" + list +
                '}';
    }
}
