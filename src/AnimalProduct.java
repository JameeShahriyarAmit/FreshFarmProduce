// OOP MINI PRJECT
//JAMEE SHAHRIYAR (A18CS3012)

import java.util.Scanner;

public class AnimalProduct extends Item{

    public AnimalProduct() {
        super("",0.00,null);
    }

    public AnimalProduct(String _itemName, double _itemPrice, Farmer f) {
        super(_itemName,_itemPrice,f);
    }


//----------------------------------------(Other Methods)----------------------------------


    public  void productReg() {
        Scanner sc = new Scanner (System.in);

        System.out.println("----------Fill in the information to register Animal produce that you want to sell---------------- ");

        System.out.println("Product Name: ");
        itemName=sc.nextLine();
        System.out.println("Product Price: ");

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



        farmer =new Farmer();
        farmer.input();


    }

    public  void printOut() {
        System.out.println("Animal Product Name     : " + itemName);
        System.out.println("Price           : " + itemPrice + " RM");
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