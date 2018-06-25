package com.epam.paymentsystems.master;

import com.epam.paymentsystems.cards.Card;

public class ElectronicMaster extends Card implements MasterCard {
    private final static int[] TYPE = {2, 2, 1, 5, 6};

    @Override
    protected int getSystemNumber() {
        return SYSTEM;
    }

    @Override
    protected int[] getTypeCard() {
        return TYPE;
    }
}
