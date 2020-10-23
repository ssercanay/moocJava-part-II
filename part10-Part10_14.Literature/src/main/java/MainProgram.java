
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String nameOfBook = scanner.nextLine();
            if (nameOfBook.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageRecom = Integer.valueOf(scanner.nextLine());
            books.add(new Book(nameOfBook, ageRecom));
        }
        System.out.println(books.size() + " books in total.");
        System.out.println("Books");
        
        Comparator<Book> comparator = Comparator
              .comparing(Book::ageRecom)
              .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        books.stream()
                .forEach(book -> System.out.println(book.toString()));

    }

}
