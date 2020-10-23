
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Literacy> lists = new ArrayList<>();
        try{
            Files.lines(Paths.get("literacy.csv"))
                 .map(row -> row.split(","))
                 .filter(parts -> parts.length == 6)
                 .map(parts -> new Literacy(parts[0], parts[1], parts[2], parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                 .forEach(line -> lists.add((Literacy) line)); 
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());            
            }
        
        
        Comparator<Literacy> comparator = Comparator
              .comparing(Literacy::getliteracyPercent);
              

        Collections.sort(lists, comparator);
        
        for (Literacy e: lists) {
            String string = e.getGender();
            String[] gender = string.split(" ");            
            System.out.println(e + gender[1] + ", " + e.getliteracyPercent());
}
    }
}
