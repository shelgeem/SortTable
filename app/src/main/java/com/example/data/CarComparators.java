package com.example.data;

import java.util.Comparator;

/**
 * Created by TWPRUANHONG on 2017/3/9.
 */

public class CarComparators {
    public static Comparator<Car> getCarNameComparator() {
        return new CarNameComparator();
    }

    public static Comparator<Car> getCarPriceComparator() {
        return new CarPriceComparator();
    }

    public static class CarNameComparator implements Comparator<Car> {

        @Override
        public int compare(Car car1, Car car2) {
            return car1.getName().compareTo(car2.getName());
        }
    }

    public static class CarPriceComparator implements Comparator<Car> {

        @Override
        public int compare(Car car1, Car car2) {
            if (car1.getPrice()<car2.getPrice()) return -1;
            if (car1.getPrice()> car2.getPrice()) return  1;
            return 0;
        }
    }
}
