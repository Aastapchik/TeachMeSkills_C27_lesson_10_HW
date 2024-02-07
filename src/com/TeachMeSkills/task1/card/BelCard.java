package com.TeachMeSkills.task1.card;
/*
The class describes the Belcard
 */
public class BelCard extends BaseCard{

    public BelCard(int cvv, long cardNumber, double amount) {
        super(cvv, cardNumber, amount);
        this.nameCard = "БелКарт";
    }

}
