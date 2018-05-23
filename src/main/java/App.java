import models.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        Boolean programRunning = true;
        System.out.println("Welcome to Hangman. Let's begin.");
        Game game = new Game();
        String randomAnswer = game.randomizer();
        game.setAnswer(randomAnswer);
        while(programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                Integer lengthCounter = game.getWordLength() - 1;
                for (char individualChar: game.getWordToChar()) {
                    if (game.getGuessArray().contains(individualChar)) {
                        System.out.print(individualChar);
                        lengthCounter = lengthCounter-1;
                    } else {
                        System.out.print("_ ");
                    }
                }
                System.out.println();
                System.out.println("You have " + game.getTurnCounter() + " incorrect guesses left. So far you have guessed " + game.getGuessArray());
                System.out.println("Please enter your guess: ");
                char guess = bufferedReader.readLine().toCharArray()[0];
                while (game.getGuessArray().contains(guess)) {
                    System.out.println("You have already guessed " +guess+ ". Please enter a new guess: ");
                    guess = bufferedReader.readLine().toCharArray()[0];
                }
                game.characterCheck(guess);
                game.addCharacterToGuesses(guess);
                if (game.getTurnCounter() == 0) {
                    System.out.println("You lose!");
                    System.out.println("Would you like to play again? - yes or no");
                    String userContinue = bufferedReader.readLine();
                    if (userContinue.equals("yes")){
                        game = new Game();
                        randomAnswer = game.randomizer();
                        game.setAnswer(randomAnswer);
                    } else {
                        programRunning = false;
                    }
                } else if (lengthCounter == 0) {
                    System.out.println("You win! Your word was: " + game.getAnswerWord());
                    System.out.println("Would you like to play again? - yes or no");
                    String userContinue = bufferedReader.readLine();
                    if (userContinue.equals("yes")){
                        game = new Game();
                        randomAnswer = game.randomizer();
                        game.setAnswer(randomAnswer);
                    } else {
                        programRunning = false;
                    }
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
