package models;

import java.util.HashMap;
import java.util.Map;

public class Hangman {
    Map<Integer, Character> hangmanImg;

    public Hangman() {
        this.hangmanImg = new HashMap<Integer, Character>();
        hangmanImg.put(1, ' ');
        hangmanImg.put(2, ' ');
        hangmanImg.put(3, '_');
        hangmanImg.put(4, '_');
        hangmanImg.put(5, ' ');
        hangmanImg.put(6, '\n');
        hangmanImg.put(7, ' ');
        hangmanImg.put(8, '|');
        hangmanImg.put(9, ' ');
        hangmanImg.put(10, ' ');
        hangmanImg.put(11, '|');
        hangmanImg.put(12, '\n');
        hangmanImg.put(13, ' ');
        hangmanImg.put(14, ' ');
        hangmanImg.put(15, ' ');
        hangmanImg.put(16, ' ');
        hangmanImg.put(17, '|');
        hangmanImg.put(18, '\n');
        hangmanImg.put(19, ' ');
        hangmanImg.put(20, ' ');
        hangmanImg.put(21, ' ');
        hangmanImg.put(22, ' ');
        hangmanImg.put(23, '|');
        hangmanImg.put(24, '\n');
        hangmanImg.put(25, ' ');
        hangmanImg.put(26, ' ');
        hangmanImg.put(27, ' ');
        hangmanImg.put(28, ' ');
        hangmanImg.put(29, '|');
        hangmanImg.put(30, '\n');
        hangmanImg.put(31, ' ');
        hangmanImg.put(32, ' ');
        hangmanImg.put(33, ' ');
        hangmanImg.put(34, ' ');
        hangmanImg.put(35, '|');
    }

    public Map<Integer, Character> getHangmanImg() {
        return hangmanImg;
    }

    public void drawHangman(int counter) {
        if (counter == 5) {
            hangmanImg.put(14, 'o');
        } else if (counter == 4) {
            hangmanImg.put(19, '-');
        } else if (counter == 3) {
            hangmanImg.put(20, '|');
        } else if (counter == 2) {
            hangmanImg.put(21, '-');
        }
    }
}
