package models;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class hangmanTest {
    @Test
    public void constructor_instantiatesNewHangman_true() {
        Hangman testHangman = new Hangman();
        assertTrue(testHangman instanceof Hangman);
    }

    @Test
    public void newHangman_getHangmanImg_map() {
        Hangman testHangman = new Hangman();
        Map<Integer, Character> testMap = new HashMap<Integer, Character>();
        assertEquals(testMap.getClass(), testHangman.getHangmanImg().getClass());
    }

    @Test
    public void drawHangman_changesValueOfHangmanImg_character() {
        Hangman testHangman = new Hangman();
        testHangman.drawHangman(5);
        Character expected = 'o';
        assertEquals(expected, testHangman.getHangmanImg().get(14));
    }
}