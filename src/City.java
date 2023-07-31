import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//this class will be the parent class but we wil inherit fron the block on heere because every city has blocks
// Atlanta is the city that will containn all the instance of blocks we made but evry city will have tyh==hey own blocks

public class City {
    //instance varibables
  public  Block[] blockArray;//the city takes an array of block.
  public  String cityName;

    //connstructor

    public City(Block[] blocks, String name ){
        this.blockArray = blocks; //so Block[] is the data type of an array that we made
        this.cityName = name;
    } // this is the constructor of the city class the city class inherits from the block class

    //methods
    //main
    public static void Main(String[] args){
        // we inintialze in the main but i think doing it in  aloop ios what take alot more memeory

                // we got to create the block array firay before we can initialize it

        Block conley = new Block("Conley",4,"trapping");
        Block oldNat = new Block("ol nat",4.3,"pimping");
        Block pittsburg = new Block("pittsburg",5,"stealing");

        Block seminary = new Block("Semminary",5,"killing");
        Block Acorn = new Block("Acorn",4,"Trapping");
        Block international = new Block("international",5,"pimping");



                //we directly make the array here
            Block[] blocks = {conley,oldNat,pittsburg};
            Block[] oBlocks = {seminary,Acorn,international};

        City Atlanta = new City(blocks,"Atlanta" );
        City Oakland = new City(oBlocks,"Oakland");

    }

}
