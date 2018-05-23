package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private String answerWord;
    private List<Character> guessArray;
    private Integer turnCounter;
    private char[] wordToChar;

    public Game(){
        this.answerWord = "";
        this.guessArray = new ArrayList<Character>();
        this.turnCounter = 6;
        this.wordToChar = answerWord.toCharArray();
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

    public char[] getWordToChar() {
        return wordToChar;
    }

    public void setAnswer(String inputWord) {
        answerWord = inputWord;
        wordToChar = inputWord.toCharArray();
    }

    public String randomizer(){
        String[] options = {"humuhumunukunukuapuaa", "encyclopedia", "jazz", "beneficiary", "ultracrepidarian", "steatopygous", "pneumonoultramicroscopicsilicovolcanoconiosis", "hippopotomonstrosesquippedaliophobia", "strengths", "pizazz", "espionage", "yachtsman"};
        Random randomizer = new Random();
        int selection = randomizer.nextInt(options.length);
        return options[selection];
    }

    public int getWordLength() {
        return answerWord.length();
    }

    public boolean characterCheck(Character guessedCharacter) {
        Boolean characterPresent = false;
        int indexOfCharacter = answerWord.indexOf(guessedCharacter);
        if (indexOfCharacter != -1) {
            characterPresent = true;
        } else {
            turnCounter = turnCounter -1;
        }
        return characterPresent;
    }

    public void addCharacterToGuesses(Character guessedCharacter) {
        guessArray.add(guessedCharacter);
    }
}
