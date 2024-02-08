package com.TeachMeSkills.task1.runner;

import com.TeachMeSkills.task1.card.BaseCard;
import com.TeachMeSkills.task1.client.Client;
import com.TeachMeSkills.task1.fabric.FabricForCard;
import com.TeachMeSkills.task1.fabric.FabricForClient;
import com.TeachMeSkills.task1.util.QuadraticEquation;

import java.util.Scanner;
/*
The class runs the written program
 */
public class Runner {
    public static void main(String[] args) {


        Client client = FabricForClient.createClient();
        System.out.println("   ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Клиент " + client.name + " " + client.surname + ". Введи количество желаемых карт: ");

        int k;

        if (scanner.hasNextInt()) {
            k = scanner.nextInt();
        } else {
            System.out.println("Неверное число.");
            return;
        }
        BaseCard[] card = new BaseCard[k];

        for (int i = 0; i < card.length; i++) {

            System.out.println("Введи тип желаемой карты:\n 1. БелКарт; 2. МастерКарт; 3. ВизаКарт;");
            int choice = scanner.nextInt();
            card[i] = FabricForCard.choiceCard(choice);
            System.out.println("Вы создали карту " + card[i].nameCard + " с номером " + card[i].cardNumber + ", CVV-кодом " + card[i].cvv + " и балансом " + card[i].amount + " условных единиц.\n");

        }
        scanner.close();
        int count = 0;

        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < i; j++)
                if (card[i].equals(card[j])) count++;
        }
        double[] solve = QuadraticEquation.solve(1, 1, -2 * count);

        if (count == 0) {
            System.out.println("Клиент " + client.name + " " + client.surname + " не имеет одинаковых карт!");
        } else {
            System.out.println("У клиента " + client.name + " " + client.surname + " " + (int) (solve[0] + 1) + " одинаковых карт.");
        }

    }

}
