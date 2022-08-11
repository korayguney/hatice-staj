package com.roof.haticestaj.solid.o5dip.antipattern;

public class Windows98Machine {
    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}

class TestDI {
    public static void main(String[] args) {
        Keyboard gamerKeyboard = new GamerKeyboard();
        Monitor ledMonitor = new LedMonitor();
        Windows98Machine machine1 = new Windows98Machine(gamerKeyboard, ledMonitor);

        Keyboard standartKeyboard = new StandardKeyboard();
        Monitor ipsMonitor = new IpsMonitor();
        Windows98Machine machine2 = new Windows98Machine(standartKeyboard, ipsMonitor);
    }
}