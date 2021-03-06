package com.lzhlyle.poker.core.card;

import java.util.Objects;

/**
 * 单张扑克牌
 */
public class PokerCard implements Comparable<PokerCard> {
    private int color, value;

    /**
     * 花色
     */
    public static final int JOKER_SSS = 6; // 大王
    public static final int JOKER_SS = 5; // 小王
    public static final int COLOR_SPADE = 4; // 黑桃
    public static final int COLOR_HEART = 3; // 红桃
    public static final int COLOR_CLUB = 2; // 梅花
    public static final int COLOR_DIAMOND = 1; // 方块

    /**
     * 花色扑克
     *
     * @param color
     * @param value
     */
    public PokerCard(int color, int value) {
        this.color = color;
        this.value = value;
    }

    /**
     * 扑克王
     *
     * @param joker
     */
    public PokerCard(int joker) {
        this.color = joker;
        this.value = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokerCard pokerCard = (PokerCard) o;
        return this.color == pokerCard.color && this.value == pokerCard.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, value);
    }

    @Override
    public int compareTo(PokerCard card) {
        // value first
        int valueCompare = Integer.compare(this.value, card.value);
        if (valueCompare != 0) return valueCompare;

        // color second
        return Integer.compare(this.color, card.color);
    }

    @Override
    public String toString() {
        return getColorString(color) + getValueString(value);
    }

    private String getColorString(int color) {
        switch (color) {
            case PokerCard.COLOR_SPADE:
                return "♠";
            case PokerCard.COLOR_HEART:
                return "♥";
            case PokerCard.COLOR_CLUB:
                return "♣";
            case PokerCard.COLOR_DIAMOND:
                return "♦";
            case PokerCard.JOKER_SSS:
                return "SSS";
            case PokerCard.JOKER_SS:
                return "SS";
            default:
                return "Err";
        }
    }

    private String getValueString(int value) {
        switch (value) {
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            case 14:
                return "A";
            case 0:
                return "";
            default:
                return String.valueOf(value);
        }
    }

    public int getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }
}
