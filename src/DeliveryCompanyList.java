// OOP MINI PRJECT
//JAMEE SHAHRIYAR (A18CS3012)

import java.util.Scanner;

public class DeliveryCompanyList {
    private DeliveryCompany [] deliverycompany;
    private int dNum;

    public DeliveryCompanyList () {
        deliverycompany = new DeliveryCompany [50];
        dNum=0;
    }

    public void addCompanyPreExisting(DeliveryCompany d) {
        deliverycompany[dNum]= new DeliveryCompany();
        deliverycompany[dNum++]=d;
    }

    public void addCompanyNew() {
        deliverycompany[dNum]= new DeliveryCompany();
        deliverycompany[dNum].input();
        dNum++;
    }

    public void printDeliveryOptions() {
        System.out.println("List of Delivery Companies");
        for(int i=0; i<dNum; i++) {


            System.out.println("\nCompany ID " + (i+1));
            deliverycompany[i].display();

        }
    }

    public DeliveryCompany companyChoice() {
        Scanner sc= new Scanner (System.in);

        System.out.println("Select the ID of delivery company you want rto complete order =>  ");

        int option = 0;

        // Use of Exception
        boolean validfInput = false;
        int value3 = 0;
        do{

            try{
                value3 = Integer.parseInt(sc.nextLine());
                validfInput = true;

            }catch(IllegalArgumentException e){
                System.out.println("This field requires you to input a number. Thank you.Try again => ");
            }
        }while(!validfInput);

        option=value3;

        return deliverycompany[option-1];
    }

}