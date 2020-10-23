
public class Literacy {
    private String theme;
    private String age;
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;
    
    public Literacy(String theme, String age, String gender, String country, int year, double literacyPercent){
        this.theme = theme;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }
    
    public double getliteracyPercent(){
        return this.literacyPercent;
    } 
    
    public String getGender(){
        return this.gender;
    }
    
    public String toString() {
        return this.country + " (" + this.year + "), ";
    }    
}
