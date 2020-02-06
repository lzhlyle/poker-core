package com.lzhlyle.poker.core.card;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PokerBoxTest {

    @Test
    public void getCardsFromMultiBox() {
        List<PokerCard> cards = PokerBox.getCardsFromMultiBox(5);
        System.out.println(cards);
    }
}