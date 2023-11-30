// родительский класс для классов наследников Worker и Driver
public class People {
    private String firstName;
    private String secondName;

    public People(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void man(){
        System.out.println("Я из класса People");
    }

    // создадим один метод для нескольких классов и посмотрим на его поведение
    public void speak(){
        System.out.println("Я из класса People");
    }

    public void together(){
        System.out.println("Общий метод для People");
    }

    @Override
    public String toString() {
        return "имя: " + firstName + ", отчество: " + secondName;
    }
}
