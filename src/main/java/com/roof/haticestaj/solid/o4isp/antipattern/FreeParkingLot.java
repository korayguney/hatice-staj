package com.roof.haticestaj.solid.o4isp.antipattern;

public interface FreeParkingLot {
    void parkCar();	// Decrease empty spot count by 1
    void unparkCar(); // Increase empty spots by 1
    void getCapacity();	// Returns car capacity
}
