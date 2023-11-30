Принцип единственной ответственности (SRP):

// UserController интерфейс, который отвечает только за создание пользователей
public interface UserController<T extends User> {
void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}

// StudentController реализует UserController и отвечает за взаимодействие с объектами Student
public class StudentController implements UserController<Student> {
private final StudentService dataService = new StudentService();
private final StudentGroupService studentGroupService = new StudentGroupService();
private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        updateView(dataService.getAll());
    }

    // Метод для обновления представления
    private void updateView(List<Student> students) {
        studentView.sendOnConsole(students);
    }
    // ...
}

Принцип подстановки Барбары Лисков (LSP):

// StudentGroupIterator теперь реализует интерфейс Iterator<Student> вместо Iterator,
// что обеспечивает подстановку для итератора в коллекции StudentGroup.
public class StudentGroupIterator implements Iterator<Student> {
// ...
}
Принцип разделения интерфейса (ISP):

// UserView интерфейс, который отвечает только за отправку объектов пользователя на консоль
public interface UserView<T extends User> {
void sendOnConsole(List<T> list);
}

// StudentView реализует UserView и отвечает за вывод объектов Student
public class StudentView implements UserView<Student> {
// ...
}
Принцип инверсии зависимостей (DIP):

// StudentController не зависит от конкретных реализаций сервисов, а только от их интерфейсов.
// Это позволяет легко заменять реализации без изменения контроллера.
public class StudentController implements UserController<Student> {
private final UserService<Student> dataService = new StudentService();
private final UserGroupService<Student> studentGroupService = new StudentGroupService();
private final UserView<Student> studentView = new StudentView();
// ...
}