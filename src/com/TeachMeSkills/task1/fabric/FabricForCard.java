package com.TeachMeSkills.task1.fabric;

import com.TeachMeSkills.task1.card.*;

import java.util.Scanner;
/*
The class is required to create objects of the class BaseCard
 */
public class FabricForCard {

    public static double[] parSetter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи CVV-код карты: ");
        double cvv = scanner.nextDouble();

        System.out.print("Введи номер карты: ");
        double cardNum = scanner.nextDouble();

        System.out.print("Введи начальный баланс карты: ");
        double amount = scanner.nextDouble();
        return new double[]{cvv, cardNum, amount};
    }

    public static BaseCard choiceCard(int a) {

        double[] par = parSetter();

        if (a == 1) return new BelCard((int) par[0], (long) par[1], par[2]);
        if (a == 2) return new MasterCard((int) par[0], (long) par[1], par[2]);
        if (a == 3) return new VisaCard((int) par[0], (long) par[1], par[2]);
        else return null;

    }
}
