/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguessinggame;

import java.util.Scanner;

/**
 *  A game to try and guess a random number 
 *  Created a method to easily call upon in main
 * @author makiyalaurenza
 */
public class NumberGuessingGame {
    
    public static void guessingNumGame(){
              
        Scanner scan = new Scanner(System.in);
        int compNum = 1 + (int)(10 * Math.random());//generates random number between 1-10
        
        System.out.println("Enter your number guess between 1-10, you have 3 chances: ");
        int userGuess = scan.nextInt();
        
        
        //System.out.println("THE COMPUTER NUM::::::: " + compNum); //Just for testing:

        int tries = 2;
        while(userGuess != compNum && tries > 0){
                System.out.printf("You have %d tries left\n", tries);

                /**
                This if else statement gives direction to the user if they 
                need to guess greater or lower:
                **/
                if (userGuess > compNum){
                   System.out.println("Try a number lower then that");
                   userGuess = scan.nextInt();
                   tries--;
                }
                else if(userGuess < compNum){
                    System.out.println("Try a number greater then that");
                    userGuess = scan.nextInt();
                    tries--;
                }                  
                else{
                break;
                }
                
               //When the user has not guessed the number yet:
               if (tries == 0 && userGuess != compNum){
                System.out.println("You ran out of chances :( ");
                System.out.println("The number was: " + compNum);
                }
               //When user guesses number: 
               if (userGuess == compNum){
                   System.out.println("Good job, its a MATCH!");
               } 
        } 
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        guessingNumGame();
        
    }
    
}
