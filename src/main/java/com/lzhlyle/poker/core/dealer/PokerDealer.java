package com.lzhlyle.poker.core.dealer;

import com.lzhlyle.poker.core.card.PokerCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 发牌者
 */
public class PokerDealer {
    private static PokerDealer ourInstance = new PokerDealer();

    public static PokerDealer getInstance() {
        return ourInstance;
    }

    private PokerDealer() {

    }

    /**
     * 洗牌
     *
     * @param cards
     */
    public void shuffle(List<PokerCard> cards) {
        Collections.shuffle(cards);
    }

    /**
     * 发牌
     *
     * @param cards
     * @param n     发牌张数
     * @return
     */
    public List<PokerCard> deal(List<PokerCard> cards, int n) {
        if (n < 1 || n > cards.size()) throw new ArrayIndexOutOfBoundsException(n);
        List<PokerCard> res = new ArrayList<>(n);
        for (int i = 0; i < n; i++) res.add(cards.remove(0)); // always the top
        return res;
    }
}
