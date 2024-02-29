package HomeWork.W_02_16.Task1_2User;

public class User {
    private String login;
    private String password;
    private String email;


    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    // Геттеры и сеттеры для логина
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void changePassword(String oldPassword, String newPassword) {
        // Проверяем, совпадает ли введенный старый пароль с текущим паролем пользователя
        if (oldPassword.equals(password)) {
            // Проверяем, соответствует ли новый пароль определенным требованиям безопасности
            if (isPasswordSecure(newPassword)) {
                password = newPassword;
                System.out.println("Пароль успешно изменен");
            } else {
                System.out.println("Новый пароль не соответствует требованиям безопасности");
            }
        } else {
            System.out.println("Неправильный старый пароль");
        }
    }


    private boolean isPasswordSecure(String password) {

        return password.length() >= 6; // Простая проверка: минимальная длина пароля 6 символов
    }
}


