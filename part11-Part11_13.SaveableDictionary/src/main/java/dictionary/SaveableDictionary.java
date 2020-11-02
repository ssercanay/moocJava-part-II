
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;


public class SaveableDictionary{
    private HashMap<String, String> dictionaryToFinnish;
    private File dictionaryFile;
    
    public SaveableDictionary (){
        dictionaryToFinnish = new HashMap<>();  
        
    }
    
    public SaveableDictionary(String file){
        this();
        dictionaryFile = new File(file);
    }
    
    public void add(String words, String translation){
            dictionaryToFinnish.putIfAbsent(words, translation);

        
    }
    
    public String translate(String word){
        if (dictionaryToFinnish.containsKey(word)) {
            return dictionaryToFinnish.get(word);
        }
        
        if (dictionaryToFinnish.containsValue(word)) {
            for (String key: dictionaryToFinnish.keySet()) {
                if (dictionaryToFinnish.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }

    
    public void delete(String word){
        String keyWillRemoved = "";
	dictionaryToFinnish.remove(word);
	
	if (dictionaryToFinnish.containsValue(word)) {
		for (String key : dictionaryToFinnish.keySet()) {
			if (dictionaryToFinnish.get(key).equals(word)) {
				keyWillRemoved = key;
			}
		}
		dictionaryToFinnish.remove(keyWillRemoved);
		}     
        }     
    
    public boolean load() {

        if (this.dictionaryFile.canRead()) {
            try {
                readFromFile();
               } catch (FileNotFoundException e){
                   
               }
            return true;
            }
        return false;
        }

    
    public void readFromFile() throws FileNotFoundException{
        try (Scanner fileReader = new Scanner(dictionaryFile)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                dictionaryToFinnish.put(parts[0], parts[1]);
            }   }
    
    
    }
    
     public boolean save(){
        StringBuilder words = new StringBuilder();
        try (PrintWriter writer = new PrintWriter(dictionaryFile)) {
            for (String key: dictionaryToFinnish.keySet()) {
                               
               writer.println(key + ":" + dictionaryToFinnish.get(key));
               
            }
            
            
            return true;
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return false;    
    
}
}
        


