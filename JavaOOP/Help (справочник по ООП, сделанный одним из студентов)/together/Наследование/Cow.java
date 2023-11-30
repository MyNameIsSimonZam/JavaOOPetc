public class Cow extends Animal{
    public Cow(String nameAnimal) {
        super(nameAnimal);
    }

    @Override
    public void foot() {
        System.out.println("У меня 4 копыта");
    }
}
