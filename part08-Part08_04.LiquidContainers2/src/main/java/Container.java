
public class Container {
    
    private int volume;
    
    public Container(){
        this.volume = 0;
    }
    
    public int contains(){     
        return this.volume;         
    }
    
    public void add(int amount){
        if (amount > 0) {
            this.volume += amount;
        }        
        if (this.volume > 100) {
            this.volume = 100;
        } 
        
    }
    
    public void remove(int amount){
        if (amount > 0) {
        this.volume -= amount;
        }
        if(this.volume < 0){
            this.volume = 0;
        }
        
    }
    
    public String toString(){
    return this.volume + "/100";
    }
    
}




