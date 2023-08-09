package com.Revise;
import java.util.Scanner;
import java.math.BigInteger;
public class revise {
    public static void main(String[] args){

        //*The main details*//
        BigInteger cardNumber = new BigInteger("1234567891011121314");
        int PinCode = 1234;
        int Balance = 15350;

        //*Collecting entering details*//

        //Card Number
        Scanner cardNumIn = new Scanner(System.in);
        System.out.println("Your card number: ");
        BigInteger cardNumberIn = cardNumIn.nextBigInteger();

        //PinCode
        Scanner PinCodeIn = new Scanner(System.in);
        System.out.println("Your Pin code please: ");
        int PinCodeIN = PinCodeIn.nextInt();



        //*The main process*//

        if(cardNumber.equals(cardNumberIn) && PinCode==PinCodeIN){
            System.out.println("Welcome!! your net balance is: " + Balance + " Qatari riyals");
        } else if (!(cardNumber.equals(cardNumberIn)) && PinCode==PinCodeIN) {
            System.out.println("There is no account for this card number please double check the number you entered :( ");
        } else if (cardNumber.equals(cardNumberIn) && !(PinCode==PinCodeIN)) {
            System.out.println("You have entered wrong pin!! please try again...");
        }


    }
}
