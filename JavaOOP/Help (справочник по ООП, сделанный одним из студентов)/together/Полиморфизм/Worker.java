public class Worker extends People{
    private String nameFactory;

    public Worker(String firstName, String secondName, String nameFactory) {
        super(firstName, secondName);
        this.nameFactory = nameFactory;
    }

    public void work(){
        System.out.println("Я из класса Worker");
    }

    // такой метод уже создавали в родительском классе People
    @Override
    public void speak(){
        System.out.println("Я из класса Worker");
    }

    @Override
    public void together(){
        System.out.println("Общий метод для Worker");
    }

    @Override
    public String toString() {
        return super.toString() + ", завод: " + nameFactory;
    }
}
