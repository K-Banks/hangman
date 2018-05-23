package models;

import org.junit.Test;

import java.util.ArrayList;
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
    public void newGame_setsRandomWordFromArrayForAnswerWord_nonEmptyString() {
        Game testGame = new Game();
        String testString = "";
        testGame.setAnswer();
        assertFalse(testString.equals(testGame.getAnswerWord()));
    }

    @Test
    public void wordLength_getWordLength_greaterThanZero() {
        Game testGame = new Game();
        testGame.setAnswer();
        assertTrue(testGame.getWordLength() > 0);
    }

    @Test
    public void characterCheck_checksAnswerWordForCharacter_true() {
        Game testGame = new Game();
        testGame.setAnswer();
        assertTrue(testGame.characterCheck('a'));
    }
}