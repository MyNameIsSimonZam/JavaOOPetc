package service;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {
    List<T> getAll();

    void create(String firstName, String lastName, String patronymic, LocalDate dateOfBirth);
}
