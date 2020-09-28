package Spil;

import java.util.Random;

public class DiceGame {

    private final int MAX = 6;

    //private int Dice;

    //public int UPDATE(int value){}

    Random r = new Random();

    int roll(){
        return r.nextInt(MAX) + 1;
    }


    public static void main(String[] args) {

        // Dice dice1 = new Dice();
        // Dice dice2 = new Dice();


        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);
        int value = dice1 + dice2;


        System.out.println("Terning 1 viser " + dice1 + " øjne.");
        System.out.println("Terning 2 viser " + dice2 + " øjne.");
        System.out.println("Summen af dit slag gav = " + value);

        int currentScore = value;
        System.out.println("Din score giver: " + currentScore);
        int newVal = 0;


        while (newVal <= 30){
            int d1 = (int) (Math.random() * 6 + 1);
            int d2 = (int) (Math.random() * 6 + 1);
            int valueCurrent = d1 + d2;
            //System.out.println(valueCurrent);
            newVal = newVal + valueCurrent;

            System.out.println("Terning 1 viser " + d1 + " og Terning 2 viser " + d2);

            System.out.print("din score er ");
            System.out.println(newVal + valueCurrent);
        }



//        int newValue;
//
//        newValue = d1.roll();
//        return newValue;
//        int secoundResult = d2.roll();
//
//        //UPDATE value = value + $newvalue;

    }
}
