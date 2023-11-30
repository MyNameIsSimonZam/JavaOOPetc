public class Cat extends Animal{
    private String poroda;

    public Cat(String nameAnimal, String poroda) {
        super(nameAnimal);
        this.poroda = poroda;
    }

    @Override
    public String toString() {
        return super.toString() + ", порода: " + poroda;
    }
}
