
import java.util.ArrayList;
import java.util.List;


public class Herd implements Movable{
    private List<Movable> movables = new ArrayList<>();
    
    public void addToHerd(Movable movable){
        this.movables.add(movable);
    }
    
    public String toString(){
        String willReturn = "";
        for(Movable movable: movables){
            willReturn = willReturn + movable.toString() + "\n";
        }        
        return willReturn;
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable movable: movables){
            movable.move(dx, dy);
        }
    }    
    
}
