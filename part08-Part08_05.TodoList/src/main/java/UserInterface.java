import java.util.Scanner;

public class UserInterface {
    private TodoList todos;
    private Scanner scan;
    
    public UserInterface(TodoList todos, Scanner scan){
        this.todos = todos;
        this.scan = scan;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scan.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {                
                System.out.println("To add: ");
                String add = scan.nextLine();
                this.todos.add(add);
            }
            
            if (command.equals("list")) {
                this.todos.print();
            }
            
            if (command.equals("remove")) {
                int index = Integer.valueOf(scan.nextLine());
                this.todos.remove(index);
            }
        }
    }
    
    
}
