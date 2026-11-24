package org.example;

import java.security.spec.RSAOtherPrimeInfo;

public class User {
       private String username;
       private String password;
       private int age;

    public void setName(String name) {
        this.username = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void validateUser(){
        if (!username.isEmpty() && password.length()<= 8 && age > 18){
            System.out.println("User validation passed");
        }else{
            System.out.println("User validation failed");
        }

    }
}

