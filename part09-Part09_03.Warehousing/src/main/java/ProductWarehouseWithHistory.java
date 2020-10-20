
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        
        this.history = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.history.add(initialBalance);
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
        double toReturn = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return toReturn;
        
    }
    
    public String history(){
        return this.history.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
