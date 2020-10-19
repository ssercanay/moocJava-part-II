import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry(){
        this.owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (!owners.containsKey(licensePlate)) {
            owners.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
        
        
    }
    
    public String get(LicensePlate licensePlate){
        return owners.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if (owners.containsKey(licensePlate)) {
            owners.remove(licensePlate);
            return true;
        } else{
            return false;
        }
    }
    
    public void printLicensePlates(){
        for(LicensePlate licensePlate: owners.keySet()){
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> printOwners = new ArrayList<>();
        for(String owner: owners.values()){
            if (!printOwners.contains(owner)) {
                printOwners.add(owner);
                System.out.println(owner);
            }
            
        }         
    }
}
