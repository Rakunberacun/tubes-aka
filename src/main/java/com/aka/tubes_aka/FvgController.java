package com.aka.tubes_aka;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FvgController {

    @GetMapping("/api/candles")
    public List<Candle> getCandlestickData() {
        List<Candle> candles = new ArrayList<>();
        candles.add(new Candle(1500, 1800));
        candles.add(new Candle(1600, 2000));
        candles.add(new Candle(1700, 2200));
        candles.add(new Candle(1800, 2300));
        candles.add(new Candle(1900, 2400));
        return candles;
    }
}
