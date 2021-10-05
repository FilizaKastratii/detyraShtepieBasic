package ict.kosovo.growth.IfElseSwitch;

import java.util.Scanner;
public class NumriMeIMadh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("shkruani numrin e pare:");
        int numb1 = scan.nextInt();


        System.out.println("shkruani numrin e dyt:");
        int numb2 = scan.nextInt();

        System.out.println("Numri me i madh eshte  " + Math. max(numb1,numb2));
    }
}