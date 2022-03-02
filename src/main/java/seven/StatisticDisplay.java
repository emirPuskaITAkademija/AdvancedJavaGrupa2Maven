package seven;

import java.util.ArrayList;
import java.util.List;

public class StatisticDisplay implements Observer{

    private List<Float> temps = new ArrayList<>();
    private List<Float> humidities = new ArrayList<>();
    private List<Float> pressures = new ArrayList<>();
    @Override
    public void update(float temperature, float humidity, float pressure) {
        temps.add(temperature);
        humidities.add(humidity);
        pressures.add(pressure);
        float tempAvg = average(temps);
        float humidityAvg = average(humidities);
        float pressureAvg = average(pressures);
        System.out.format("Average( temp: %s, humidity: %s, pressure: %s)%n", tempAvg, humidityAvg, pressureAvg);
    }

    private float average(List<Float> values){
        float sum = 0;
        for(float value: values){
            sum = sum+value;
        }
        float avg = sum/ values.size();
        return avg;
    }
}
