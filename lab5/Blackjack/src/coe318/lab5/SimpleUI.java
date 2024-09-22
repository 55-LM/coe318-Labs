package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() { //Displays the game, the house cards and the user's cards
        //FIX THIS
        int scorehouse = game.score(game.getHouseCards());
        int scoreuser = game.score(game.getYourCards());
        System.out.println("House holds: " + this.game.getHouseCards().toString());
        System.out.println("You hold: " + this.game.getYourCards().toString());
        System.out.println("Your score: " + scoreuser);
        System.out.println(" ");
    }

  @Override
    public boolean hitMe() { //Adds a face down card to the user everytime the input is yes
        //FIX THIS
        System.out.println("Another Card? (Enter 'y' for yes, and 'n' for no)");
        String input = user.nextLine();
        boolean hit = false;
        switch(input){
            case "y":
                hit = true;
                break;
            case "n":
                hit = false;
                break;
            default:
                System.out.println("Enter a valid option");
                hitMe();
        }
        return hit;
    }

  @Override
    public void gameOver() { //Displays the final score of the house and the user and displays who won
        //FIX THIS
        this.display();
        int scorehouse = game.score(game.getHouseCards());
        int scoreuser = game.score(game.getYourCards());
        //System.out.println("Your score: " + scoreuser);
        System.out.println("House score: " + scorehouse);
        if((scorehouse < scoreuser || scorehouse > 21) && (scoreuser <= 21)){ //If the score of the house is less than the user's score or the the house score is less than 21 and the user's score is less than or equal to 21
            System.out.println("You Win");
        } else {
            System.out.println("The House wins");
        }
    }
}