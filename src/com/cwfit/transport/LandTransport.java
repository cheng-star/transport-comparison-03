package com.cwfit.transport;

import javax.xml.crypto.Data;

/**
 * @author yeyike
 * @date 2020/5/15 - 11:17
 */
public class LandTransport {

    private String ownership;
    private String GPSPosition;
    private Data dataOfPurchase;
    private String price;
    private String id;

    public LandTransport() {
    }

    public LandTransport(String describe) {
        System.out.println(describe);
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public Data getDataOfPurchase() {
        return dataOfPurchase;
    }

    public void setDataOfPurchase(Data dataOfPurchase) {
        this.dataOfPurchase = dataOfPurchase;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void drivingMethod(){
        System.out.println("陆行");
    }
}
