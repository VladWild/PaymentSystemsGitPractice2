package com.epam.paymentsystems.cards.visa;

import com.epam.paymentsystems.cards.Card;

public class ElectronVisa extends Card implements Visa {
    private final static int[] TYPE = {4, 3, 9, 8, 4};

    @Override
    protected int getSystemNumber() {
        return SYSTEM;
    }

    @Override
    protected int[] getTypeCard() {
        return TYPE;
    }
}
