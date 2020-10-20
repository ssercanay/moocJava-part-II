import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.removeAll(history);
    }
    
    public double maxValue(){
        if (this.history.isEmpty()) {
            return 0;
        } else{
            double largest = this.history.get(0);
            for(Double statu: history){
                if (largest < statu) {
                    largest = statu;
                }
            }
            return largest;
        }
    }
    
    public double minValue(){
        if (this.history.isEmpty()) {
            return 0;
        } else{
            double smallest = this.history.get(0);
            for(Double statu: history){
                if (smallest > statu) {
                    smallest = statu;
                }
            }
            return smallest;
        }        
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        } else{
            double sum = 0;
            int counter = 0;
            for(Double statu: history){
                sum = sum + statu;
                counter++;
                }
            return sum/counter;
            }
            
        }         
    
    
    @Override
    public String toString(){
        return "" + this.history;

    }

}
