package title;

import java.util.Scanner;


public class UserTitle{
    private Scanner scan;
    private String title;

    public UserTitle(){
    this.scan = new Scanner(System.in);
    setTitle();
    }

    
    public void setTitle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Set title please: ");
        String title = scan.nextLine();
        this.title = title;
                
    }
    
    public String getTitle(){
        return this.title;
    }
}
