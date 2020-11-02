package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application{

    public static void main(String[] args) {
        launch(Main.class);
    }
    
    @Override
    public void start(Stage window){
        UserTitle title = new UserTitle();
        window.setTitle(title.getTitle());
        window.show(); 
        
    }
    

}
