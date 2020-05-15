package com.cwfit.apply;

import com.cwfit.transport.impl.air.Airship;
import com.cwfit.user.Person;

import java.sql.Statement;
import java.util.Date;

/**
 * @author yeyike
 * @date 2020/5/15 - 12:37
 */
public class Apply {

    public static void main(String[]args){
        Person person = new Person("一个工程师");
        Airship airship = new Airship("必要时，飞艇能在那里停留数天以躲避危险。");
        person.setId("007");
        person.setP_Age(19);
        person.setP_Name("Aoury");
        person.setP_Sex("男");

        airship.setOwnership("Aoury");
        airship.setId("090");
        airship.setGPSPosition("hangzhou");
        Date date = new Date();
        airship.setDataOfPurchase(date);
        airship.setPrice("100000000$");

        person.driveMethod(airship);
        System.out.println(person);

    }
}
