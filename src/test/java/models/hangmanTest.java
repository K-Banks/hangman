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
    public void drawHangman_changesValueOfHangmanImgTurn5_character() {
        Hangman testHangman = new Hangman();
        testHangman.drawHangman(5);
        Character expected = 'o';
        assertEquals(expected, testHangman.getHangmanImg().get(14));
    }

    @Test
    public void drawHangman_changesValueOfHangmanImgTurn4_character() {
        Hangman testHangman = new Hangman();
        testHangman.drawHangman(4);
        Character expected = '-';
        assertEquals(expected, testHangman.getHangmanImg().get(19));
    }

    @Test
    public void drawHangman_changesValueOfHangmanImgTurn3_character() {
        Hangman testHangman = new Hangman();
        testHangman.drawHangman(3);
        Character expected = '|';
        assertEquals(expected, testHangman.getHangmanImg().get(20));
    }

    @Test
    public void drawHangman_changesValueOfHangmanImgTurn2_character() {
        Hangman testHangman = new Hangman();
        testHangman.drawHangman(2);
        Character expected = '-';
        assertEquals(expected, testHangman.getHangmanImg().get(21));
    }

    @Test
    public void drawHangman_changesValueOfHangmanImgTurn1_character() {
        Hangman testHangman = new Hangman();
        testHangman.drawHangman(1);
        Character expected = '/';
        assertEquals(expected, testHangman.getHangmanImg().get(25));
    }

    @Test
    public void drawHangman_changesValueOfHangmanImgTurn0_character() {
        Hangman testHangman = new Hangman();
        testHangman.drawHangman(0);
        Character expected = '\\';
        assertEquals(expected, testHangman.getHangmanImg().get(27));
    }
}