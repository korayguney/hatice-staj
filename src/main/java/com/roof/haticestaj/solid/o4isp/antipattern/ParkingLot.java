package com.roof.haticestaj.solid.o4isp.antipattern;

import com.roof.haticestaj.solid.o4isp.pitfall.Car;

public interface ParkingLot {

    double calculateFee(Car car); // Returns the price based on number of hours
    void doPayment(Car car) throws Exception;
}