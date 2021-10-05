package ict.kosovo.growth.IfElseSwitch;

import java.util.Scanner;

public class katrori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("shkruani gjatesin e drejtkendeshit:");
        double gjatesia = scan.nextDouble();


        System.out.println("shkruani gjeresin e drejtkendeshit:");
        double gjersia = scan.nextDouble();

        if(gjatesia==gjersia){
            System.out.println("Eshte Katror");
        }else {
            System.out.println("nuk eshte katror");

        }

    }
}