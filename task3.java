import java.util.ArrayList;
public class WordCheck {
    private ArrayList<String> wordList;
    public boolean isWordChain() {
        for (int i = 1; i < wordList.size(); i++) {
            if (wordList.get(i).indexOf(wordList.get(i-1)) == -1) { 
                return false;
            }
        }
        return true;
    }
    public ArrayList<String> createList(String target){
        ArrayList<String> yummy = new ArrayList<String>();
        for (int i = 0;i<wordList.size();i++){
        if (wordList.get(i).indexOf(target) == 0){
          yummy.add(wordList.get(i).substring(target.length()));
        }}
        return yummy;
    }
}
