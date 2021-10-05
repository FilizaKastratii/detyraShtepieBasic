package ict.kosovo.growth.IfElseSwitch;
import java.util.Scanner;
public class VijushmeriaNeProvim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sheno moshen:");
        int mosha = scan.nextInt();

        System.out.println("Sheno Gjinin 'Femer-F ndesa Mashkull-M");
        String gjinia = scan.next();

        System.out.println("Sheno statusin martesor (P ose J) ");
        String statusiMartesor = scan.next();

        if(gjinia.equals("F")){
            System.out.println("Do te punoni vetem ne zonat Urbane");
        }else if(gjinia.equals("M") && mosha<40 && mosha>21){
            System.out.println("Ju mund te punoni kudo");
        }else if(gjinia.equals("M") && mosha>40 && mosha<61){
            System.out.println("Ju mund te punoni vetem ne zonat rurale");
        }else{
            System.out.println("GABIM");
        }

    }
}
