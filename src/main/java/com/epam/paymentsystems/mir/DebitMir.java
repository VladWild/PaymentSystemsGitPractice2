package com.epam.paymentsystems.mir;

import com.epam.paymentsystems.cards.Card;

public class DebitMir extends Card implements Mir {
    private final static int[] TYPE = {2, 0, 4, 3, 7};

    @Override
    protected int getSystemNumber() {
        return SYSTEM;
    }

    @Override
    protected int[] getTypeCard() {
        return TYPE;
    }
}
