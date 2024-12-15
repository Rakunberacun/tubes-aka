window.onload = function () {
    fetch('/api/candles')
        .then(response => response.json())
        .then(candles => {
            let dataPoints = [];
            candles.forEach((candle, index) => {
                dataPoints.push({
                    x: new Date(2023, 0, index + 1), // Simulasi tanggal
                    y: [candle.open, candle.high, candle.low, candle.close] // Format candlestick
                });
            });

            var chart = new CanvasJS.Chart("chartContainer", {
                title: {
                    text: "Stock Prices Visualization"
                },
                axisY: {
                    title: "Prices",
                    prefix: "$",
                    includeZero: false
                },
                data: [{
                    type: "candlestick",
                    dataPoints: dataPoints
                }]
            });
            chart.render();
        })
        .catch(error => console.error("Error fetching data: ", error));
};
