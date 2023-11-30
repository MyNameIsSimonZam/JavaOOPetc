public class main {
    public static void main(String[] args) {
        User user = new User("Виктор");

        // если бы поле userAge было public, мы бы задали возраст так -> user.userAge = 23;
        // но напрямую обратиться к полю userAge мы не можем, 
        // потому что это поле private, но нам надо задать возраст
        // запускаем инкапсуляцию - обращаемся за помощью к методу setUserAge(int userAge)ведь он - public, 
        // и через public setUserAge(int userAge) задаем приватному полю значение 
        user.setUserAge(23);    

        // если бы метод work() был публичный, мы бы вызвали его так -> user.work()
        // но он private
        // запускаем инкапсуляцию -> обращаемся за помощью к публичному методу getWork()
        // который может вывести результат работы приватного метода work()
        user.getWork();
        
    }
}


        //инкапсуляция -> когда у нас в классе есть private поля, private методы и public методы. И private поля и private методы в клиентском коде мы можем вызвать только с помощью public метода класса
        // И из клиентского кода (main) мы не видим реализацию приватных методов и полей,

        // то есть инкапсуляция - это возможность обращаться к приватным полям и приватным методам класса с помощью публичного метода этого же класса

        // main
        // public metod позволяет работать(вызывать, измнять) private_pole и private_metod
        // User user = new User()
        // инкапсуляция -> user.public_metod(private_pole, private_metod)

        // class User
        // private_pole
        // private_metod
        // public_metod