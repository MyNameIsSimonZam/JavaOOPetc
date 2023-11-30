package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.User;

import java.time.LocalDate;

// UserController интерфейс, который отвечает только за создание пользователей
public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}


