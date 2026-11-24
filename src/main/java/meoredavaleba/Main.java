package meoredavaleba;

public class Main {
    static void main() {

        Admin admin1 = new Admin();
        admin1.username = ("Mariami");
        admin1.email = ("mariami123@gmail.com");
        admin1.displayUserInfo();
        admin1.deleteUser("Mariami");


    }
}
