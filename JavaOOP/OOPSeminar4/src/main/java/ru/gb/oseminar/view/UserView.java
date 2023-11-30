package ru.gb.oseminar.view;

import ru.gb.oseminar.data.User;

import java.util.List;

// UserView интерфейс, который отвечает только за отправку объектов пользователя на консоль
public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
