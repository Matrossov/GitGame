/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class SPTV20Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max=5, min=0, attempt=0;
        Random random = new Random();
        
        System.out.print("Guess number from 0 to 5: ");
        for(int i=0; i<3; i++){
            
            int gameNum = random.nextInt(max - min + 1) + min;
            Scanner scanner = new Scanner(System.in);
            int userNum = scanner.nextInt();
            if (gameNum == userNum){
                System.out.print("You won! ");
                break;
            }else{
                    if(attempt<3){
                System.out.println("You lost:, number was " + gameNum + " try one more time! ");
                    
                
        // TODO code application logic here
    }
    
}
