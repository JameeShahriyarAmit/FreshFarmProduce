// OOP MINI PRJECT
//JAMEE SHAHRIYAR (A18CS3012)


public class Address {

    private String city;
    private String state;
    private String street;
    private String zip;


    public Address() {
        setAll("","","","");
    }

    public Address(String _city, String _state, String _street, String _zip) {
        setAll(_city, _state, _street, _zip);
    }

//-------------------------------Setters------------------------------------------

    public void setAll(String _city, String _state, String _street, String _zip) {
        city=_city;
        state=_state;
        street=_street;
        zip=_zip;
    }

    public void setCity(String _city) {
        city=_city;
    }

    public void setState(String _state) {
        state=_state;
    }

    public void setStreet(String _street) {
        street=_street;
    }

    public void setZip(String _zip) {
        zip=_zip;
    }

//-------------------------------Getters------------------------------------------

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public String getZip() {
        return zip;
    }



}
