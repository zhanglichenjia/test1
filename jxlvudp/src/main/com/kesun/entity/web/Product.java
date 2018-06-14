package kesun.entity.web;

import kesun.entity.AbsBusinessObject;

import java.math.BigDecimal;
import java.util.Date;


public class Product extends AbsBusinessObject {

    private String name;

    private float  price;

    private String description;

    private String bid;
    private String picture;

    private  Business bus = null;

    private static final long serialVersionUID = 1L;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Business getBus() { return bus; }

    public void setBus(Business bus) {
        this.bus = bus;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}