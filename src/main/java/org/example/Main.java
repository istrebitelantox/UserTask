package org.example;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        GeneratorUser generatorUser=new GeneratorUser();
        User yura=new User();
        System.out.println(yura);
        User kolya=yura.withName("Kolya");
        System.out.println(kolya);
        List<User> users=generatorUser.newUser();
        System.out.println(users);
    }
}