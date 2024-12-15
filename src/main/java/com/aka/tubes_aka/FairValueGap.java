package com.aka.tubes_aka;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FairValueGap {

    public static List<Candle> generateCandles(int count) {
        List<Candle> candles = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            double high = 100 + random.nextDouble() * 200; // Random high between 100 and 300
            double low = 50 + random.nextDouble() * 150;   // Random low between 50 and 200
            candles.add(new Candle(high, low));
        }

        return candles;
    }
}
