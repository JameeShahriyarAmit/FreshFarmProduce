// OOP MINI PRJECT
//JAMEE SHAHRIYAR (A18CS3012)


import java.util.Scanner;

public class Farmer extends User {
    private String farmName;
    private double farmDistance;




    public Farmer () {
        // TODO Auto-generated constructor stub
        super();
        farmName="";
        farmDistance=0.0;

    }


    public Farmer ( String n,String _city, String _state, String _street, String _zip, String _phoneNum, String _email, String _farmName, double _farmDis) {
        super(n, _city, _state, _street, _zip, _phoneNum,_email);
        farmName=_farmName;
        farmDistance=_farmDis;

    }


    //-----------------------------------------------------------(Getters)----------------------------------------------------------
    public String getFarmName() {
        return farmName;
    }

    public double getFarmDistance() {
        return farmDistance;
    }




    //---------------------------------------------------------(Setters)-----------------------------------------------------------
    public void setFarmName(String _fn) {
        farmName=_fn;
    }

    public void setFarmDistance(double _fd) {
        farmDistance=_fd;
    }





    //--------------------------------------------------------(other methods)-----------------------------------------------------


    @Override
    public void input() {
        Scanner sc=new Scanner (System.in);

        System.out.println("\n--------------Registration Farmer-----------------");
        super.input();
        System.out.println("Farm Name         =>");
        farmName=sc.nextLine();

        System.out.println("Farm Distance     =>");

// use of exception


        boolean validInput = false;
        double value = 0;
        do{

            try{
                value = Double.parseDouble(sc.nextLine());
                validInput = true;

            }catch(IllegalArgumentException e){
                System.out.println("This field requires you to input a number. Try again please by restarting. Thank you !\nFirm Distance  => ");
            }
        }while(!validInput);

        farmDistance=value;

    }



    @Override
    public String toString() {
        return super.toString()+ "\nFarm Name:  " + farmName + "\nFarm Distance:  " + farmDistance + "\n\n";
    }

    public void display() {
        System.out.println("Farm Name:" + farmName + "\nFarm distance: " + farmDistance + " km" );

    }

}

	