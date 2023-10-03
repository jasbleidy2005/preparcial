package local.dto;

import java.io.Serializable;

public class ToyDTO implements Serializable {
    public Integer Id;
    private String toyname;
    private String toycategory;
    private String price;
    private double quantities;

    public ToyDTO(Integer id, String toyname, String toycategory, String price, double quantities) {
        Id = id;
        this.toyname = toyname;
        this.toycategory = toycategory;
        this.price = price;
        this.quantities = quantities;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getToyname() {
        return toyname;
    }

    public void setToyname(String toyname) {
        this.toyname = toyname;
    }

    public String getToycategory() {
        return toycategory;
    }

    public void setToycategory(String toycategory) {
        this.toycategory = toycategory;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public double getQuantities() {
        return quantities;
    }

    public void setQuantities(double quantities) {
        this.quantities = quantities;
    }

    @Override
    public String toString() {
        return "ToyDTO{" +
                "Id=" + Id +
                ", toyname='" + toyname + '\'' +
                ", toycategory='" + toycategory + '\'' +
                ", price='" + price + '\'' +
                ", quantities=" + quantities +
                '}';
    }
}
