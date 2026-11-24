package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        User user1 = new User();
        user1.setName("Nino");
        user1.setAge(25);
        user1.setPassword("Ninoni12");
        user1.validateUser();

        User user2 =new User();
        user2.setName("Maka");
        user2.setAge(35);
        user2.setPassword("Maka1234");
        user2.validateUser();
    }


    }

