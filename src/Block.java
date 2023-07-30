import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;


public class Block {

    // read the problem pseudocode the code
    //instance
    //constructor
    //main
        //Array both ways if , switch, for each , scanner, hash

     String BlockName;
     double BlockRating;
     String BlockNiche;

     //we define our methods outside the main

    public static String getName(HashMap<String,String>traps, String BlockName ){
            return traps.get(BlockName);
    };

     public Block(String name, double rating, String niche){
            this.BlockName =name;
            this.BlockRating = rating;
            this.BlockNiche = niche;

     }
     //static means that it accebaile thoroug out the class and not just an instance
     public static void main (String[] args){

         Block conley = new Block("conley",5,"trapping");//we are initializinng an instance of a block
         Block oldNat = new Block("oldNat",3, "pimping");
         Block pittsburg = new Block("PBG",4,"Stealing");

         // now i want to make the array with the objects

         int size = 3;
         Block[] blocks = new Block[size]; // so first we do the type an with th [] and then the name of the array snd then equal new the name of the type with th [] os how you initialize a array
        //no we got to physically put th infor in the array as java is a declarative langyage
          blocks[0] = conley;
          blocks[1] = oldNat;
          blocks[2] = pittsburg;

          // to see we got to use a quick for loop
         for(Block block:blocks){
             System.out.println(block.BlockName);
         }

         // okay now we are making a hashmap called traps
         HashMap<String,String>traps = new HashMap<>(); // it uses the hash class
            // we populate the hash
         traps.put(blocks[0].BlockName,"trapcity");
         traps.put(blocks[1].BlockName,"oldNasty");
         traps.put(blocks[2].BlockName,"jackcity");

         String nickname = getName(traps, blocks[1].BlockName);

         System.out.println(nickname);


         // okay now we will make a user input section
         // user input
         Scanner scanner = new Scanner(System.in); // making a scanner object input

         System.out.println("Where you from");

         String response = scanner.nextLine().trim();// the next line takes the info token an allows for more than one

         System.out.println("oh yea I rock with "+ response);

         // okay now we are going to make a conditional
         // I want to iterarte through the traps and if they rating is above a 3 then we say they trap boomin if below a three we say they trap slow

         for(Block block:blocks) {// in for loop we specify the type and the parametwers
                if(block.BlockRating < 4){
                        System.out.println("yall aint talking bout nothin");
                }else{
                    System.out.println("yall boomin");
                }
         }

     }


}
