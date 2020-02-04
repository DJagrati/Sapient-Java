public class Address{

    private String hno;
    private String street;
    private String city;
    private int zipcode;

    public Address(String hno, String street, String city, int zipcode){
        this.hno = hno;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    
}