package cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class DeckOfCards {

    ArrayList<Integer> cards = new ArrayList<Integer>();
//    ArrayList<Integer> player1Cards = new ArrayList<Integer>();
//    ArrayList<Integer> player2Cards = new ArrayList<Integer>();
    public int i = 0;

    public void divideCards() {//divide all cards to one array list
        for (int j = 1; j < 36; j++) {
            cards.add(j);
        }
        Collections.shuffle(cards);

    }

    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }

    public static int value(int numberCard) {
        if (numberCard == 6 || numberCard == 15 || numberCard == 24 || numberCard == 33) {
            return 2;
        } else if (numberCard == 7 || numberCard == 16 || numberCard == 25 || numberCard == 34) {
            return 3;
        } else if (numberCard == 8 || numberCard == 17 || numberCard == 26 || numberCard == 35) {
            return 4;
        } else if (numberCard == 9 || numberCard == 18 || numberCard == 27 || numberCard == 36) {
            return 11;
        } else if (numberCard == 1 || numberCard == 2 || numberCard == 3 || numberCard == 4 || numberCard == 5) {
            return numberCard + 5;
        } else if (numberCard == 10 || numberCard == 11 || numberCard == 12 || numberCard == 13 || numberCard == 14) {
            return numberCard - 4;
        } else if (numberCard == 19 || numberCard == 20 || numberCard == 21 || numberCard == 22 || numberCard == 23) {
            return numberCard - 13;
        } else {
            return numberCard - 22;
        }

    }

    public static int winner(int playerPoint, int dealerPoint) {
        if (playerPoint == 21) {
            return 1;
        } else if (playerPoint <= dealerPoint) {
            return 0;
        }else {
            return 1;
        }
    }
}
