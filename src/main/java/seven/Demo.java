package seven;

public class Demo {
    public static void main(String[] args) {
        WeatherStation subject = new WeatherStation();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        subject.subscribe(currentConditionDisplay);
        subject.setMeasurement(4, 234, 100);
        StatisticDisplay statisticDisplay = new StatisticDisplay();
        subject.subscribe(statisticDisplay);
        subject.setMeasurement(5, 218, 97);
    }
}
