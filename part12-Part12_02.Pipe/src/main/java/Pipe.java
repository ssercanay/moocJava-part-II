
import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> elements;
    
    public Pipe(){
        this.elements = new ArrayList<>();
    }
    
    public void putIntoPipe(T toHide){
        this.elements.add(toHide);
    }
    
    public T takeFromPipe(){
        for (int i = elements.size()-1; i >= 0; i--) {
            T element = this.elements.get(i);
            this.elements.remove(i);
            return element;
        }
        return null;
    }
    
    public boolean isInPipe(){
        if (elements.isEmpty()) {
            return false;
        } else{
            return true;
        }
    }    
}
