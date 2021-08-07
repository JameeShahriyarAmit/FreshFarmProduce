// OOP MINI PRJECT
//JAMEE SHAHRIYAR (A18CS3012)


public class Customer extends User {

    public Customer() {
        // TODO Auto-generated constructor stub
        super();
    }

    public Customer( String n , String _city, String _state, String _street, String _zip, String _phone, String _email) {
        super( n, _city, _state, _street, _zip,_phone, _email);
    }



    //-------------------------------(Other Methods)------------------
    @Override
    public void input() {
        System.out.println("\n\n---------------Fill in your information to make ORDER ---------------");
        super.input();
    }

    @Override
    public String toString() {
        return  super.toString()+ "\n\n";
    }

    public void display() {
        System.out.println("");
    }


}