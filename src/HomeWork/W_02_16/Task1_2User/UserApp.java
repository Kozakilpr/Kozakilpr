package HomeWork.W_02_16.Task1_2User;

public class UserApp {
    public static void main(String[] args) {

    User user = new User("Kyiv", "password123", "nam@ukr.com");


    user.changePassword("password123", "newPassword456");


    user.changePassword("newPassword456", "newPassword456");


    user.changePassword("newPassword456", "newPassword456");
}

}
