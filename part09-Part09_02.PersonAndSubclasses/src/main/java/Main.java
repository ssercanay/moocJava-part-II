import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // write your test code here
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);
        

    }
    
    public static void printPersons(ArrayList<Person> persons){
        for(Person person: persons){
            System.out.println(person);
        }
    }    

}
