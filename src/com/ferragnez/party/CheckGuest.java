package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {
        String[] guestList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Parids Zarei", "Martina Maccherone", "Rachel Zeilic" };

        for (int i = 0; i < guestList.length; i++) {
            guestList[i] = guestList[i].trim().replace(" ", "-").toLowerCase();
        }

        Scanner input = new Scanner(System.in);

        String userAnswer;
        System.out.print("Inserisci il tuo nome e cognome: ");
        userAnswer = input.nextLine();
        input.close();

        String userAttempt = userAnswer.trim().replace(" ", "-").toLowerCase();

        boolean isAnEnvoy = false;
        int index = 0;

        /*
         * for (int i = 0; i < guestList.length; i++) {
         * if (userAttempt.equals(guestList[i])) {
         * isAnEnvoy = true;
         * }
         * }
         * 
         */

        while (!isAnEnvoy && index < guestList.length) {
            if (userAttempt.equals(guestList[index])) {
                isAnEnvoy = true;
            }
            index++;

        }

        if (isAnEnvoy) {
            System.out.println("L'utente è nella lista invitati");
        } else {
            System.out.println("L'utente non è nella lista degli invitati");
        }
    }

}
