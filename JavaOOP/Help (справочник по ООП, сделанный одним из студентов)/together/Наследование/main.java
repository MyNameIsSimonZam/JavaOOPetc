public class main {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот", "сфинкс");
        Cow cow = new Cow("Корова");
        System.out.println(cat);
        System.out.println(cow);
        // метод из абстрактного класса
        cat.foot();
        // переопределил метод из абстрактного класса
        cow.foot();
    }
}
