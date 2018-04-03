import java.util.ArrayList;
import java.util.List;

public class ListOfSentences {

    private List<String> list = new ArrayList<>();

    public void addSentence(String sentence){
        list.add(sentence);
    }

    public void getSentence(Integer index){
        list.get(index);
    }

    @Override
    public String toString() {
        return "ListOfSentences{" +
                "list=" + list +
                '}';
    }
}
