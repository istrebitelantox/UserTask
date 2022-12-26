package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        String[] names={"yura","dima","pasha","kolya","petya","vasya","misha","vanya","vova","polya"};
        int[] arr=new Random().ints(0,99).distinct().limit(10).toArray();
        ArrayList<String>users=new ArrayList<String>();
        for(int i=0;i<10;i++){
            user.setId(arr[i]);
            user.setName(names[(int)(Math.random()*10)]);
            user.setAge((int)(Math.random()*100));
            users.add(i,user.getId()+" "+user.getName()+" "+user.getAge());
            System.out.println(users.get(i));
        }
        System.out.println(users);

    }
}