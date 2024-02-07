package com.TeachMeSkills.task1.card;
/*
The class describes the VisaCard
 */
public class VisaCard extends BaseCard{

    public VisaCard(int cvv, long cardNumber, double amount) {
        super(cvv, cardNumber, amount);
        this.nameCard = "ВизаКарт";
    }


}
