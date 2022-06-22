package game;

import java.util.LinkedList;

public class Utility {

    public boolean contains(int[] array, int testint){
        boolean result = false;
        for (int i : array){
            if (testint == i){
                result = true;
                break;
            }
        }
        return result;
    }

    public void printMinefield(Tile[][] field){
        Tile[][] minefield = field;
    }

    public void revealAll(Tile[][] field){
        Tile[][] minefield = field;
        for (int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                minefield[i][j].setDisplay(minefield[i][j].getValue());
            }
        }

    }

    public void revealEmptyNeighbours(Tile[][] field, int x, int y){
        Tile[][] minefield = field;
        
    }

    public void searchBombNeighbours(Tile[][] field, int x, int y){
        Tile[][] minefield = field;
        int numBombs = 0;
        //TODO
        String value = String.valueOf(numBombs);
        minefield[x][y].setValue(value);
    }

    
}
