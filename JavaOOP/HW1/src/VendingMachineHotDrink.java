import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrink implements VendingMachine {
    private List<HotDrinkWithTemperature> drinks;

    public VendingMachineHotDrink() {
        drinks = new ArrayList<>();
        // Initialize the list of drinks here
    }

    public void addDrink(HotDrinkWithTemperature drink) {
        drinks.add(drink);
    }

    @Override
    public Product getProduct(String name, int volume, int temperature) {
        for (HotDrinkWithTemperature drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }
}