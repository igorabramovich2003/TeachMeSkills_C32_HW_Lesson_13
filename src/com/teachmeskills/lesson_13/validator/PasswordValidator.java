package com.teachmeskills.lesson_13.validator;

import com.teachmeskills.lesson_13.exception.WrongPasswordException;

public class PasswordValidator {
    public static void validatePassword(String password, String confirmPassword)
            throws WrongPasswordException {
        if (password == null || !password.equals(confirmPassword) || password.length() >= 20 || password.contains(" ") || password.chars().noneMatch(Character::isDigit)) {
            throw new WrongPasswordException("WrongPasswordException");
        }
    }
}
