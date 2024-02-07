package com.TeachMeSkills.task1.card;

import java.util.Objects;
/*
The class describes the basic client card
 */
public abstract class BaseCard {
    public int cvv;
    public long cardNumber;
    public double amount;
    public String nameCard;

    public BaseCard(int cvv, long cardNumber, double amount) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        BaseCard baseCard = (BaseCard) o;
        return cvv == baseCard.cvv && cardNumber == baseCard.cardNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, cardNumber);
    }
}
