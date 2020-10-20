
import java.util.ArrayList;

public class Box implements Packable{
    private double maximumCapacity;
    private ArrayList<Packable> packables;
    
    public Box(double maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.packables = new ArrayList<>();
    }
    
    public double weight(){
        double currentWeight = 0;
        for (Packable box: packables) {            
                currentWeight = currentWeight + box.weight();
        }
        return currentWeight;
    }

    public void add(Packable packable){
        if (this.maximumCapacity >= packable.weight() + weight()) {
            this.packables.add(packable);            
        }
    }
    
    @Override
    public String toString(){
        return "Box: " + this.packables.size() + " items, total weight " +
                weight() + " kg";
    }
        
}
