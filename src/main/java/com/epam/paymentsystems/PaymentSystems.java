package com.epam.paymentsystems;

public class PaymentSystems {
    private String[] cards;

    private PaymentSystems(String[] cards) {
        this.cards = cards;
    }

    private void run() {
    }

    public static void main(String[] args) {
        PaymentSystems paymentSystems = new PaymentSystems(args);
        paymentSystems.run();
    }
}
