package com.cwfit.transport;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author yeyike
 * @date 2020/5/15 - 11:19
 */
public class AirTransport {

    private String ownership;
    private String GPSPosition;
    private Date dataOfPurchase;
    private String price;
    private String id;

    public AirTransport() {
    }

    public AirTransport(String describe) {
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

    public Date getDataOfPurchase() {
        return dataOfPurchase;
    }

    public void setDataOfPurchase(Date dataOfPurchase) {
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
        System.out.println("飞行");
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "ownership='" + ownership + '\'' +
                ", GPSPosition='" + GPSPosition + '\'' +
                ", dataOfPurchase=" + dataOfPurchase +
                ", price='" + price + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
