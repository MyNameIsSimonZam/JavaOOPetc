public class main {
    public static void main(String[] args) {
        // 1 ОСОБЕННОСТЬ - полиморфизм
        // создаем переменную родительского класса и кладем в нее экземпляр класса наследника

        // это позволит нам создать в родительском классе один метод для всех наследников
        People people = new Worker("Василий", "Петрович", "Моторный завод");


        // people_1 может использовать только методы родительского класса People
        People people_1 = new Driver("Петр", "Викторович", "Волга");
        people.man();

        // driver может использовать методы и родительского класса People и методы класса Driver
        Driver driver = new Driver("Николай", "Степанович", "Икарус");
        driver.man();
        driver.drive();


        People peoplee = new People("Виктор", "Викторович");
        People workerr = new Worker("Олег", "Петрович", "Заря");
        People driverr = new Driver("Инна", "Николаевна", "Вольво");

        // 2 ОСОБЕННОСТЬ -  один метод для экземпляров разных классов, как в интерфейсе
        System.out.println("//-----------------------------");
        peoplee.speak();
        workerr.speak();
        // в Driver мы не переопределили метод speak(), поэтому реализация как в родиьельском классе 
        driverr.speak();

        // People people = new Worker()
        // если слева имя родительского класса а справа наследника,
        // то родительский класс накладывает ограничения по вызываемым методам ->
        // нельзя вызвать методы класса наследника



        // 3 ОСОБЕННОСТЬ - самая главная
        // возможность передавать в один метод разные типы(People, Driver, Worker), если у типов есть один родитель

        // создаем одну функцию -> test()
        // в функции вызываем метод together(), который переопределен у каждого класса
        // получаем результат работы метода каждого класса 

        System.out.println("//-------//--------//---------");
        People p = new People("Анна", "Вячеславовна");
        Worker w = new Worker("Лев", "Анатольевич", "Янтарь");
        Driver d = new Driver("Михаил", "Степанович", "Паз");

        test(p);
        test(w);
        test(d);
    }

    public static void test(People people){
        people.together();
    }
}


















        // People people1 = new Worker("Василий", "Петрович", "Моторный завод");
        // People people2 = new Driver("Константин", "Степанович", "Лада");

        // System.out.println(people1);
        // System.out.println(people2);

        // people1.speak();