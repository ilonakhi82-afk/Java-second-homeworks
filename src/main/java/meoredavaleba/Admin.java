package meoredavaleba;

public class Admin extends User {
    void deleteUser(String username) {
        if (!username.isEmpty()){
            System.out.println("User deleted: " + username);
        }else{
            System.out.println("Invalid username");
        }
    }
}
