package com.lzhlyle.poker.core.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 扑克盒
 */
public class PokerBox {
    /**
     * 从多个扑克盒中取牌
     *
     * @param boxCnt 盒子数
     * @return 所有牌
     */
    public static List<PokerCard> getCardsFromMultiBox(int boxCnt) {
        List<PokerCard> res = new ArrayList<>(boxCnt * 54);
        PokerBox box = new PokerBox();
        for (int i = 0; i < boxCnt; i++)
            res.addAll(box.getCards());
        return res;
    }

    private final PokerCard[] cards;

    /**
     * 一个扑克盒
     */
    public PokerBox() {
        cards = generatePokerCards();
    }

    private PokerCard[] generatePokerCards() {
        PokerCard[] res = new PokerCard[54];
        int i = 0;
        for (int v = 2; v <= 14; v++) {
            for (int c = 1; c <= 4; c++) {
                res[i++] = new PokerCard(c, v);
            }
        }
        res[i++] = new PokerCard(PokerCard.JOKER_SS);
        res[i] = new PokerCard(PokerCard.JOKER_SSS);
        return res;
    }

    /**
     * 取一副扑克牌
     *
     * @return
     */
    public List<PokerCard> getCards() {
        return new ArrayList<>(Arrays.asList(cards));
    }
}
