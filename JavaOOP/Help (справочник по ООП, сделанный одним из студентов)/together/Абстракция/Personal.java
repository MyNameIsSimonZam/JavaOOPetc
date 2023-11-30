// если класс абстрактный - то нельзя создать экземпляр этого класса
public abstract class Personal{
    protected String name;

    // либо нужно создать дефолтный конструктор (6, 7 строки)
    // либо нужно у каждого наследника создавать конструктор
    public Personal() {
    }

    public Personal(String name) {
        this.name = name;
    }

    // абстрактный метод
    // если нет экземпляра класса, то и вызвать метод
    // у этого класса мы не можем

    // мы должны у каждого наследника переопределить 
    // абстранктный метод
    public abstract void sound();

    @Override
    public String toString() {
        return "имя: " + name;
    }
}
    
    

