public class main {
    public static void main(String[] args) {
        HotDrinkWithTemperature tea = new HotDrinkWithTemperature("Чай", 200, 70);
        HotDrinkWithTemperature coffee = new HotDrinkWithTemperature("Кофе", 250, 85);

        VendingMachineHotDrink vendingMachine = new VendingMachineHotDrink();

        vendingMachine.addDrink(tea);
        vendingMachine.addDrink(coffee);

        HotDrinkWithTemperature selectedDrink = (HotDrinkWithTemperature) vendingMachine.getProduct("Кофе", 250, 85);

        if (selectedDrink != null) {
            System.out.println("Выбран напиток: " + selectedDrink.getName());
            System.out.println("Объем: " + selectedDrink.getVolume() + " мл");
            System.out.println("Температура: " + selectedDrink.getTemperature() + "°C");
        } else {
            System.out.println("Напиток не найден.");
        }
    }
}