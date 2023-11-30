public class Driver extends People{
    private String nameCar;

    public Driver(String firstName, String secondName, String nameCar) {
        super(firstName, secondName);
        this.nameCar = nameCar;
    }

    public void drive(){
        System.out.println("Я из класса Driver");
    }

    @Override
    public void together(){
        System.out.println("Общий метод для Driver");
    }

    @Override
    public String toString() {
        return super.toString() + ", автомобиль: " + nameCar;
    }
}
