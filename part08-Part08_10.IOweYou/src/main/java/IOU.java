import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iou;
    
    
    public IOU(){
        this.iou = new HashMap<>();
        
    }
    
    public void setSum(String toWhom, double amount){
        double sum = this.iou.getOrDefault(toWhom, 0.0) + amount;
        this.iou.put(toWhom, sum);
        
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.iou.getOrDefault(toWhom, 0.0);
    }
}
