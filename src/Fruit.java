// OOP MINI PRJECT
//JAMEE SHAHRIYAR (A18CS3012)



//item already implements

import java.util.Scanner;

public class Fruit extends Item{

    public Fruit() {
        super("", 0.00, null);

    }

    public Fruit(String _itemName, double _itemPrice, Farmer f) {
        super(_itemName, _itemPrice, f);

    }

    //------------------------------------(Other Methods)-----------------------------
    @Override
    public void productReg() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------Fill in the information to register Fruit produce that you want to sell----------- ");

        System.out.println("Fruit Name: ");
        itemName = sc.nextLine();
        System.out.println("Fruit Price: ");

        // exception implementation
        boolean validInput = false;
        double value = 0;
        do{

            try{
                value = Double.parseDouble(sc.nextLine());
                validInput = true;

            }catch(IllegalArgumentException e){
                System.out.println("This field requires you to input a number. Try again please by restarting. Thank you !\nFruit Price  => ");
            }
        }while(!validInput);

        itemPrice=value;


        farmer=new Farmer();
        farmer.input();
    }


    @Override
    public void printOut() {



        System.out.println("Fruit Name     : " + itemName);
        System.out.println("Price          : " + itemPrice + " RM");
        if (farmer.getFarmDistance() < 50) {
            deliveryCharge= shortDistancefee;

            System.out.println("Delivery Fee   :   " + deliveryCharge + "RM");
        } else {
            deliveryCharge=longDistanceFee;
            System.out.println("Delivery Fee   :   " + deliveryCharge + "RM");
        }
        farmer.display();

    }
}