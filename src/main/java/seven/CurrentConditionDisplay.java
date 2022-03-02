package seven;

public class CurrentConditionDisplay implements Observer{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.format("%s %s %s%n", temperature, humidity, pressure);
    }
}
