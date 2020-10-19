import java.util.HashMap;
import java.util.ArrayList;
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> multiTranslation;
    
    public DictionaryOfManyTranslations(){
        this.multiTranslation = new HashMap<>();
        
    }
            
    public void add(String word, String translation){
        this.multiTranslation.putIfAbsent(word, new ArrayList<>());
        this.multiTranslation.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        return this.multiTranslation.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        this.multiTranslation.remove(word);
    }
    
}


