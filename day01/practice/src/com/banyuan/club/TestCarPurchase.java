package com.banyuan.club;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestCarPurchase {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {


        Repository volgswagon1 = new Repository(50);
//        Car car1 = new Car();
//        Car car2 = new Car();
//        Car car3 = new Car();
//
//        car1.setType("vw1");
//        car1.setType("vw2");
//        car1.setType("vw3");

        for (int i = 0; i < 3; i++) {
            Class clazz = Class.forName("com.banyuan.club.Car");
            Constructor con = clazz.getConstructor(String.class);

            Object obj = con.newInstance("vw" + i);

            volgswagon1.add_car((Car) obj);
        }

        volgswagon1.reduce_car("vw4");
        volgswagon1.show_cars();
    }
}
