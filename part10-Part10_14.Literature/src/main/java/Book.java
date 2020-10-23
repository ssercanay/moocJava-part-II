public class Book {
    private String name;
    private int ageRecom;

    public Book(String name, int ageRecom) {
        this.name = name;
        this.ageRecom = ageRecom;
    }

    public String getName() {
        return this.name;
    }

    public int ageRecom() {
        return this.ageRecom;
    }

    public String toString() {
        return this.name + " (recommended for " + this.ageRecom + " year-olds or older)";
    }
}