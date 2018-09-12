package com.example.ratul_pc.listview;

public class Product {

    private String mProductName;
    private String mProductPrice;
    private String mProductLocation;

    public Product(String mProductName, String mProductPrice, String mProductLocation) {
        this.mProductName = mProductName;
        this.mProductPrice = mProductPrice;
        this.mProductLocation = mProductLocation;
    }

    public String getmProductName() {
        return mProductName;
    }

    public void setmProductName(String mProductName) {
        this.mProductName = mProductName;
    }

    public String getmProductPrice() {
        return mProductPrice;
    }

    public void setmProductPrice(String mProductPrice) {
        this.mProductPrice = mProductPrice;
    }

    public String getmProductLocation() {
        return mProductLocation;
    }

    public void setmProductLocation(String mProductLocation) {
        this.mProductLocation = mProductLocation;
    }
}
