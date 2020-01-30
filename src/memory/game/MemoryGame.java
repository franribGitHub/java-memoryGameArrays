/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory.game;

/**
 *
 * @author mlarrubia
 */
public class MemoryGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int gridSize = 4;
        char[] deck = {'A','A','B','B','C','C','D','D','E','E','F','F','G','G','H','H'};
        boolean[] cardDrawn = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
        char[][] grid = new char[gridSize][gridSize];
        int random = (int)(Math.random()*16);
        
        System.out.println("Drawing from deck:\n----------------");
        
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                
                for (int k = 0; k < deck.length; k++) {
                    if (cardDrawn[k] == false) {
                        System.out.print(deck[k]);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                
                while (cardDrawn[random] == true) {
                    random = (int)(Math.random()*16);
                }
                grid[i][j] = deck[random];
                cardDrawn[random] = true;
            }
        }
        
        System.out.println("----------------\nGrid:\n----------------");
        
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("----------------");
    }
    
}
