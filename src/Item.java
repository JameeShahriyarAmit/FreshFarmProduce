// OOP MINI PRJECT
//JAMEE SHAHRIYAR (A18CS3012)




public abstract class Item implements DeliveryFee, Func{

    protected String itemName;
    protected double itemPrice;
    protected double deliveryCharge;
    protected Farmer farmer;



    public Item() {
        itemName="";
        itemPrice=0.0;
        farmer=null;
        deliveryCharge=0;

    }


    public Item(String _itemName,  double _itemPrice, Farmer f) {

        // TODO Auto-generated constructor stub
        itemName=_itemName;
        itemPrice=_itemPrice;

        farmer=f;
    }

    //------------------------------------------(Getters)---------------------------------------------

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getDeliveryCost() {
        return deliveryCharge;
    }

    public Farmer getFarmer() {
        return farmer;
    }


    //-------------------------------------------(Setters)---------------------------------------------
    public void setItemName(final String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(final double _itemPrice) {
        itemPrice=_itemPrice;
    }

    public void setFarmer(final Farmer f) {
        farmer=f;
    }

//------------------------------------------(other method)------------------------------------------\\

}