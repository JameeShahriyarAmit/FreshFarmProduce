// OOP MINI PRJECT

import java.util.Scanner;
import java.util.ArrayList;

public class RegistrationTransaction {

    public static void main(String[] args) {



        double cost [];
        double deliveryPrice[];

        double totalPrice=0;
        double totalDeliveryCharge=0;
        double netTotal=0;

        cost=new double[100];
        deliveryPrice = new double [100];

        int costNum=0;
        int delNum=0;


        // An array to store all the items
        ArrayList <Item> arrList = new ArrayList<Item> ();



        Farmer f1 = new Farmer("Sharif Ahmad", "Perai", " Pulau Pinang", " Lebuh Kurau", "13700", "01165983265", "sharif@yahoomail.com", "Sharif's Farm",23);
        Farmer f2 = new Farmer("Mustak Ahmad", "Mukim Bacang", "Kawasan Perindustrian", "Lot 7", "75250", "066358945", "freefarm@gmail.com", "Fresh Farm", 9);
        Farmer f3 = new Farmer("Shafkat Rahman", "Johor Bahru", "Johor", "Taman Jaya", "81100", "01163894545", "shafkat@gmail.com", "Shafkat's Farm",82);
        Farmer f4 = new Farmer("Aireen Ahmad", "Seremban", "Negeri Sembilan", "309 Rasah", "70300", "01168946513", "aireen@ymail.com", "Aireen's Garden",12);

        // ----------------------------------- (already registered
        // items)----------------------------------------
        Fruit fr1 = new Fruit("Apples", 11, f1);
        Fruit fr2 = new Fruit("Rambutan", 8, f4);
        Fruit fr3 = new Fruit("Mango", 14, f4);
        Fruit fr4 = new Fruit("Pinaapple", 8, f1);


        Lists<Fruit> fList = new Lists<Fruit>();
        fList.addPreExisting(fr1);
        fList.addPreExisting(fr2);
        fList.addPreExisting(fr3);
        fList.addPreExisting(fr4);

//		fList.printList("\n\n-----------List of Fruits Available for sale--------", "\nFruit ID ");



        Vegetable v1 = new Vegetable("Carrots", 6, f3);
        Vegetable v2 = new Vegetable("Eggplants", 9, f2);
        Vegetable v3 = new Vegetable("Tomatos", 8, f3);
        Vegetable v4 = new Vegetable("Potatoes", 7, f1);



        Lists <Vegetable> vList = new Lists <Vegetable>();

        vList.addPreExisting(v1);
        vList.addPreExisting(v2);
        vList.addPreExisting(v3);
        vList.addPreExisting(v4);

//		vList.printList("\n\n-----------List of Vegetables Available for sale--------", "\nVegetable ID ");

        AnimalProduct ap1 = new AnimalProduct("Milk", 9.5, f4);
        AnimalProduct ap2 = new AnimalProduct("Eggs", 11.5, f3);
        AnimalProduct ap3 = new AnimalProduct("Salmon fish", 12, f2);
        AnimalProduct ap4 = new AnimalProduct("chicken", 9.5, f3);

        Lists <AnimalProduct> aList= new Lists <AnimalProduct>();
        aList.addPreExisting(ap1);
        aList.addPreExisting(ap2);
        aList.addPreExisting(ap3);
        aList.addPreExisting(ap4);

//		aList.printList("\n\n-----------List of Animal Products Available for sale--------", "\nAnimal Product ID ");

        // -------------------------- pre-registered Delivery
        // Companies----------------------------------

        DeliveryCompany d1 = new DeliveryCompany("Rabbi Islam", "Johor Bahru", "Johor", "Taman Jaya", "81100", "01168956487", "fastdelivery@gmail.com", "Fast Delivery");

        DeliveryCompany d2 = new DeliveryCompany("Ahnaf Tajwar", "Perai", " Pulau Pinang", " Lebuh Kurau", "13700", "0116598595","expresstransport@gmail.com", "Express TRansport");
        DeliveryCompany d3 = new DeliveryCompany("Aswad Aktar", "Mukim Bacang", "Kawasan Perindustrian", "Lot 7", "75250", "01168995634", "rapd@gmail.com",	"Rapid Del");



        DeliveryCompanyList dList = new DeliveryCompanyList();
        dList.addCompanyPreExisting(d1);
        dList.addCompanyPreExisting(d2);
        dList.addCompanyPreExisting(d3);


        int option =0;

        do {

            System.out.println("-----------------Select the action you want to perform--------------------- =>");
            System.out.println("1. For (User) Farmers : Register Produce you want to sell !!");
            System.out.println("2. For (User) Delivery Company : Register your company into our system !!");
            System.out.println("3. For (User) Customer: Make an ORDER !!");
            System.out.println("4. Enter 4 to EXIT");
            System.out.println("Select 1,2,3 or 4=>");

            Scanner sc = new Scanner(System.in);

            // Use of Exception
            boolean validInput = false;
            int value = 0;
            do{

                try{
                    value = Integer.parseInt(sc.nextLine());
                    validInput = true;

                }catch(IllegalArgumentException e){
                    System.out.println("This field requires you to input a number. Thank you.Select 1,2,3,4 or 5 => ");
                }
            }while(!validInput);



            option = value;

            switch (option) {

                case 1:
                    int choice=0;

                    do {
                        System.out.println("\n----------------------------------------------------------- HELLO FARMER ---------------------------------------------------------");
                        System.out.println("\n-------------Select the type of product you want to register-----------");
                        System.out.println("  1. Fruit");
                        System.out.println("  2. Vegetables");
                        System.out.println("  3. Animal Produce");
                        System.out.println("  9. Exit");
                        System.out.println("Select 1,2,3 or 9 =>");

                        Scanner input = new Scanner(System.in);

                        // Use of Exception
                        boolean validdataInput = false;
                        int value2 = 0;
                        do{

                            try{
                                value2 = Integer.parseInt(sc.nextLine());
                                validdataInput = true;

                            }catch(IllegalArgumentException e){
                                System.out.println("This field requires you to input a number. Thank you.Select 1,2,3 or 9 =>  ");
                            }
                        }while(!validdataInput);

                        choice=value2;



                        switch (choice) {

                            case 1:
                                fList.addNew(new Fruit());
                                break;

                            case 2:
                                vList.addNew(new Vegetable());
                                break;

                            case 3:
                                aList.addNew(new AnimalProduct());
                                break;

                        }
                    } while (choice != 9);

                    break;

                case 2:
                    System.out.println("\n------------------------------------------------------ HELLO Delivery Company Owner --------------------------------------------------------");
                    dList.addCompanyNew();

                    break;

                case 3:
                    System.out.println("\n\n-------------------------------------- HELLO CUSTOMER!!!------------------------------------------");
                    Scanner n = new Scanner(System.in);
                    int op =0;

                    Customer cList =new Customer();
                    cList.input();

                    DeliveryCompany d = new DeliveryCompany();



                    do {





                        System.out.println("\n-------------Select the type of produce you want to buy------------");
                        System.out.println("  1. Fruit");
                        System.out.println("  2. Vegetables");
                        System.out.println("  3. Animal Produce");
                        System.out.println("  4. Exit (If you donot want to purchase more items)");
                        System.out.println("Select 1,2,3 or 4 =>");


                        // Use of Exception
                        boolean validfInput = false;
                        int value3 = 0;
                        do{

                            try{
                                value3 = Integer.parseInt(sc.nextLine());
                                validfInput = true;

                            }catch(IllegalArgumentException e){
                                System.out.println("This field requires you to input a number. Thank you.Select 1,2,3 or 4 => ");
                            }
                        }while(!validfInput);

                        op=value3;


                        switch (op) {

                            case 1:

                                fList.printList("\n\n-----------List of Fruits Available for sale--------", "\nFruit ID ");
                                Fruit fruitItem = new Fruit();
                                fruitItem = fList.choice("\nSelect the ID of fruit that you want to purchase=>");


                                arrList.add(fruitItem);

                                break;

                            case 2:

                                vList.printList("\n\n-----------List of Vegetables Available for sale--------", "\nVegetable ID ");
                                Vegetable vegetableItem = new Vegetable();
                                vegetableItem = vList.choice("\nSelect the ID of vegetable that you want to purchase=>");


                                arrList.add(vegetableItem);


                                break;

                            case 3:
                                aList.printList("\n\n-----------List of Animal Products Available for sale--------", "\nAnimal Product ID ");
                                AnimalProduct animalItem = new AnimalProduct();
                                animalItem = aList.choice("\nSelect the ID of Animal Product that you want to purchase=>");

                                arrList.add(animalItem);


                                break;

                        }

//					totalPrice+=cost[costNum];
//					totalDeliveryCharge+=deliveryPrice[delNum];
//					
//					costNum++;

                    }while (op != 4);

                    System.out.println("<==-Select a Delivery Company from the following list of delivery companies to deliver your product-==>");
                    dList.printDeliveryOptions();//
                    d = dList.companyChoice();


                    System.out.println("\n\n------------------------------------------------------------(( ORDER RECEIPT ))------------------------------------------------------------ \n");
                    System.out.println("\n---Customer details---\n");
                    String c=cList.toString();
                    System.out.println(c);


                    System.out.println("--Delivery details--");
                    System.out.println("Will be delivered by : " + d.getCompanyName());

                    System.out.println("\n\n----Item details---- \n");
                    System.out.println("Items Bought\t\tFarm Name\t\tPrice");
                    System.out.println("------------\t\t-----\t\t---------");

                    for(int i=0; i< arrList.size(); i++) {
                        System.out.println(arrList.get(i).itemName +"\t\t\t" + arrList.get(i).getFarmer().getFarmName() + "\t\t\t" + arrList.get(i).itemPrice );

                        totalPrice+=arrList.get(i).getItemPrice();
                        totalDeliveryCharge+=arrList.get(i).getDeliveryCost();
                    }

                    System.out.println(" The Total price of all Items bought              : " + totalPrice + " RM");
                    System.out.println(" The Total delivery charge of all Items bought    : " + totalDeliveryCharge + "  RM");

                    netTotal=totalPrice+totalDeliveryCharge;
                    System.out.println("                                      Net Total   : " + netTotal + " RM");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------\n\n");

                    break;




            }
        }while (option != 4);

    }

}