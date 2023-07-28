// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Movie {

    //instance variables
    String name;
    String genre;

    //constructor method must have same name as the class
    public Movie(String name, String genre){
        this.name = name;
        this.genre = genre;
    }
    public static void main(String[] args) {
            Movie movie = new Movie("godfather", "drama");
            System.out.println(movie.name);

    }
}