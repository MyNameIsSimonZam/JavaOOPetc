public class HotDrinkWithTemperature implements Product {
    private String name;
    private int volume;
    private int temperature;

    public HotDrinkWithTemperature(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}