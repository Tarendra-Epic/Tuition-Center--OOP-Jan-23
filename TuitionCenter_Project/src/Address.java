public class Address{

    //Declare the data attributes
    private String unitNo;
    private String street;
    private String postcode;
    private String district;
    private String state;

    //Methods:
    public Address(String unitNo, String street, String postcode, String district, String state){

        this.unitNo = unitNo;
        this.street = street;
        this.postcode = postcode;
        this.district = district;
        this.state = state;
    }

    public String getFullAddress() {
        //return the full address
        return (this.unitNo + ", " + this.street + ", " + this.postcode + ", " + this.district + ", " + this.state);
    }

}
