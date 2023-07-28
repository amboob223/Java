import java.util.HashMap;

public class Review {
    //instance variable
        String movieName;
        double movieRating;


        //constructor
    public Review(String name, double rating){
        this.movieName = name;
        this.movieRating = rating;
    }

    public static void main(String[] args){
        Review review = new Review("godfather", 4.5);
        System.out.println(review.movieName);
        Movie movie = new Movie("godfellas", "drama");
        System.out.println(movie.genre);



        //array
        int[] numbers = {2,4,5,6,6};
        System.out.println(numbers); // this wont print out number alone because it delclaratve wwe got to use a forloop and display each


        for(int number:numbers){
            System.out.println(number + "");
        }

        // populatinga an array with a loop.
        int size = 5;
        int[] numbas = new int[size]; // we got to first make the size and data type then make it for arrays

        for(int i=0; i < size ; i++){
           numbas[i] = i + 1;
        }

        for(int numba:numbas){
            System.out.println(numba);
        } // so to see the element of an array use a for loop

        // now we mustpopulate a hash
    HashMap<String,String>reviews = new HashMap<>();
        reviews.put("goodfellas","drama");

        System.out.println(reviews);
        System.out.print(reviews.get("goodfellas"));// the get method takes in a key as a pramawtwe and returns the value
    }// this is the end of the main

} // this is the end of the class

