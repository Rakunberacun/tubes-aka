package com.aka.tubes_aka;

public class Candle {
    public String tanggal;
    public double low;
    public double high;
    public double open;
    public double close;

    // Constructor
    public Candle(String tanggal, double low, double high) {
        this.tanggal = tanggal;
        this.low = low;
        this.high = high;
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
