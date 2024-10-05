import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;

import static registerUser.UserRegistration.registerUser;

public class Main {
    public static void main(String[] args) {
        try {
            registerUser("yari1234", "123456789", "123456789");
            System.out.println("Пользователь успешно зарегистрирован!");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка регистрации: " + e.getMessage());
        }
    }
}