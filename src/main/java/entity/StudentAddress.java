package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentAddress {
    @Column(name ="country")
    private String country;
    @Column(name ="city")
    private String city;
    @Column(name ="address")
    private int address;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }
}
