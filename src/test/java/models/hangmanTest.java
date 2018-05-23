package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class hangmanTest {
    @Test
    public void constructor_instantiatesNewHangman_true() {
        Hangman testHangman = new Hangman();
        assertTrue(testHangman instanceof Hangman);
    }
}