package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application implements ChangeListener {
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea leftText = new TextArea();
        HBox texts = new HBox();    
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label totalWords = new Label();
        Label longestWord = new Label();
        Label totalCharacters = new Label();
        
        leftText.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();
            
            totalCharacters.setText("" + characters);                        
            totalWords.setText("" + words);
            longestWord.setText(longest);
     // set values of text elements
        });
        
        label1.textProperty().bind(Bindings.concat("Letters: ", totalCharacters.textProperty()));
        label2.textProperty().bind(Bindings.concat("Words: ", totalWords.textProperty()));      
        label3.textProperty().bind(Bindings.concat("The longest word is: ", longestWord.textProperty()));        
        
        texts.getChildren().addAll(label1, label2, label3);
        layout.setCenter(leftText);
        layout.setBottom(texts);
        
        
        Scene view = new Scene(layout);
        window.setTitle("Text Statistics Application");        
        window.setScene(view);
        window.show();   
    }
    
    @Override
    public void changed(ObservableValue arg0, Object arg1, Object arg2) {

    }
    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
    

    }

   
