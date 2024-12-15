package com.aka.tubes_aka;

public class Candle {
    private double low;
    private double high;
    private double open;
    private double close;

    // Constructor
    public Candle(double low, double high) {
        this.low = low;
        this.high = high;
        this.open = open;
        this.close = close;
    }

    // Getters
    public double getLow() {
        return low;
    }

    public double getHigh() {
        return high;
    }

    public double getOpen() {
        return open;
    }

    public double getClose() {
        return close;
    }
}
