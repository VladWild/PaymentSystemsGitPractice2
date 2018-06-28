package com.epam.paymentsystems.cards.master;

import com.epam.paymentsystems.cards.Card;

public class MaestroMaster extends Card implements MasterCard{
    private final static int[] TYPE = {2, 2, 1, 8, 8};

    @Override
    protected int getSystemNumber() {
        return SYSTEM;
    }

    @Override
    protected int[] getTypeCard() {
        return TYPE;
    }
}
