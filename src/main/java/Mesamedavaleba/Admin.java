package Mesamedavaleba;

public class Admin extends User implements Access{
    @Override
    void displayRole() {
        System.out.println("Role: Admin");

    }

    @Override
    public void checkAccess() {
        System.out.println("Access granted");
    }
}
