package registerUser;

import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;

public class UserRegistration {

    public static void registerUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login == null || login.length() > 20 || !login.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания, и не превышать 20 символов.");
        }


        if (password == null || password.length() > 20 || !password.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания, и не превышать 20 символов.");
        }


        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают.");
        }

    }

}


