
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    private ArrayList<Person> employees;
    
    public Employees(){
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(person -> add(person));
    }
    
    public void print(){
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
    }
        
        //employees.stream().forEach(person -> System.out.println(person));        
    
    
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
                
        while (iterator.hasNext()) {
            Person print = iterator.next();
            if (print.getEducation() == education) {
                System.out.println(print);
            }        

    }

    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }        
    }
    }
}

