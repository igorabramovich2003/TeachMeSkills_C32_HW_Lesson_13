package com.teachmeskills.lesson_13.service;

import com.teachmeskills.lesson_13.exception.WrongPasswordException;
import com.teachmeskills.lesson_13.validator.PasswordValidator;

import java.util.Scanner;

public class PasswordCheckService {
    public static void PasswordCheck() {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String confirmPassword = scanner.nextLine();
        try{
            PasswordValidator.validatePassword(password, confirmPassword);
            System.out.println("Проверка паролей пройдена");
        }catch (WrongPasswordException e) {
            System.out.println("Ошибка проверки паролей " + e.getMessage());
        }
    }
}

