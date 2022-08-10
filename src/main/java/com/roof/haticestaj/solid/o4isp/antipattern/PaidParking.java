package com.roof.haticestaj.solid.o4isp.antipattern;

import com.roof.haticestaj.solid.o4isp.pitfall.Car;

public class PaidParking implements PaidParkingLot {

    @Override
    public void parkCar() {

    }

    @Override
    public void unparkCar() {

    }

    @Override
    public void getCapacity() {

    }

    @Override
    public double calculateFee(Car car) {
        return 0;
    }

    @Override
    public void doPayment(Car car) throws Exception {

    }
}