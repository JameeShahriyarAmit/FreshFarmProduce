// OOP MINI PROJECT
//JAMEE SHAHRIYAR (A18CS3012)


import java.util.Scanner;

public class Vegetable extends Item {

    public Vegetable() {
        super("", 0.00, null);
    }

    public Vegetable(String _itemName, double _itemPrice, Farmer f) {
        super(_itemName, _itemPrice, f);
    }

    //----------------------------------------(Other Methods)----------------------------------
    @Override
    public void productReg() {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Fill in the information to register Vegetable produce that you want to sell---------------- ");

        System.out.println("Vegetable Name: ");
        itemName = sc.nextLine();
        System.out.println("Vegetable Price: ");

        // exception implementation
        boolean validInput = false;
        double value = 0;
        do{

            try{
                value = Double.parseDouble(sc.nextLine());
                validInput = true;

            }catch(IllegalArgumentException e){
                System.out.println("This field requires you to input a number. Try again please by restarting. Thank you !\nVegetable Price  => ");
            }
        }while(!validInput);

        itemPrice=value;

        farmer=new Farmer();
        farmer.input();

    }

    @Override
    public void printOut() {



        System.out.println("Vegetable Name        : "+itemName);
        System.out.println("Price       : "+itemPrice + " RM");
        if (farmer.getFarmDistance() < 50) {
            deliveryCharge= shortDistancefee;

            System.out.println("Delivery Fee   :   " + deliveryCharge + "RM");
        } else {
            deliveryCharge=longDistanceFee;
            System.out.println("Delivery Fee   :   " + deliveryCharge + "RM");
        }



        farmer.display();

    }

//    public void product() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Fill in the information to register Vegetable produce that you want to sell - ");
//
//        System.out.println("Vegetable Name: ");
//        itemName = sc.nextLine();
//        System.out.println("Vegetable Price: ");
//        itemPrice = sc.nextDouble();
//
//
//        farmer.input();
//    }
//
//    public void print() {
//        farmer = new Farmer();
//        String t = farmer.toString();
//
//        System.out.println(itemName);
//        System.out.println(itemPrice);
//        if (farmer.getFarmDistance() < 50) {
//            System.out.println("Delivery Fee   :   " + shortDistancefee);
//        } else {
//            System.out.println("Delivery Fee   :   " + longDistanceFee);
//        }
//        System.out.println(t);
//    }
//;

}