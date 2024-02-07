package com.TeachMeSkills.task1.card;
/*
The class describes the MasterCard
 */
public class MasterCard extends BaseCard{

    public MasterCard(int cvv, long cardNumber, double amount) {
        super(cvv, cardNumber, amount);
        this.nameCard = "МастерКарт";
    }


}
