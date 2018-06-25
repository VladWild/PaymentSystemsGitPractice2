package com.epam.paymentsystems.cards;

public abstract class Card {
    private static final int COUNT_DIGITS = 16;

    private int[] number;

    public Card() {
        formationNumber();
    }

    private void paymentSystem() {
        number[0] = getSystemNumber();
    }

    private void typeCard() {
        int[] typeCard = getTypeCard();
        System.arraycopy(typeCard, 0, number, 1, typeCard.length);
    }

    private void bankIdentifier() {
        paymentSystem();
        typeCard();
    }

    private void identificationNumber() {
        int[] digit = new int[9];
        System.arraycopy(digit, 0, number, 6, digit.length);
    }

    private void checkNumber() {
        number[COUNT_DIGITS - 1] = 0;
    }

    private void uniqueNumber() {
        identificationNumber();
        checkNumber();
    }

    private void formationNumber() {
        number = new int[COUNT_DIGITS];
        bankIdentifier();
        uniqueNumber();
    }

    abstract protected int getSystemNumber();

    abstract protected int[] getTypeCard();

    public int[] getNumber() {
        return number;
    }
}

