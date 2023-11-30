public class User extends Personal{
    private int id;

    public User(String name, int id) {
        super(name);
        this.id = id;
    }

    // переопределяем абстрактный метод для нашего класса User
    @Override
    public void sound(){
        System.out.println("Я из класса User");
    }

    @Override
    public String toString() {
        return super.toString() + ", id: " + id;
    }
}
