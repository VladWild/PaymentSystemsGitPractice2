package com.epam.paymentsystems.cards.visa;

import com.epam.paymentsystems.cards.Card;

public class GoldVisa extends Card implements Visa {
    private final static int[] TYPE = {7, 9, 7, 3, 8};

    @Override
    protected int getSystemNumber() {
        return SYSTEM;
    }

    @Override
    protected int[] getTypeCard() {
        return TYPE;
    }
}
