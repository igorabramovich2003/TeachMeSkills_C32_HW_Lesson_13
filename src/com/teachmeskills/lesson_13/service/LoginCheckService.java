package com.teachmeskills.lesson_13.service;

import com.teachmeskills.lesson_13.exception.WrongLoginException;
import com.teachmeskills.lesson_13.validator.LoginValidator;

import java.util.Scanner;

public class LoginCheckService {
    public static void LoginCheck() {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        try {
            LoginValidator.validateLogin(login);
            System.out.println("Проверка логина пройдена");
        }catch (WrongLoginException e){
            System.out.println("Ошибка проверки логина " + e.getMessage());
        }
    }
}
