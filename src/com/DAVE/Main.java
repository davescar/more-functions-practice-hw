package com.DAVE;

import java.util.Random;
import java.lang.String;
import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        System.out.println("Hi there! I am a Magic 8-ball.\nTake a second and think of a YES or NO question for " +
                "me to answer...\nWhen you are ready, type 'SHAKE'");

        String option;

        Scanner plHiQu = new Scanner(System.in);
        option = plHiQu.nextLine();


        if (option.equals("shake")) {
            shakeTheBall();

        System.out.println("Please type a valid response.\n");
        }



    //generate random number 0-8

    public static int getRandomNumber() {

        Random numGen = new Random();
        int cpuHand = numGen.nextInt(9);
        return cpuHand;
    }

    // pick a response
    public static void shakeTheBall() {

        int choice = getRandomNumber();

        switch (choice) {
            case 0:
                System.out.println("** It is certain **");
                break;
            case 1:
                System.out.println("** It is decidedly so **");
                break;
            case 2:
                System.out.println("** Without a doubt **");
                break;
            case 3:
                System.out.println("** Yes, definitely **");
                break;
            case 4:
                System.out.println("** You may rely on it **");
                break;
            case 5:
                System.out.println("** Better not tell you now **");
                break;
            case 6:
                System.out.println("** Reply hazy try again **");
                break;
            case 7:
                System.out.println("** You're in luck **");
                break;
            case 8:
                System.out.println("** As I see it, yes **");
                break;
        }

}


