
import java.util.Scanner;


public class UserInt {
    private Container containerOne;
    private Container containerTwo;
    
    public UserInt(){
        this.containerOne = new Container();
        this.containerTwo = new Container();
    }
    
    public void start(){
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("First: " + containerOne.toString());
            System.out.println("Second: " + containerTwo.toString()); 
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }        
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                containerOne.add(amount);
            }            
            
            if (command.equals("remove")) {
                containerTwo.remove(amount);
                
            }
            
            if (command.equals("move")) {
                if (containerOne.contains() < amount) {
                    containerTwo.add(containerOne.contains());
                    containerOne.remove(amount);
                } else{
                    containerTwo.add(amount);
                    containerOne.remove(amount);
                }
            }            
           
        }
    }
}
