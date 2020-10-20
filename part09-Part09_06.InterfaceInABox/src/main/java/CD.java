
public class CD implements Packable{
    private String nameOfArtist;
    private String nameOfCD;
    private int publicationYear;
    final double weightOfCD;
    
    public CD(String artistName, String CDName, int year){
        this.nameOfArtist = artistName;
        this.nameOfCD = CDName;
        this.publicationYear = year;
        this.weightOfCD = 0.1;
    }
    
    public double weight(){
        return this.weightOfCD;
    }
    
    @Override
    public String toString(){
        return this.nameOfArtist + ": " + this.nameOfCD + " (" + 
               this.publicationYear + ")";
    }
    
}
