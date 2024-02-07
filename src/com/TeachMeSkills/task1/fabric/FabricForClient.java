package com.TeachMeSkills.task1.fabric;
import com.TeachMeSkills.task1.client.Client;


import java.util.Scanner;
/*
The class is required to create objects of the class Client
 */
public class FabricForClient {

    public static String[] clientSetter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите своё имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите свою фамилию: ");
        String surname = scanner.nextLine();

        System.out.print("Введите свой возраст: ");
        String age = scanner.nextLine();
        return new String[]{name, surname, age};
    }

    public static Client createClient() {

        String[] clientPar = clientSetter();
        return new Client(clientPar[2], clientPar[0], clientPar[1]);


    }

}
