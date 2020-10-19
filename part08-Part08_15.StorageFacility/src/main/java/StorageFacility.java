import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> itemCodes;
    
    public StorageFacility(){
        this.itemCodes = new HashMap<>();
        
    }
    
    public void add(String unit, String item){
        this.itemCodes.putIfAbsent(unit, new ArrayList<>());
        this.itemCodes.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return this.itemCodes.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        this.itemCodes.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> keySet = new ArrayList<>();
        
        for (String name: itemCodes.keySet()){
            if (!this.itemCodes.get(name).isEmpty()) {
                keySet.add(name);
            }
                
                        
        }
        
        return keySet;
    }
}
