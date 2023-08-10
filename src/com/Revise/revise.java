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

        //*LogIn OR SignUp*//
        Scanner User = new Scanner(System.in);
        System.out.println("Do you want to Log in OR you want to Sign up? Reply 1 if you want to log in and 2 if you want to Sign up: ");
        int userS = User.nextInt();
        
        if(userS == 1){


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


        } else {
            
            //*New Account*//
            Scanner NewCardNumIN = new Scanner(System.in);
            System.out.println("Your card number: ");
            BigInteger NewCardNum = NewCardNumIN.nextBigInteger();
            
            //*New Pin Code*//            
            Scanner NewPinCodeIn = new Scanner(System.in);
            System.out.println("Your pin code: ");
            int NewPinCode = NewPinCodeIn.nextInt();
            
            //*Collecting Balance*//
            Scanner NewBalanceIn = new Scanner(System.in);
            System.out.println("Your Balance: ");
            int NewBalance = NewBalanceIn.nextInt();
            
            
            
            
            //*Logging in after Signing up*//
            System.out.println("Congratulation!! you have Signed up now you can log in to your account");

            //New card number
            Scanner NewCardLoggingScan = new Scanner(System.in);
            System.out.println("Your card number: ");
            BigInteger NewCardLogging = NewCardLoggingScan.nextBigInteger();
            
            //New pin code
            Scanner NewPinCodeScan = new Scanner(System.in);
            System.out.println("Your Pin Code: ");
            int NewPinCodeLogging = NewPinCodeScan.nextInt();
            
            //Logging process
            
            if(NewCardLogging.equals(NewCardNum) && NewPinCodeLogging == NewPinCode){
                System.out.println("Welcome!! your Net Balance is: " + NewBalance + " Qatari riyals");
            } else if (!(NewCardLogging.equals(NewCardNum))&& NewPinCodeLogging == NewPinCode) {
                System.out.println("Your new card number is wrong!! please try again...");
            } else if (NewCardLogging.equals(NewCardNum) && !(NewPinCodeLogging == NewPinCode)) {
                System.out.println("Your new pin code is not correct :(. please try again...");
            }


        }
        
       

    }
}
