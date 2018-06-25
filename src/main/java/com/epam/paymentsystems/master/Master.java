package com.epam.paymentsystems.master;

import com.epam.paymentsystems.cards.Card;

public class Master extends Card implements MasterCard{
    private final static int[] TYPE = {2, 5, 6, 7, 5};

    @Override
    protected int getSystemNumber() {
        return SYSTEM;
    }

    @Override
    protected int[] getTypeCard() {
        return TYPE;
    }
}
