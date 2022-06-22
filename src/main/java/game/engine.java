package game;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    
    public int fieldsize = 10;
    public int numbombs = 10;
    public int foundbombs = 0;
    private int[] bombpositions;
    public Tile[][] minefield;
    private Random rand = new Random();

    public boolean gameEnded = false;

    private Utility utility;

    public Engine(){
        Utility utility = new Utility();
    }

    public void start(){

        //create minefield with tile array
        Tile[][] minefield = new Tile[numbombs][numbombs];
        for (int i=0; i<numbombs; i++){
            for(int j=0; j<numbombs; j++){
                minefield[i][j] = new Tile();
            }
        }
        //generate array containing bomb positions
        Random rand = new Random();
        int i =0;
        while(i<numbombs){
            int newbomb = rand.nextInt(fieldsize*fieldsize);
            if(!utility.contains(bombpositions, newbomb)){
                bombpositions[i] = newbomb;
                i++;
            }
        }
        //set bombs in minefield
        for(int a=0; a<bombpositions.length;a++){
            int x = bombpositions[a] /10;
            int y = bombpositions[a] % 10;
            minefield[x][y].setRole("bomb");
        }
    }

    public void play(){
        Scanner scanner = new Scanner(System.in);
        while(!gameEnded){
            
            //end game if all bombs found
            if(foundbombs==numbombs)
                gameEnded = true;
            
            //Get input
            utility.printMinefield(minefield);
            String[] input = scanner.nextLine().split(", ");
            String comm = input[0].toLowerCase();
            int x = Integer.parseInt(input[1]); 
            int y = Integer.parseInt(input[2]);

            //process input
            if(comm=="f"){
                minefield[x][y].setDisplay("flagged");
                continue;
                //flag tile
            } else if(comm=="e"){
                if(minefield[x][y].getRole()=="bomb"){
                    gameEnded = true;
                    //bomb hit, game ends
                }else{
                    if(minefield[x][y].getValue()=="empty"){
                        minefield[x][y].setDisplay("empty");
                        utility.revealEmptyNeighbours(minefield, x, y);
                        continue;
                    }else{ //tile has neighbour with bombs

                        continue;
                    }
                }

            }else{
                System.out.println("Please enter valid command");
                continue;
            }
        }
        scanner.close();
    }

    public void end(){
        utility.revealAll(minefield);
        utility.printMinefield(minefield);
        if(foundbombs==numbombs){
            System.out.println("Congrats you won");
        }else{
            System.out.println("Try again noob");
        }
    }

}
