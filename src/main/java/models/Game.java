package models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String answerWord;
    private List<Character> guessArray;
    private Integer turnCounter;

    public Game(){
        this.answerWord = "";
        this.guessArray = new ArrayList<Character>();
        this.turnCounter = 6;
    }

    public String getAnswerWord() {
        return answerWord;
    }

    public List<Character> getGuessArray() {
        return guessArray;
    }

    public Integer getTurnCounter() {
        return turnCounter;
    }
}
