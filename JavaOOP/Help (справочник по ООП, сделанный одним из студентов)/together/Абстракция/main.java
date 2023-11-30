public class main {
    public static void main(String[] args) {
        User user = new User("Василий");
        System.out.println(user);
        user.sound();
    }
}









// абстрактный класс
// есть поля и методы
// если метод абстрактный, то у него нет тела -> public abstract void sound();
// в классах наследниках методы переопределены с помощью @Override, причем переопределить нужно в каждом наследнике, если у нас цепочка наследников 
// Animal -> Predator -> Bear, то переопределить метод можно в любом из наследников

// интерфейс
// полей нет, есть только методы без тела -> public void sound();
// переопределяем методы без @Override в каждом классе, который imolements от интерфейса
