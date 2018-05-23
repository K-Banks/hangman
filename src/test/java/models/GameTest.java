package models;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void constructor_returnsInstantiatedGameClass_true() {
        Game testGame = new Game();
        assertEquals(true, testGame instanceof Game);
    }

    @Test
    public void newGame_getsAnswerWord_string() {
        Game testGame = new Game();
        assertEquals(true, testGame.getAnswerWord() instanceof String);
    }

    @Test
    public void newGame_getsGuessArray_arrayList() {
        Game testGame = new Game();
        List<Character> testList = new ArrayList<Character>();
        assertEquals(testList, testGame.getGuessArray());
    }

    @Test
    public void newGame_getsTurnCounter_integer() {
        Game testGame = new Game();
        assertEquals(true, testGame.getTurnCounter() instanceof Integer);
    }

    @Test
    public void newGame_GetWordToChar_array() {
        Game testGame = new Game();
        assertTrue(testGame.getWordToChar() instanceof char[]);
    }

    @Test
    public void setAnswer_setAnswerWord_apple() {
        Game testGame = new Game();
        testGame.setAnswer("apple");
        assertEquals("apple", testGame.getAnswerWord());
    }

    @Test
    public void setAnswer_setWordToChar_charArray() {
        Game testGame = new Game();
        String answer = "apple";
        testGame.setAnswer(answer);
        char[] expected = answer.toCharArray();
        assertTrue(Arrays.equals(expected, testGame.getWordToChar()));
    }

    @Test
    public void wordLength_getWordLength_greaterThanZero() {
        Game testGame = new Game();
        testGame.setAnswer("apple");
        assertTrue(testGame.getWordLength() > 0);
    }

    @Test
    public void characterCheck_checksAnswerWordForCharacter_true() {
        Game testGame = new Game();
        testGame.setAnswer("apple");
        assertTrue(testGame.characterCheck('a'));
    }

    @Test
    public void addCharacterToGuesses_addCharacterToGuessesArrayList_true() {
        Game testGame = new Game();
        testGame.addCharacterToGuesses('a');
        assertTrue(testGame.getGuessArray().size() > 0);
    }

    @Test
    public void characterCheck_decreasesGuessCounter_5() {
        Game testGame = new Game();
        testGame.setAnswer("apple");
        testGame.characterCheck('z');
        Integer expected = 5;
        assertEquals(expected, testGame.getTurnCounter());
    }

    @Test
    public void randomizer_selectsRandomWordFromArray_nonEmptyString() {
        Game testGame = new Game();
        String testString = "";
        assertFalse(testString.equals(testGame.randomizer()));
    }
}